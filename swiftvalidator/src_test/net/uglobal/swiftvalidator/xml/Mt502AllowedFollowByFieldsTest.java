package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt502AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 5, 6, 11 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 6, 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13, 14, 18 });
				add(new Integer[] { 13, 14, 18 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16, 17 });
				add(new Integer[] { 16, 17 });
				add(new Integer[] { 14, 18 });
				add(new Integer[] { 18, 19 });
				add(new Integer[] { 19, 20, 21, 22 });
				add(new Integer[] { 20, 21, 22 });

				add(new Integer[] { 22 }); // 21
				add(new Integer[] { 23 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 26, 27, 28, 29 });
				add(new Integer[] { 27, 28, 29 });
				add(new Integer[] { 27, 28, 29 });
				add(new Integer[] { 28, 29 });
				add(new Integer[] { 22, 30, 31, 32 });
				add(new Integer[] { 30, 31, 32 });

				add(new Integer[] { 31, 32 }); // 31
				add(new Integer[] { 33, 47, 48, 49 });
				add(new Integer[] { 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46 });
				add(new Integer[] { 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46 });
				add(new Integer[] { 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46 });
				add(new Integer[] { 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46 });
				add(new Integer[] { 38, 39, 40, 41, 42, 43, 44, 45, 46 });
				add(new Integer[] { 38, 39, 40, 41, 42, 43, 44, 45, 46 });
				add(new Integer[] { 39, 40, 41, 42, 43, 44, 45, 46 });
				add(new Integer[] { 40, 41, 42, 43, 44, 45, 46 });

				add(new Integer[] { 41, 42, 43, 44, 45, 46 }); // 41
				add(new Integer[] { 42, 43, 44, 45, 46 });
				add(new Integer[] { 43, 44, 45, 46 });
				add(new Integer[] { 44, 45, 46 });
				add(new Integer[] { 46 });
				add(new Integer[] { 47, 48, 49 });
				add(new Integer[] { 47, 48, 49 });
				add(new Integer[] { 49 });
				add(new Integer[] { 50, 74, 80 });
				add(new Integer[] { 51 });

				add(new Integer[] { 51, 52, 53, 60, 67, 73 }); // 51
				add(new Integer[] { 53, 60, 67, 73 });
				add(new Integer[] { 54 });
				add(new Integer[] { 54, 55, 56, 57, 58, 59 });
				add(new Integer[] { 56, 57, 58, 59 });
				add(new Integer[] { 57, 58, 59 });
				add(new Integer[] { 58, 59 });
				add(new Integer[] { 58, 59 });
				add(new Integer[] { 53, 60, 67, 73 });
				add(new Integer[] { 61 });

				add(new Integer[] { 61, 62, 63, 64, 65, 66 }); // 61
				add(new Integer[] { 62, 63, 64, 65, 66 });
				add(new Integer[] { 64, 65, 66 });
				add(new Integer[] { 65, 66 });
				add(new Integer[] { 66 });
				add(new Integer[] { 60, 67, 73 });
				add(new Integer[] { 68, 69 });
				add(new Integer[] { 68, 69 });
				add(new Integer[] { 69, 70, 71, 72 });
				add(new Integer[] { 71, 72 });

				add(new Integer[] { 72 }); // 71
				add(new Integer[] { 67, 73 });
				add(new Integer[] { 74, 80 });
				add(new Integer[] { 75 });
				add(new Integer[] { 75, 76, 77, 78, 79 });
				add(new Integer[] { 76, 77, 78, 79 });
				add(new Integer[] { 78, 79 });
				add(new Integer[] { 79 });
				add(new Integer[] { 74, 80 });
				add(new Integer[] { 81, 82, 83, 84, 85, 86, 87, 88 });

				add(new Integer[] { 81, 82, 83, 84, 85, 86, 87, 88 });// 81
				add(new Integer[] { 82, 83, 84, 85, 86, 87, 88 });
				add(new Integer[] { 83, 84, 85, 86, 87, 88 });
				add(new Integer[] { 84, 85, 86, 87, 88 });
				add(new Integer[] { 85, 86, 87, 88 });
				add(new Integer[] { 86, 87, 88 });
				add(new Integer[] { 88 });
				add(new Integer[] {});
			}
		};
	}

}
