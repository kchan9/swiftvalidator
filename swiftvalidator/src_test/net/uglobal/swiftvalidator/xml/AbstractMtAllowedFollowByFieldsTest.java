package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.uglobal.swiftvalidator.xml.beans.Field;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public abstract class AbstractMtAllowedFollowByFieldsTest {

	private String mtTag = null;
	private static final String MT_TAG = "%MT%";
	private static final String CLASS_FILE_PATH = "swift_library/mt" + MT_TAG + "_schema.xml";
	private static final String CLASS_FILE_PREFIX = "Mt";
	private static final String CLASS_FILE_SUFFIX = "AllowedFollowByFieldsTest";

	protected List<Integer[]> allowedList;

	@BeforeClass
	public void beforeClass() {
		allowedList = getAllowedList();
	}

	@Test
	public void testFieldsSequence() throws FileNotFoundException {
		String s = getClass().getSimpleName();
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(getResourcePath());
		XmlBeanParser parser = new XmlBeanParser(in);
		parser.parse();

		MTMessage mtMessage = parser.getMTMessageXmlBean();
		System.out.println(mtTag);
		System.out.println(mtMessage.getId());

		// Test 1
		Assert.assertEquals(mtMessage.getId(), mtTag, "Found inconsistent MT.  (mtTag=" + mtTag + ", mtMessage.getId()=" + mtMessage.getId() + ")");

		List<Field> list = parser.getFieldList();
		for (int i = 0; i < list.size(); i++) {
			Field field = list.get(i);
			List<Field> actualAllowedFields = field.getAllowedFollowByFields();
			Integer[] expectedAllowedFieldIds = allowedList.get(i);

			StringBuilder msg = new StringBuilder();
			msg.append("\nFAILED at fId=" + field.getId()).append("\n").append("actual   = " + getActualFIds(actualAllowedFields)).append("\n")
					.append("expected = " + getExpectedFIds(expectedAllowedFieldIds)).append("\n");

			// Test 2
			Assert.assertTrue(expectedAllowedFieldIds.length == actualAllowedFields.size(), msg.toString());

			for (Field f : actualAllowedFields) {
				Integer fId = f.getId();

				List<Integer> l = Arrays.asList(expectedAllowedFieldIds);

				StringBuilder sb = new StringBuilder();
				sb.append("\nFAILED at fId=" + field.getId()).append("\n").append("actual   = " + getActualFIds(actualAllowedFields)).append("\n")
						.append("expected = " + getExpectedFIds(expectedAllowedFieldIds)).append("\n");

				// Test3
				Assert.assertTrue(l.contains(fId), sb.toString());

			}
		}
	}

	private String getActualFIds(List<Field> actualAllowedFields) {
		StringBuilder sb = new StringBuilder();
		for (Field f : actualAllowedFields) {
			sb.append(f.getId()).append(",");
		}
		return sb.toString();
	}

	private String getExpectedFIds(Integer[] expectedAllowedFieldIds) {
		StringBuilder sb = new StringBuilder();
		for (Integer i : expectedAllowedFieldIds) {
			sb.append(i).append(",");
		}
		return sb.toString();
	}

	private String getResourcePath() {
		mtTag = getClass().getSimpleName().replaceFirst(CLASS_FILE_PREFIX, "").replaceFirst(CLASS_FILE_SUFFIX, "");
		return CLASS_FILE_PATH.replace(MT_TAG, mtTag);
	}

	// -- 
	protected abstract ArrayList<Integer[]> getAllowedList();

}
