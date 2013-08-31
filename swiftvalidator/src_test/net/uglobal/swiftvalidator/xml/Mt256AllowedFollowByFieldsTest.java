package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt256AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2, 3 });//1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 6, 7 });
				add(new Integer[] { 5, 6, 7 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9, 10, 11, 12, 13 });
				add(new Integer[] { 10, 11, 12, 13 });
				add(new Integer[] { 11, 12, 13 });
				add(new Integer[] { 12, 13 });
				add(new Integer[] { 3, 13 });
				add(new Integer[] { 14, 15, 16, 17, 18, 19, 20 });
				add(new Integer[] { 15, 16, 17, 18, 19, 20 });
				add(new Integer[] { 16, 17, 18, 19, 20 });
				add(new Integer[] { 17, 18, 19, 20 });
				add(new Integer[] { 18, 19, 20 });
				add(new Integer[] { 19, 20 });
				add(new Integer[] { 20 });
				add(new Integer[] {});
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
