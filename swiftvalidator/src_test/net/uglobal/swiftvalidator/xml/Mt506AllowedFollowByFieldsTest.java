package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt506AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7, 8, 9, 10 });
				add(new Integer[] { 7, 8, 9, 10 });
				add(new Integer[] { 8, 9, 10 });
				add(new Integer[] { 9, 10 });
				add(new Integer[] { 10 });
				add(new Integer[] { 5, 12, 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 13, 14, 15, 19 });
				add(new Integer[] { 15, 19 });
				add(new Integer[] { 17, 16 });
				add(new Integer[] { 17 });
				add(new Integer[] { 18 });
				add(new Integer[] { 15, 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21 });

				add(new Integer[] { 22 }); // 21
				add(new Integer[] { 22, 23 });
				add(new Integer[] { 27, 24, 23 });
				add(new Integer[] { 25, 26 });
				add(new Integer[] { 25, 26 });
				add(new Integer[] { 27 });
				add(new Integer[] { 28, 57, 86 });
				add(new Integer[] { 29, 30 });
				add(new Integer[] { 29, 30 });
				add(new Integer[] { 31, 32, 33 });

				add(new Integer[] { 32, 33 }); // 31
				add(new Integer[] { 32, 33 });
				add(new Integer[] { 33, 34, 35, 36 });
				add(new Integer[] { 35, 36 });
				add(new Integer[] { 36 });
				add(new Integer[] { 36, 37, 38, 44, 51, 56 });
				add(new Integer[] { 38, 44, 51, 56 });
				add(new Integer[] { 39 });
				add(new Integer[] { 40 });
				add(new Integer[] { 41 });

				add(new Integer[] { 42 }); // 41
				add(new Integer[] { 43 });
				add(new Integer[] { 44, 51, 56 });
				add(new Integer[] { 45 });
				add(new Integer[] { 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 46, 47, 48, 49, 50 });
				add(new Integer[] { 48, 49, 50 });
				add(new Integer[] { 49, 50 });
				add(new Integer[] { 50 });
				add(new Integer[] { 51, 56 });

				add(new Integer[] { 52 }); // 51
				add(new Integer[] { 52, 53 });
				add(new Integer[] { 54, 53 });
				add(new Integer[] { 55 });
				add(new Integer[] { 56 });
				add(new Integer[] { 28, 57, 86 });
				add(new Integer[] { 58 });
				add(new Integer[] { 59 });
				add(new Integer[] { 60, 61 });
				add(new Integer[] { 61 });

				add(new Integer[] { 61, 62, 63, 64 }); // 61
				add(new Integer[] { 63, 64 });
				add(new Integer[] { 64 });
				add(new Integer[] { 64, 65, 74, 79, 85 });
				add(new Integer[] { 66 });
				add(new Integer[] { 67 });
				add(new Integer[] { 68 });
				add(new Integer[] { 69 });
				add(new Integer[] { 70, 71, 72, 73 });
				add(new Integer[] { 71, 72, 73 });

				add(new Integer[] { 71, 72, 73 }); // 71
				add(new Integer[] { 73 });
				add(new Integer[] { 74, 79, 85 });
				add(new Integer[] { 75 });
				add(new Integer[] { 76 });
				add(new Integer[] { 77, 78 });
				add(new Integer[] { 78 });
				add(new Integer[] { 79, 85 });
				add(new Integer[] { 80 });
				add(new Integer[] { 81 });

				add(new Integer[] { 81, 82 }); // 81
				add(new Integer[] { 83 });
				add(new Integer[] { 84 });
				add(new Integer[] { 85 });
				add(new Integer[] { 86, 57 });
				add(new Integer[] { 87, 88, 89 });
				add(new Integer[] { 87, 88, 89 });
				add(new Integer[] { 88, 89 });
				add(new Integer[] {}); // 89
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}

}
