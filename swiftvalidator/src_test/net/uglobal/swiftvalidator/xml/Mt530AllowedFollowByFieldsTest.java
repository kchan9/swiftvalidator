package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt530AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 6 });
				add(new Integer[] { 5, 6 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 9, 10 });
				add(new Integer[] { 10, 11, 16 });

				add(new Integer[] { 12, 13, 14 }); // 11
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 11, 16 });
				add(new Integer[] { 8, 17 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 21, 22, 23, 24, 25 });

				add(new Integer[] { 22, 23, 24, 25 }); // 21
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 17 });
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
