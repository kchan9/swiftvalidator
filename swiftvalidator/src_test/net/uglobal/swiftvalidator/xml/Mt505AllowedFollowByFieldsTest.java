package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt505AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

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
				add(new Integer[] { 12, 13, 14, 18 });
				add(new Integer[] { 14, 18 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17 });
				add(new Integer[] { 14, 18 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21 });

				add(new Integer[] { 21, 22, 23, 36, 49, 55 }); // 21
				add(new Integer[] { 23, 36, 49, 55 });
				add(new Integer[] { 24 });
				add(new Integer[] { 25 });
				add(new Integer[] { 26, 27, 35 });
				add(new Integer[] { 27, 35 });
				add(new Integer[] { 28 });
				add(new Integer[] { 28, 29, 34 });
				add(new Integer[] { 30 });
				add(new Integer[] { 30, 31, 32, 33 });

				add(new Integer[] { 32, 33 }); //31
				add(new Integer[] { 33 });
				add(new Integer[] { 29, 34 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36, 49, 55 });
				add(new Integer[] { 37 });
				add(new Integer[] { 38 });
				add(new Integer[] { 39, 40, 48 }); // 38
				add(new Integer[] { 40, 48 }); // 39
				add(new Integer[] { 41, 42, 47 }); // 40

				add(new Integer[] { 42, 47 }); // 41
				add(new Integer[] { 43 });
				add(new Integer[] { 43, 44, 45, 46 });
				add(new Integer[] { 44, 45, 46 });
				add(new Integer[] { 46 });
				add(new Integer[] { 42, 47 }); // 46
				add(new Integer[] { 48 });
				add(new Integer[] { 49, 55 });
				add(new Integer[] { 50 });
				add(new Integer[] { 51 });

				add(new Integer[] { 51, 52 }); // 51
				add(new Integer[] { 53 });
				add(new Integer[] { 54 });
				add(new Integer[] { 55 });
				add(new Integer[] { 19, 56, 64, 72 });
				add(new Integer[] { 57 });
				add(new Integer[] { 57, 58, 63 });
				add(new Integer[] { 59 });
				add(new Integer[] { 59, 60, 61, 62 });
				add(new Integer[] { 61, 62 });

				add(new Integer[] { 62 }); // 61
				add(new Integer[] { 63, 58 });
				add(new Integer[] { 64, 72 });
				add(new Integer[] { 65, 66, 71 });
				add(new Integer[] { 66, 71 });
				add(new Integer[] { 67 });
				add(new Integer[] { 67, 68, 69, 70 });
				add(new Integer[] { 68, 69, 70 });
				add(new Integer[] { 70 });
				add(new Integer[] { 71, 66 });

				add(new Integer[] { 72 }); // 71
				add(new Integer[] { 73, 74 });
				add(new Integer[] { 73, 74 });
				add(new Integer[] {}); // 74
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}

}
