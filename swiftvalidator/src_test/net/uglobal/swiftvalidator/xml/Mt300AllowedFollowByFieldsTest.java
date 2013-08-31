package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt300AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 4 });
				add(new Integer[] { 6, 5 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11, 12, 13, 14, 15 });

				add(new Integer[] { 12, 13, 14, 15 }); //11
				add(new Integer[] { 13, 14, 15 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20, 21, 22 });
				add(new Integer[] { 21, 22 });

				add(new Integer[] { 22 }); //21
				add(new Integer[] { 23 });
				add(new Integer[] { 24, 25, 26 });
				add(new Integer[] { 25, 26 });
				add(new Integer[] { 26 });
				add(new Integer[] { 27, 28, 38 }); //26
				add(new Integer[] { 28, 38 });
				add(new Integer[] { 29, 30, 31, 32, 33, 34, 35, 36, 37, 38 });
				add(new Integer[] { 30, 31, 32, 33, 34, 35, 36, 37, 38 });
				add(new Integer[] { 31, 32, 33, 34, 35, 36, 37, 38 });

				add(new Integer[] { 32, 33, 34, 35, 36, 37, 38 });//31
				add(new Integer[] { 33, 34, 35, 36, 37, 38 });
				add(new Integer[] { 34, 35, 36, 37, 38 });
				add(new Integer[] { 35, 36, 37, 38 });
				add(new Integer[] { 36, 37, 38 });
				add(new Integer[] { 37, 38 });
				add(new Integer[] { 38 });
				add(new Integer[] { 39 });
				add(new Integer[] { 40 });
				add(new Integer[] { 41, 42, 43 });

				add(new Integer[] { 42, 43 });//41
				add(new Integer[] { 43 });
				add(new Integer[] { 44, 45 });
				add(new Integer[] { 39, 45 });
				add(new Integer[] {});
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
