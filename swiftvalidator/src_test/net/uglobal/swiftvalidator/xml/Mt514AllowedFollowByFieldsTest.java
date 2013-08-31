package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt514AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7, 12 });
				add(new Integer[] { 6, 7, 12 });
				add(new Integer[] { 8, 9, 10 });
				add(new Integer[] { 9, 10 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 7, 12 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 14, 15, 16, 17, 18, 19, 20 });
				add(new Integer[] { 15, 16, 17, 18, 19, 20 });
				add(new Integer[] { 16, 17, 18, 19, 20 });
				add(new Integer[] { 17, 18, 19, 20 });
				add(new Integer[] { 18, 19, 20 });
				add(new Integer[] { 19, 20 });
				add(new Integer[] { 20, 21, 22 });

				add(new Integer[] { 22 }); // 21
				add(new Integer[] { 23 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 26, 27, 28, 29 });
				add(new Integer[] { 27, 28, 29 });
				add(new Integer[] { 27, 28, 29 });
				add(new Integer[] { 29 });
				add(new Integer[] { 22, 30 });
				add(new Integer[] { 30, 31 });

				add(new Integer[] { 32, 46, 47, 48 }); // 31
				add(new Integer[] { 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 37, 38, 39, 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 37, 38, 39, 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 38, 39, 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 39, 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 40, 41, 42, 43, 44, 45 });

				add(new Integer[] { 41, 42, 43, 44, 45 }); // 41
				add(new Integer[] { 42, 43, 44, 45 });
				add(new Integer[] { 43, 44, 45 });
				add(new Integer[] { 45 });
				add(new Integer[] { 46, 47, 48 }); // 45
				add(new Integer[] { 46, 47, 48 });
				add(new Integer[] { 48 });
				add(new Integer[] { 49, 79, 73 });
				add(new Integer[] { 50 });
				add(new Integer[] { 59, 50, 51, 52, 72, 66 });

				add(new Integer[] { 59, 52, 72, 66 }); // 51
				add(new Integer[] { 53 });
				add(new Integer[] { 53, 54, 55, 56, 57, 58 });
				add(new Integer[] { 55, 56, 57, 58 });
				add(new Integer[] { 56, 57, 58 });
				add(new Integer[] { 57, 58 });
				add(new Integer[] { 57, 58 });
				add(new Integer[] { 52, 59, 66, 72 });
				add(new Integer[] { 60 });
				add(new Integer[] { 60, 61, 62, 63, 64, 65 });

				add(new Integer[] { 61, 62, 63, 64, 65 }); // 61
				add(new Integer[] { 63, 64, 65 });
				add(new Integer[] { 64, 65 });
				add(new Integer[] { 65 });
				add(new Integer[] { 72, 66, 59 });
				add(new Integer[] { 67, 68 });
				add(new Integer[] { 67, 68 });
				add(new Integer[] { 68, 69, 70, 71 });
				add(new Integer[] { 70, 71 });
				add(new Integer[] { 71 });

				add(new Integer[] { 72, 66 }); // 71
				add(new Integer[] { 73, 79 });
				add(new Integer[] { 74 });
				add(new Integer[] { 74, 75, 76, 77, 78 });
				add(new Integer[] { 75, 76, 77, 78 }); // 75
				add(new Integer[] { 77, 78 });
				add(new Integer[] { 78 });
				add(new Integer[] { 73, 79 });
				add(new Integer[] { 80, 81, 82, 83, 84, 85, 86, 87 });
				add(new Integer[] { 80, 81, 82, 83, 84, 85, 86, 87 });

				add(new Integer[] { 81, 82, 83, 84, 85, 86, 87 }); // 81
				add(new Integer[] { 82, 83, 84, 85, 86, 87 });
				add(new Integer[] { 83, 84, 85, 86, 87 });
				add(new Integer[] { 84, 85, 86, 87 });
				add(new Integer[] { 85, 86, 87 });
				add(new Integer[] { 87 });
				add(new Integer[] {}); // 87
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
