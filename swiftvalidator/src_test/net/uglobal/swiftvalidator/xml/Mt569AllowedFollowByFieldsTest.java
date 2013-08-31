package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt569AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 4, 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 7, 8, 16, 12 }); // 7
				add(new Integer[] { 9 });
				add(new Integer[] { 10, 11 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12, 8, 16 }); // 11
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16, 12 });
				add(new Integer[] { 17 });
				add(new Integer[] { 18 });
				add(new Integer[] { 18, 19, 20, 21 });
				add(new Integer[] { 20, 21 });
				add(new Integer[] { 21 });

				add(new Integer[] { 22, 23 }); // 21
				add(new Integer[] { 23 });
				add(new Integer[] { 24 });
				add(new Integer[] { 25 }); // 24
				add(new Integer[] { 26, 25 });
				add(new Integer[] { 26, 27, 28, 29, 63 });
				add(new Integer[] { 28, 29, 63 });
				add(new Integer[] { 29, 63 });
				add(new Integer[] { 30, 31 });
				add(new Integer[] { 30, 31 });

				add(new Integer[] { 32, 31 });//31
				add(new Integer[] { 32, 33, 34, 35 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36 });
				add(new Integer[] { 36, 37 });
				add(new Integer[] { 38, 37 });
				add(new Integer[] { 38, 39, 40, 41, 42, 61 });
				add(new Integer[] { 39, 40, 41, 42, 61 });
				add(new Integer[] { 40, 41, 42, 61 });

				add(new Integer[] { 41, 42, 61 });//41
				add(new Integer[] { 43 });
				add(new Integer[] { 43, 44, 45 });
				add(new Integer[] { 45 });
				add(new Integer[] { 45, 46 });
				add(new Integer[] { 60, 46, 47, 48, 49 });
				add(new Integer[] { 60, 47, 48, 49 });
				add(new Integer[] { 60, 49 });
				add(new Integer[] { 50 });
				add(new Integer[] { 51 });

				add(new Integer[] { 52, 53, 54, 55, 56, 57, 58, 59 });//51
				add(new Integer[] { 53, 54, 55, 56, 57, 58, 59 });
				add(new Integer[] { 54, 55, 56, 57, 58, 59 });
				add(new Integer[] { 55, 56, 57, 58, 59 });
				add(new Integer[] { 56, 57, 58, 59 });
				add(new Integer[] { 57, 58, 59 });
				add(new Integer[] { 57, 58, 59 });
				add(new Integer[] { 59 });
				add(new Integer[] { 60, 49 });
				add(new Integer[] { 61, 42 });

				add(new Integer[] { 62, 35 });//61
				add(new Integer[] { 63, 29 });
				add(new Integer[] { 64, 24 });
				add(new Integer[] { 65, 66, 67 });
				add(new Integer[] { 65, 66, 67 });
				add(new Integer[] { 66, 67 });
				add(new Integer[] { 64 });//67

			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
