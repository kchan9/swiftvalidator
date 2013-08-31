package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt380AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

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
				add(new Integer[] { 5, 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11 });
				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 12, 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16, 17 });
				add(new Integer[] { 17 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19, 23 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21, 22 });
				add(new Integer[] { 22 }); // 21
				add(new Integer[] { 23 });
				add(new Integer[] { 24 });
				add(new Integer[] { 25, 26, 27, 28 });
				add(new Integer[] { 26, 27, 28 });
				add(new Integer[] { 27, 28 });
				add(new Integer[] { 28 });
				add(new Integer[] {}); // 28
			}
		};
	}
}
