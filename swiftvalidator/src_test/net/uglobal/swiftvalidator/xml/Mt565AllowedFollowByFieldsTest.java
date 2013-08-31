package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt565AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 2, 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5, 6, 11 });
				add(new Integer[] { 6, 11 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11, 6 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13, 14, 23 });
				add(new Integer[] { 14, 23 });
				add(new Integer[] { 15, 16, 17, 18, 19, 20, 21, 22 });
				add(new Integer[] { 16, 17, 18, 19, 20, 21, 22 });
				add(new Integer[] { 17, 18, 19, 20, 21, 22 });
				add(new Integer[] { 18, 19, 20, 21, 22 });
				add(new Integer[] { 19, 20, 21, 22 });
				add(new Integer[] { 19, 20, 21, 22 });
				add(new Integer[] { 20, 21, 22 });

				add(new Integer[] { 21, 22 }); //21
				add(new Integer[] { 23 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 25 });
				add(new Integer[] { 26, 27, 28 });
				add(new Integer[] { 27, 28 });
				add(new Integer[] { 27, 28 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30, 37 });
				add(new Integer[] { 31 });

				add(new Integer[] { 31, 32, 33 });//31
				add(new Integer[] { 32, 33 });
				add(new Integer[] { 34, 35, 36 });
				add(new Integer[] { 34, 35, 36 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37, 30 });
				add(new Integer[] { 38 });
				add(new Integer[] { 39 });
				add(new Integer[] { 39, 40, 41, 42 });
				add(new Integer[] { 40, 41, 42 });

				add(new Integer[] { 42 }); // 41
				add(new Integer[] { 42, 43, 44, 45, 46, 47 });
				add(new Integer[] { 44, 45, 46, 47 });
				add(new Integer[] { 44, 45, 46, 47 });
				add(new Integer[] { 45, 46, 47 });
				add(new Integer[] { 46, 47 });
				add(new Integer[] { 48 });
				add(new Integer[] { 49, 50, 51 });
				add(new Integer[] { 49, 50, 51 });
				add(new Integer[] { 50, 51 });

				add(new Integer[] {}); //51

			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
