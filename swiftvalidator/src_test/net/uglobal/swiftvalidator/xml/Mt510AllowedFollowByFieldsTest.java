package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt510AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9, 5 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11, 15 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 11, 15 });
				add(new Integer[] { 9, 16 });
				add(new Integer[] { 17, 27 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25, 26 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25, 26 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26 });

				add(new Integer[] { 21, 22, 23, 24, 25, 26 }); // 21
				add(new Integer[] { 22, 23, 24, 25, 26 });
				add(new Integer[] { 24, 25, 26 });
				add(new Integer[] { 25, 26 });
				add(new Integer[] { 26 });
				add(new Integer[] { 27 });
				add(new Integer[] { 28, 29 });
				add(new Integer[] { 28, 29 });
				add(new Integer[] {}); // 29
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
