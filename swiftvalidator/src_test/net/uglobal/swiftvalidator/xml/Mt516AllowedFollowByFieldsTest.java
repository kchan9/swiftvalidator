package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt516AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2, 3 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 6, 5 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7, 8, 9, 10 });
				add(new Integer[] { 8, 9, 10 });
				add(new Integer[] { 9, 10 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11, 12, 13, 14, 15, 24 });

				add(new Integer[] { 12, 13, 14, 15, 24 }); // 11
				add(new Integer[] { 13, 14, 15, 24 });
				add(new Integer[] { 14, 15, 24 });
				add(new Integer[] { 15, 24 });
				add(new Integer[] { 16, 17, 18, 19, 20, 21, 22, 23, 24 });
				add(new Integer[] { 17, 18, 19, 20, 21, 22, 23, 24 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24 });
				add(new Integer[] { 20, 21, 22, 23, 24 });
				add(new Integer[] { 21, 22, 23, 24 });

				add(new Integer[] { 22, 23, 24 }); // 21
				add(new Integer[] { 23, 24 });
				add(new Integer[] { 24 });
				add(new Integer[] { 25 });
				add(new Integer[] {});

			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
