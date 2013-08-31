package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt513AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 10 });
				add(new Integer[] { 7, 8 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 6, 10 });
				add(new Integer[] { 11, 21 });

				add(new Integer[] { 12, 19 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15, 16, 17, 18 });
				add(new Integer[] { 15, 16, 17, 18 });
				add(new Integer[] { 17, 18 });
				add(new Integer[] { 18 });
				add(new Integer[] { 12, 19 });
				add(new Integer[] { 19, 20 });
				add(new Integer[] { 21 });

				add(new Integer[] { 22 }); // 21
				add(new Integer[] { 22, 23 });
				add(new Integer[] { 23, 24, 31, 32, 33, 34, 35 });
				add(new Integer[] { 25 });
				add(new Integer[] { 26, 27, 28, 29, 30 });
				add(new Integer[] { 27, 28, 29, 30 });
				add(new Integer[] { 28, 29, 30 });
				add(new Integer[] { 29, 30 });
				add(new Integer[] { 30 });
				add(new Integer[] { 24, 31, 32, 33, 34, 35 });

				add(new Integer[] { 31, 32, 33, 34, 35 }); // 31
				add(new Integer[] { 32, 33, 34, 35 });
				add(new Integer[] { 33, 34, 35 });
				add(new Integer[] { 35 });
				add(new Integer[] { 35, 36, 37 });
				add(new Integer[] { 37 });
				add(new Integer[] { 38 });
				add(new Integer[] { 38, 39, 40, 41, 42, 43, 44 });
				add(new Integer[] { 39, 40, 41, 42, 43, 44 });
				add(new Integer[] { 41, 42, 43, 44 });

				add(new Integer[] { 42, 43, 44 }); // 41
				add(new Integer[] { 42, 43, 44 });
				add(new Integer[] { 43, 44 });
				add(new Integer[] { 37, 45 });
				add(new Integer[] { 46 });
				add(new Integer[] { 47, 61, 62, 63 });
				add(new Integer[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 });
				add(new Integer[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 });
				add(new Integer[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 });
				add(new Integer[] { 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 });

				add(new Integer[] { 52, 53, 54, 55, 56, 57, 58, 59, 60 }); // 51
				add(new Integer[] { 52, 53, 54, 55, 56, 57, 58, 59, 60 });
				add(new Integer[] { 53, 54, 55, 56, 57, 58, 59, 60 });
				add(new Integer[] { 54, 55, 56, 57, 58, 59, 60 });
				add(new Integer[] { 55, 56, 57, 58, 59, 60 });
				add(new Integer[] { 56, 57, 58, 59, 60 });
				add(new Integer[] { 57, 58, 59, 60 });
				add(new Integer[] { 58, 59, 60 });
				add(new Integer[] { 60 });
				add(new Integer[] { 61, 62, 63 });

				add(new Integer[] { 61, 62, 63 }); // 61
				add(new Integer[] { 63 });
				add(new Integer[] { 64, 88, 94 });
				add(new Integer[] { 65 });
				add(new Integer[] { 65, 66, 67, 74, 81, 87 });
				add(new Integer[] { 67, 74, 81, 87 });
				add(new Integer[] { 68 });
				add(new Integer[] { 68, 69, 70, 71, 72, 73 });
				add(new Integer[] { 70, 71, 72, 73 });
				add(new Integer[] { 71, 72, 73 });

				add(new Integer[] { 72, 73 }); // 71
				add(new Integer[] { 72, 73 });
				add(new Integer[] { 74, 67, 81, 87 });
				add(new Integer[] { 75 });
				add(new Integer[] { 75, 76, 77, 78, 79, 80 });
				add(new Integer[] { 76, 77, 78, 79, 80 });
				add(new Integer[] { 78, 79, 80 });
				add(new Integer[] { 79, 80 });
				add(new Integer[] { 80 });
				add(new Integer[] { 81, 87, 74 });

				add(new Integer[] { 82, 83 }); // 81
				add(new Integer[] { 82, 83 });
				add(new Integer[] { 83, 84, 85, 86 });
				add(new Integer[] { 85, 86 });
				add(new Integer[] { 86 });
				add(new Integer[] { 81, 87 });
				add(new Integer[] { 88, 94 });
				add(new Integer[] { 89 });
				add(new Integer[] { 89, 90, 91, 92, 93 });
				add(new Integer[] { 90, 91, 92, 93 });

				add(new Integer[] { 92, 93 }); // 91
				add(new Integer[] { 93 });
				add(new Integer[] { 88, 94 });
				add(new Integer[] { 95, 96, 97, 98, 99, 100, 101, 102 });
				add(new Integer[] { 95, 96, 97, 98, 99, 100, 101, 102 });
				add(new Integer[] { 96, 97, 98, 99, 100, 101, 102 });
				add(new Integer[] { 97, 98, 99, 100, 101, 102 });
				add(new Integer[] { 98, 99, 100, 101, 102 });
				add(new Integer[] { 99, 100, 101, 102 });
				add(new Integer[] { 100, 101, 102 });

				add(new Integer[] { 102 }); // 101
				add(new Integer[] {});

			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
