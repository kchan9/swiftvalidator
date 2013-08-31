package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt504AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 2, 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5, 6, 7, 8, 9 });
				add(new Integer[] { 6, 7, 8, 9 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 4, 10, 11 });
				add(new Integer[] { 11 });

				add(new Integer[] { 11, 12 }); // 11
				add(new Integer[] { 12, 13, 14, 18 });
				add(new Integer[] { 14, 18 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17 });
				add(new Integer[] { 14, 18 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21 });

				add(new Integer[] { 21, 22, 26 }); // 21
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 26 });
				add(new Integer[] { 27 });
				add(new Integer[] { 28 });
				add(new Integer[] { 29 });
				add(new Integer[] { 29, 30, 31, 44, 57, 63 });
				add(new Integer[] { 31, 44, 57, 63 });

				add(new Integer[] { 32 }); // 31
				add(new Integer[] { 33 });
				add(new Integer[] { 34, 35, 43 });
				add(new Integer[] { 35, 43 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37, 36, 42 });
				add(new Integer[] { 38 });
				add(new Integer[] { 38, 39, 40, 41 });
				add(new Integer[] { 40, 41 });
				add(new Integer[] { 41 });

				add(new Integer[] { 42, 37 }); // 41
				add(new Integer[] { 43 });
				add(new Integer[] { 63, 57, 44 });
				add(new Integer[] { 45 });
				add(new Integer[] { 46 });
				add(new Integer[] { 47, 48, 56 });
				add(new Integer[] { 56, 48 });
				add(new Integer[] { 49, 50, 55 });
				add(new Integer[] { 55, 50 });
				add(new Integer[] { 51 }); // 50

				add(new Integer[] { 51, 52, 53, 54 }); // 51
				add(new Integer[] { 52, 53, 54 });
				add(new Integer[] { 54 });
				add(new Integer[] { 50, 55 });
				add(new Integer[] { 56 });
				add(new Integer[] { 57, 63 });
				add(new Integer[] { 58 });
				add(new Integer[] { 59 });
				add(new Integer[] { 59, 60 });
				add(new Integer[] { 61 });

				add(new Integer[] { 62 }); // 61
				add(new Integer[] { 63 });
				add(new Integer[] { 64, 27, 72, 80 });
				add(new Integer[] { 65 });
				add(new Integer[] { 65, 66, 71 });
				add(new Integer[] { 67 });
				add(new Integer[] { 67, 68, 69, 70 });
				add(new Integer[] { 69, 70 });
				add(new Integer[] { 70 });
				add(new Integer[] { 71, 66 });

				add(new Integer[] { 72, 80 }); // 71
				add(new Integer[] { 73, 74, 79 });
				add(new Integer[] { 74, 79 });
				add(new Integer[] { 75 });
				add(new Integer[] { 75, 76, 77, 78 });
				add(new Integer[] { 76, 77, 78 });
				add(new Integer[] { 78 });
				add(new Integer[] { 79, 74 });
				add(new Integer[] { 80 });
				add(new Integer[] { 81, 82 });

				add(new Integer[] { 81, 82 }); // 81
				add(new Integer[] {});
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}

}
