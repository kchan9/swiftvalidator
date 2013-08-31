package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt507AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 2, 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5, 6, 7, 8, 9 });
				add(new Integer[] { 6, 7, 8, 9 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 4, 10, 11 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 12, 13 });
				add(new Integer[] { 14, 15, 16 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 17, 18 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19 });
				add(new Integer[] { 16, 20 });
				add(new Integer[] { 21, 46 });

				add(new Integer[] { 22 }); // 21
				add(new Integer[] { 23 });
				add(new Integer[] { 24 });
				add(new Integer[] { 25, 26, 27, 45 });
				add(new Integer[] { 26, 27, 45 });
				add(new Integer[] { 27, 45 });
				add(new Integer[] { 28, 36, 44 });
				add(new Integer[] { 29 });
				add(new Integer[] { 29, 30, 35 });
				add(new Integer[] { 31 });

				add(new Integer[] { 31, 32, 33, 34 }); // 31
				add(new Integer[] { 33, 34 });
				add(new Integer[] { 34 });
				add(new Integer[] { 30, 35 });
				add(new Integer[] { 36, 44 });
				add(new Integer[] { 37, 38, 43 });
				add(new Integer[] { 38, 43 });
				add(new Integer[] { 39 });
				add(new Integer[] { 39, 40, 41, 42 });
				add(new Integer[] { 40, 41, 42 });

				add(new Integer[] { 42 }); // 41
				add(new Integer[] { 43, 38 });
				add(new Integer[] { 44 });
				add(new Integer[] { 45 });
				add(new Integer[] { 21, 46 });
				add(new Integer[] { 47, 48 });
				add(new Integer[] { 47, 48 });
				add(new Integer[] {}); // 48

			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}

}
