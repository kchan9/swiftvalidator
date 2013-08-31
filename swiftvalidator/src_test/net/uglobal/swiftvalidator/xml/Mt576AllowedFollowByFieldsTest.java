package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt576AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6 });
				add(new Integer[] { 6, 7, 11, 12, 13 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11, 12, 13, 7 });

				add(new Integer[] { 12, 13 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15, 55 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 30, 54 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });

				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29 });//21
				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 25, 26, 27, 28, 29 });
				add(new Integer[] { 26, 27, 28, 29 });
				add(new Integer[] { 27, 28, 29 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30, 54 });
				add(new Integer[] { 39, 31, 32, 33, 34, 35, 43 });

				add(new Integer[] { 39, 32, 33, 34, 35, 43 });//31
				add(new Integer[] { 39, 32, 33, 34, 35, 43 });
				add(new Integer[] { 39, 33, 34, 35, 43 });
				add(new Integer[] { 39, 35, 43 });
				add(new Integer[] { 36, 37 });
				add(new Integer[] { 37 });
				add(new Integer[] { 38 });
				add(new Integer[] { 39, 43, 35 });
				add(new Integer[] { 40 });
				add(new Integer[] { 41, 42 });

				add(new Integer[] { 42 });//41
				add(new Integer[] { 43, 39 });
				add(new Integer[] { 43, 44, 45, 53 });
				add(new Integer[] { 44, 45, 53 });
				add(new Integer[] { 46 });
				add(new Integer[] { 46, 47, 48, 49, 50, 51, 52 });
				add(new Integer[] { 48, 49, 50, 51, 52 });
				add(new Integer[] { 49, 50, 51, 52 });
				add(new Integer[] { 50, 51, 52 });
				add(new Integer[] { 50, 51, 52 });

				add(new Integer[] { 52 });//51
				add(new Integer[] { 53, 45 });
				add(new Integer[] { 54, 30 });
				add(new Integer[] { 55, 15 });
				add(new Integer[] { 56, 57 });
				add(new Integer[] { 56, 57 });
				add(new Integer[] {});

			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}

}
