package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt549AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 6 });
				add(new Integer[] { 5, 6 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7, 8 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9, 10, 14 });
				add(new Integer[] { 9, 10, 14 });
				add(new Integer[] { 11, 12 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 14, 10 });
				add(new Integer[] { 20, 15, 23 });
				add(new Integer[] { 16, 17, 18, 19 });
				add(new Integer[] { 17, 18, 19 });
				add(new Integer[] { 17, 18, 19 });
				add(new Integer[] { 18, 19 });
				add(new Integer[] { 15, 20, 23 });
				add(new Integer[] { 21 });

				add(new Integer[] { 21, 22 });// 21
				add(new Integer[] { 20, 23 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] {});

			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
