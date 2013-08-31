package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt503AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

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

				add(new Integer[] { 11, 12 }); // 11
				add(new Integer[] { 12, 13, 14, 18 });
				add(new Integer[] { 14, 18 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17 });
				add(new Integer[] { 14, 18 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20, 21 });
				add(new Integer[] { 21 });

				add(new Integer[] { 21, 22, 26 }); // 21
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 26 });
				add(new Integer[] { 27, 48 });
				add(new Integer[] { 28 });
				add(new Integer[] { 29 });
				add(new Integer[] { 29, 30, 31, 36, 41, 47 });
				add(new Integer[] { 31, 36, 41, 47 });

				add(new Integer[] { 32 }); // 31
				add(new Integer[] { 33 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36, 41, 47 });
				add(new Integer[] { 37 });
				add(new Integer[] { 38 });
				add(new Integer[] { 39, 40 });
				add(new Integer[] { 40 });
				add(new Integer[] { 41, 47 });

				add(new Integer[] { 42 }); // 41
				add(new Integer[] { 43 });
				add(new Integer[] { 43, 44 });
				add(new Integer[] { 45 });
				add(new Integer[] { 46 });
				add(new Integer[] { 47 });
				add(new Integer[] { 27, 48 });
				add(new Integer[] { 49, 50 });
				add(new Integer[] { 49, 50 });
				add(new Integer[] {}); // 50
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}

}
