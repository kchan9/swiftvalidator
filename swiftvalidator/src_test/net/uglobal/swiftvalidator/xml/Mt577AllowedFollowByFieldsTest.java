package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt577AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4, 5 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] {}); // 9
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
