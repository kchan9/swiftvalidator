package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt586AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6 });
				add(new Integer[] { 6, 7, 8, 12, 13 });
				add(new Integer[] { 7, 8, 12, 13 });
				add(new Integer[] { 9, 10 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 8, 12, 13 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16, 80 });
				add(new Integer[] { 17, 21, 22, 23 });
				add(new Integer[] { 18, 19 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21, 22, 23, 17 });

				add(new Integer[] { 22, 23 }); // 21
				add(new Integer[] { 22, 23 });
				add(new Integer[] { 23, 24, 25, 26 });
				add(new Integer[] { 25, 26 });
				add(new Integer[] { 26 }); // 25
				add(new Integer[] { 27, 41 });
				add(new Integer[] { 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 });
				add(new Integer[] { 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 });
				add(new Integer[] { 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 });
				add(new Integer[] { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 });

				add(new Integer[] { 32, 33, 34, 35, 36, 37, 38, 39, 40 }); // 31
				add(new Integer[] { 32, 33, 34, 35, 36, 37, 38, 39, 40 });
				add(new Integer[] { 33, 34, 35, 36, 37, 38, 39, 40 });
				add(new Integer[] { 34, 35, 36, 37, 38, 39, 40 });
				add(new Integer[] { 35, 36, 37, 38, 39, 40 });
				add(new Integer[] { 36, 37, 38, 39, 40 });
				add(new Integer[] { 37, 38, 39, 40 });
				add(new Integer[] { 38, 39, 40 });
				add(new Integer[] { 40 });
				add(new Integer[] { 41 });

				add(new Integer[] { 41, 42 }); // 41
				add(new Integer[] { 43 });
				add(new Integer[] { 44, 45, 46, 47, 54 });
				add(new Integer[] { 45, 46, 47, 54 });
				add(new Integer[] { 46, 47, 54 });
				add(new Integer[] { 47, 54 });
				add(new Integer[] { 48, 49, 50, 51, 52, 53 });
				add(new Integer[] { 49, 50, 51, 52, 53 });
				add(new Integer[] { 50, 51, 52, 53 });
				add(new Integer[] { 51, 52, 53 });

				add(new Integer[] { 52, 53 }); // 51
				add(new Integer[] { 53 });
				add(new Integer[] { 47, 54 });
				add(new Integer[] { 55, 64 });
				add(new Integer[] { 56, 57, 58, 59, 60, 61, 62, 63 });
				add(new Integer[] { 57, 58, 59, 60, 61, 62, 63 });
				add(new Integer[] { 57, 58, 59, 60, 61, 62, 63 });
				add(new Integer[] { 58, 59, 60, 61, 62, 63 });
				add(new Integer[] { 59, 60, 61, 62, 63 });
				add(new Integer[] { 61, 62, 63 });

				add(new Integer[] { 61, 62, 63 }); // 61
				add(new Integer[] { 63 });
				add(new Integer[] { 64 });
				add(new Integer[] { 65 });
				add(new Integer[] { 65, 66 });
				add(new Integer[] { 67 });
				add(new Integer[] { 67, 68, 69, 70, 71, 72 });
				add(new Integer[] { 69, 70, 71, 72 });
				add(new Integer[] { 70, 71, 72 });
				add(new Integer[] { 71, 72 });

				add(new Integer[] { 71, 72 }); // 71
				add(new Integer[] { 73, 66, 78 });
				add(new Integer[] { 74 });
				add(new Integer[] { 74, 75, 76, 77 });
				add(new Integer[] { 76, 77 });
				add(new Integer[] { 77 });
				add(new Integer[] { 73, 78 });
				add(new Integer[] { 79 });
				add(new Integer[] { 80, 16 });
				add(new Integer[] { 81, 82 });

				add(new Integer[] { 81, 82 }); // 81
				add(new Integer[] {});
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
