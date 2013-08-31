package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt578AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 10 });
				add(new Integer[] { 5, 10 });
				add(new Integer[] { 6, 7, 8 });
				add(new Integer[] { 7, 8 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 5, 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12, 13 }); // 11
				add(new Integer[] { 12, 13 });
				add(new Integer[] { 13, 14, 15, 16 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 31 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 });

				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29, 30 }); // 21
				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29, 30 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29, 30 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30 });
				add(new Integer[] { 25, 26, 27, 28, 29, 30 });
				add(new Integer[] { 26, 27, 28, 29, 30 });
				add(new Integer[] { 27, 28, 29, 30 });
				add(new Integer[] { 28, 29, 30 });
				add(new Integer[] { 30 });
				add(new Integer[] { 31 });

				add(new Integer[] { 31, 32 }); // 31
				add(new Integer[] { 33 });
				add(new Integer[] { 34 });
				add(new Integer[] { 35, 36, 37 });
				add(new Integer[] { 36, 37 });
				add(new Integer[] { 37 });
				add(new Integer[] { 37, 38, 39, 46 });
				add(new Integer[] { 46, 39 });
				add(new Integer[] { 40, 41, 42, 43, 44, 45 });
				add(new Integer[] { 41, 42, 43, 44, 45 });

				add(new Integer[] { 42, 43, 44, 45 }); // 41
				add(new Integer[] { 43, 44, 45 });
				add(new Integer[] { 44, 45 });
				add(new Integer[] { 45 });
				add(new Integer[] { 46, 39 });
				add(new Integer[] { 47, 56 });
				add(new Integer[] { 48, 49, 50, 51, 52, 53, 54, 55 });
				add(new Integer[] { 49, 50, 51, 52, 53, 54, 55 });
				add(new Integer[] { 49, 50, 51, 52, 53, 54, 55 });
				add(new Integer[] { 50, 51, 52, 53, 54, 55 });

				add(new Integer[] { 51, 52, 53, 54, 55 }); // 51 
				add(new Integer[] { 53, 54, 55 });
				add(new Integer[] { 53, 54, 55 });
				add(new Integer[] { 55 });
				add(new Integer[] { 56 });
				add(new Integer[] { 57 });
				add(new Integer[] { 57, 58 });
				add(new Integer[] { 59 });
				add(new Integer[] { 59, 60, 61, 62, 63, 64 });
				add(new Integer[] { 61, 62, 63, 64 });

				add(new Integer[] { 62, 63, 64 }); // 61
				add(new Integer[] { 63, 64 });
				add(new Integer[] { 63, 64 });
				add(new Integer[] { 65, 58, 70, 75 });
				add(new Integer[] { 66 });
				add(new Integer[] { 66, 67, 68, 69 });
				add(new Integer[] { 67, 68, 69 });
				add(new Integer[] { 68, 69 });
				add(new Integer[] { 65, 70, 75 });
				add(new Integer[] { 71 });

				add(new Integer[] { 71, 72, 73, 74 }); // 71
				add(new Integer[] { 73, 74 });
				add(new Integer[] { 74 });
				add(new Integer[] { 70, 75 });
				add(new Integer[] { 76 });
				add(new Integer[] { 77, 78 });
				add(new Integer[] { 77, 78 });
				add(new Integer[] {}); // 78

			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}

}
