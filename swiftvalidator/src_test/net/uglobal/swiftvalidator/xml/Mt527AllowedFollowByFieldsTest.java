package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt527AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 5, 6 });
				add(new Integer[] { 6, 7, 8, 9 }); // 6
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 10, 11, 12, 13 });

				add(new Integer[] { 12, 13 });// 11
				add(new Integer[] { 13 });
				add(new Integer[] { 9, 14, 15, 19 });
				add(new Integer[] { 14, 15, 19 });
				add(new Integer[] { 16, 17 });
				add(new Integer[] { 17 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19, 15 });
				add(new Integer[] { 20, 28, 36, 43 });
				add(new Integer[] { 21, 22, 23 });

				add(new Integer[] { 22, 23 }); // 21
				add(new Integer[] { 23 });
				add(new Integer[] { 24, 25, 26, 27 });
				add(new Integer[] { 24, 25, 26, 27 });
				add(new Integer[] { 25, 26, 27 });
				add(new Integer[] { 26, 27 });
				add(new Integer[] { 28, 36, 43 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30 });
				add(new Integer[] { 31 });

				add(new Integer[] { 32 }); // 31
				add(new Integer[] { 33, 34, 35 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 35 });
				add(new Integer[] { 28, 36, 43 });
				add(new Integer[] { 37 });
				add(new Integer[] { 38 });
				add(new Integer[] { 39, 40, 41, 42 });
				add(new Integer[] { 40, 41, 42 });
				add(new Integer[] { 42, 41 });

				add(new Integer[] { 42 }); // 41
				add(new Integer[] { 43, 36 });
				add(new Integer[] { 44, 45 });
				add(new Integer[] { 44, 45 });
				add(new Integer[] {}); //45

			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
