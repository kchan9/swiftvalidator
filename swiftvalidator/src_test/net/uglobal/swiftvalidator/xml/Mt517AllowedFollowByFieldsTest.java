package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt517AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 });
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 5, 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 7, 11 });
				add(new Integer[] {});
			}
		};
	}

	//	@Test
	//	public void test() throws FileNotFoundException {
	//		super.testFieldsSequence();
	//	}
}
