package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt542AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 6, 12 });
				add(new Integer[] { 5, 6, 12 });
				add(new Integer[] { 5, 6, 12 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10, 11 });
				add(new Integer[] { 11 });

				add(new Integer[] { 6, 12 }); //11
				add(new Integer[] { 13 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 15, 16, 17, 18 });
				add(new Integer[] { 17, 18 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19, 33, 34, 35, 36, 37 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });

				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 }); //21
				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 28, 29, 30, 31, 32 });
				add(new Integer[] { 29, 30, 31, 32 });
				add(new Integer[] { 30, 31, 32 });

				add(new Integer[] { 32 }); //31
				add(new Integer[] { 33, 34, 35, 36, 37 });
				add(new Integer[] { 33, 34, 35, 36, 37 });
				add(new Integer[] { 35, 36, 37 });
				add(new Integer[] { 35, 36, 37 });
				add(new Integer[] { 36, 37 });
				add(new Integer[] { 38 });
				add(new Integer[] { 39 });
				add(new Integer[] { 39, 40, 41, 42, 43 });
				add(new Integer[] { 41, 42, 43 });

				add(new Integer[] { 41, 42, 43 }); //41
				add(new Integer[] { 43 });
				add(new Integer[] { 43, 44, 45, 52 });
				add(new Integer[] { 45, 52 });
				add(new Integer[] { 46, 47, 48, 49, 50, 51 });
				add(new Integer[] { 47, 48, 49, 50, 51 });
				add(new Integer[] { 48, 49, 50, 51 });
				add(new Integer[] { 49, 50, 51 });
				add(new Integer[] { 50, 51 });
				add(new Integer[] { 51 });

				add(new Integer[] { 45, 52 }); //51
				add(new Integer[] { 53, 62 });
				add(new Integer[] { 54, 55, 56, 57, 58, 59, 60, 61 });
				add(new Integer[] { 54, 55, 56, 57, 58, 59, 60, 61 });
				add(new Integer[] { 55, 56, 57, 58, 59, 60, 61 });
				add(new Integer[] { 56, 57, 58, 59, 60, 61 });
				add(new Integer[] { 57, 58, 59, 60, 61 });
				add(new Integer[] { 58, 59, 60, 61 });
				add(new Integer[] { 59, 60, 61 });
				add(new Integer[] { 61 });

				add(new Integer[] { 62 }); // 61
				add(new Integer[] { 63 });
				add(new Integer[] { 63, 64 });
				add(new Integer[] { 65 });
				add(new Integer[] { 65, 66, 67, 68, 69, 70 });
				add(new Integer[] { 67, 68, 69, 70 });
				add(new Integer[] { 68, 69, 70 });
				add(new Integer[] { 69, 70 });
				add(new Integer[] { 69, 70 });
				add(new Integer[] { 64, 71, 76, 81 });

				add(new Integer[] { 72 }); // 71
				add(new Integer[] { 72, 73, 74, 75 });
				add(new Integer[] { 73, 74, 75 });
				add(new Integer[] { 74, 75 });
				add(new Integer[] { 71, 76, 81 });
				add(new Integer[] { 77, 78 });
				add(new Integer[] { 77, 78 });
				add(new Integer[] { 78, 79, 80 });
				add(new Integer[] { 80 });
				add(new Integer[] { 76, 81 });

				add(new Integer[] { 82 }); // 81
				add(new Integer[] { 83 });
				add(new Integer[] { 83, 84, 85, 86, 87 });
				add(new Integer[] { 85, 86, 87 });
				add(new Integer[] { 86, 87, 85 });
				add(new Integer[] { 87 });
				add(new Integer[] { 82 }); // 82
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}

}
