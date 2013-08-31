package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt307AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 2 });
				add(new Integer[] { 4 });
				add(new Integer[] { 4, 5, 9 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9, 5 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 11, 12 }); // 11
				add(new Integer[] { 13 }); // 12
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 18 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21 });

				add(new Integer[] { 22, 27 }); // 21
				add(new Integer[] { 23, 24, 25, 26 });
				add(new Integer[] { 24, 25, 26 });
				add(new Integer[] { 25, 26 });
				add(new Integer[] { 26 });
				add(new Integer[] { 22, 27 });
				add(new Integer[] { 20, 28 });
				add(new Integer[] { 29, 37 });
				add(new Integer[] { 30, 34 });
				add(new Integer[] { 31, 32 });

				add(new Integer[] { 32 }); // 31
				add(new Integer[] { 33 });
				add(new Integer[] { 30, 34 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37 });
				add(new Integer[] { 38 });
				add(new Integer[] { 39 });
				add(new Integer[] { 40, 45 });
				add(new Integer[] { 41 });

				add(new Integer[] { 42, 43, 44 }); // 41
				add(new Integer[] { 43, 44 });
				add(new Integer[] { 44 });
				add(new Integer[] { 40, 45 });
				add(new Integer[] {});
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
