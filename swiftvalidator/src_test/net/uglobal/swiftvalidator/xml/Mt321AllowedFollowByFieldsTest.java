package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;

public class Mt321AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 2, 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 4, 5, 6, 10 });
				add(new Integer[] { 5, 6, 10 });
				add(new Integer[] { 7, 8 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 6, 10 });
				add(new Integer[] { 11 });
				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 17, 18 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21 });
				add(new Integer[] { 22, 23 }); // 21
				add(new Integer[] { 23 });
				add(new Integer[] { 24 });
				add(new Integer[] { 25, 28 });
				add(new Integer[] { 26 });
				add(new Integer[] { 26, 27 });
				add(new Integer[] { 28 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30 });
				add(new Integer[] { 31 });
				add(new Integer[] { 32 });// 31
				add(new Integer[] { 32, 33, 34, 35 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 35 });
				add(new Integer[] { 31, 36 });
				add(new Integer[] { 29 }); // 36
			}
		};
	}
}
