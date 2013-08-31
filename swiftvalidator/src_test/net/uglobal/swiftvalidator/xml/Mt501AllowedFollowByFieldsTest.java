package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt501AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 6, 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 13, 14, 15 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 30 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });

				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29 }); //21
				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 25, 26, 27, 28, 29 });
				add(new Integer[] { 26, 27, 28, 29 });
				add(new Integer[] { 27, 28, 29 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30 });
				add(new Integer[] { 31 });

				add(new Integer[] { 32, 33, 34 }); //31
				add(new Integer[] { 33, 34 });
				add(new Integer[] { 34 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37, 53, 57 });
				add(new Integer[] { 38, 45, 52 });
				add(new Integer[] { 39 });
				add(new Integer[] { 40, 41, 42, 43, 44 });
				add(new Integer[] { 40, 41, 42, 43, 44 });

				add(new Integer[] { 41, 42, 43, 44 }); // 41
				add(new Integer[] { 42, 43, 44 });
				add(new Integer[] { 43, 44 });
				add(new Integer[] { 45, 52 });
				add(new Integer[] { 46, 47, 48, 49, 50, 51 });
				add(new Integer[] { 46, 47, 48, 49, 50, 51 });
				add(new Integer[] { 48, 49, 50, 51 });
				add(new Integer[] { 48, 49, 50, 51 });
				add(new Integer[] { 49, 50, 51 });
				add(new Integer[] { 51 });

				add(new Integer[] { 52 }); // 51
				add(new Integer[] { 37, 53, 57 });
				add(new Integer[] { 54, 55, 56 });
				add(new Integer[] { 54, 55, 56 });
				add(new Integer[] { 56 });
				add(new Integer[] { 57 });
				add(new Integer[] { 58, 59 });
				add(new Integer[] { 58, 59 });
				add(new Integer[] {}); // 59
			}
		};
	}

}
