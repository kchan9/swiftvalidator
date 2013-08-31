package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt518AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 10 });
				add(new Integer[] { 7, 8 }); // 6
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 6, 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 12, 13 }); // 12
				add(new Integer[] { 14, 15, 16, 17, 18 });
				add(new Integer[] { 14, 15, 16, 17, 18 });
				add(new Integer[] { 15, 16, 17, 18 });
				add(new Integer[] { 16, 17, 18 });
				add(new Integer[] { 18 });
				add(new Integer[] { 18, 19, 20 });
				add(new Integer[] { 20 }); // 19
				add(new Integer[] { 21 });

				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27 }); // 21
				add(new Integer[] { 22, 23, 24, 25, 26, 27 });
				add(new Integer[] { 24, 25, 26, 27 });
				add(new Integer[] { 25, 26, 27 });
				add(new Integer[] { 25, 26, 27 });
				add(new Integer[] { 26, 27 });
				add(new Integer[] { 28, 20 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30, 44, 45, 46 });
				add(new Integer[] { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43 });

				add(new Integer[] { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43 }); // 31
				add(new Integer[] { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 35, 36, 37, 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 35, 36, 37, 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 36, 37, 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 37, 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 39, 40, 41, 42, 43 });
				add(new Integer[] { 40, 41, 42, 43 });

				add(new Integer[] { 41, 42, 43 }); // 41
				add(new Integer[] { 43 });
				add(new Integer[] { 44, 45, 46 });
				add(new Integer[] { 44, 45, 46 });
				add(new Integer[] { 45, 46 });
				add(new Integer[] { 47, 71, 77 });
				add(new Integer[] { 48 });
				add(new Integer[] { 48, 49, 50, 57, 64, 70 });
				add(new Integer[] { 50, 57, 64, 70 });
				add(new Integer[] { 51 });

				add(new Integer[] { 51, 52, 53, 54, 55, 56 }); // 51
				add(new Integer[] { 53, 54, 55, 56 });
				add(new Integer[] { 54, 55, 56 });
				add(new Integer[] { 55, 56 });
				add(new Integer[] { 55, 56 });
				add(new Integer[] { 50, 57, 64, 70 });
				add(new Integer[] { 58 });
				add(new Integer[] { 58, 59, 60, 61, 62, 63 });
				add(new Integer[] { 59, 60, 61, 62, 63 });
				add(new Integer[] { 61, 62, 63 });

				add(new Integer[] { 62, 63 }); // 61
				add(new Integer[] { 63 });
				add(new Integer[] { 57, 64, 70 });
				add(new Integer[] { 65, 66 }); // 64
				add(new Integer[] { 65, 66 });
				add(new Integer[] { 66, 67, 68, 69 });
				add(new Integer[] { 68, 69 });
				add(new Integer[] { 69 });
				add(new Integer[] { 64, 70 });
				add(new Integer[] { 71, 77 });

				add(new Integer[] { 72 });// 71
				add(new Integer[] { 72, 73, 74, 75, 76 });
				add(new Integer[] { 73, 74, 75, 76 });
				add(new Integer[] { 75, 76 });
				add(new Integer[] { 76 });
				add(new Integer[] { 71, 77 });
				add(new Integer[] { 78, 79, 80, 81, 82, 83, 84, 85 });
				add(new Integer[] { 78, 79, 80, 81, 82, 83, 84, 85 });
				add(new Integer[] { 79, 80, 81, 82, 83, 84, 85 });
				add(new Integer[] { 80, 81, 82, 83, 84, 85 });

				add(new Integer[] { 81, 82, 83, 84, 85 }); // 81
				add(new Integer[] { 82, 83, 84, 85 });
				add(new Integer[] { 83, 84, 85 });
				add(new Integer[] { 85 });
				add(new Integer[] {}); // 85
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
