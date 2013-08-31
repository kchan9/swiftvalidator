package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt548AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 5, 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11, 15 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 11, 15 });
				add(new Integer[] { 9, 16 });
				add(new Integer[] { 17, 33 });
				add(new Integer[] { 18, 19 });
				add(new Integer[] { 18, 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 20, 21, 22, 23 });

				add(new Integer[] { 21, 22, 23 }); // 21
				add(new Integer[] { 23 });
				add(new Integer[] { 24 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 25, 26, 27, 32 });
				add(new Integer[] { 27, 32 });
				add(new Integer[] { 28 });
				add(new Integer[] { 29, 30, 31 });
				add(new Integer[] { 30, 31 });
				add(new Integer[] { 31 });

				add(new Integer[] { 27, 32 }); // 31
				add(new Integer[] { 33 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] {}); // 35

			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
