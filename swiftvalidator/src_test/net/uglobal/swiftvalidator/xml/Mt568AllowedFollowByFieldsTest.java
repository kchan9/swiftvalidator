package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt568AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 2, 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5, 6, 11 });
				add(new Integer[] { 6, 11 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 6, 11 });

				add(new Integer[] { 12, 28 }); // 11
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15, 16, 17, 26, 27 });
				add(new Integer[] { 16, 17, 26, 27 });
				add(new Integer[] { 17, 26, 27 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 21, 22, 23, 24, 25 });

				add(new Integer[] { 22, 23, 24, 25 }); // 21
				add(new Integer[] { 22, 23, 24, 25 });
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 26, 27 });
				add(new Integer[] { 26, 27 });
				add(new Integer[] { 28 });
				add(new Integer[] { 29 });
				add(new Integer[] { 29, 30, 31 });
				add(new Integer[] { 30, 31 });

				add(new Integer[] {}); // 31
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
