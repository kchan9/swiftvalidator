package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt526AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2, 3 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 6, 7 });
				add(new Integer[] { 5, 6, 7 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8, 9, 10, 11, 12 });
				add(new Integer[] { 9, 10, 11, 12 });
				add(new Integer[] { 10, 11, 12 });
				add(new Integer[] { 11, 12 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 7 }); // 12
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
