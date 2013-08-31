package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt567AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 2, 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5, 6 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7, 8 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 6, 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12, 16 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 15 });
				add(new Integer[] { 12, 16 });
				add(new Integer[] { 10, 17 });
				add(new Integer[] { 18, 29 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28 });
				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28 });

				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28 }); // 21
				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28 });
				add(new Integer[] { 24, 25, 26, 27, 28 });
				add(new Integer[] { 25, 26, 27, 28 });
				add(new Integer[] { 25, 26, 27, 28 });
				add(new Integer[] { 26, 27, 28 });
				add(new Integer[] { 27, 28 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30, 31, 32 });
				add(new Integer[] { 30, 31, 32 });

				add(new Integer[] { 31, 32 }); // 31 
				add(new Integer[] {}); // 32
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
