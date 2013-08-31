package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt524AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 6, 11 });
				add(new Integer[] { 5, 6, 11 });
				add(new Integer[] { 6, 11 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 18 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19, 33 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });

				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 }); // 21
				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 28, 29, 30, 31, 32 });
				add(new Integer[] { 29, 30, 31, 32 });
				add(new Integer[] { 30, 31, 32 });

				add(new Integer[] { 32 }); // 31
				add(new Integer[] { 33 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 35 });
				add(new Integer[] { 35, 36 });
				add(new Integer[] { 37 });
				add(new Integer[] { 38, 39 });
				add(new Integer[] { 38, 39 });
				add(new Integer[] {}); // 39
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}

}
