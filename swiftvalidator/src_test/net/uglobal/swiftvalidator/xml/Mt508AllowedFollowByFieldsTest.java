package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt508AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 2, 3 });
				add(new Integer[] { 4, 5, 9 });
				add(new Integer[] { 5, 9 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9, 5 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11, 12 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 14, 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 14, 15, 16, 17 });
				add(new Integer[] { 17, 16 });
				add(new Integer[] { 17 });
				add(new Integer[] { 18, 32 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 });

				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 }); // 21
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 27, 28, 29, 30, 31 });
				add(new Integer[] { 28, 29, 30, 31 });
				add(new Integer[] { 29, 30, 31 });
				add(new Integer[] { 31 });

				add(new Integer[] { 32 }); // 31
				add(new Integer[] { 32, 33, 34, 35 });
				add(new Integer[] { 33, 34, 35 });
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
