package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt566AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

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
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 26 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25 });
				add(new Integer[] { 21, 22, 23, 24, 25 });

				add(new Integer[] { 22, 23, 24, 25 }); //21
				add(new Integer[] { 22, 23, 24, 25 });
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 26 });
				add(new Integer[] { 26, 27 });
				add(new Integer[] { 28, 40 });
				add(new Integer[] { 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 });
				add(new Integer[] { 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 });
				add(new Integer[] { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 });

				add(new Integer[] { 32, 33, 34, 35, 36, 37, 38, 39 }); // 31
				add(new Integer[] { 32, 33, 34, 35, 36, 37, 38, 39 });
				add(new Integer[] { 33, 34, 35, 36, 37, 38, 39 });
				add(new Integer[] { 34, 35, 36, 37, 38, 39 });
				add(new Integer[] { 35, 36, 37, 38, 39 });
				add(new Integer[] { 36, 37, 38, 39 });
				add(new Integer[] { 37, 38, 39 });
				add(new Integer[] { 38, 39 });
				add(new Integer[] { 40 });
				add(new Integer[] { 41 });

				add(new Integer[] { 42 }); // 41
				add(new Integer[] { 42, 43, 44, 45, 46, 47, 48, 49, 76, 94 });
				add(new Integer[] { 44, 45, 46, 47, 48, 49, 76, 94 });
				add(new Integer[] { 44, 45, 46, 47, 48, 49, 76, 94 });
				add(new Integer[] { 45, 46, 47, 48, 49, 76, 94 });
				add(new Integer[] { 46, 47, 48, 49, 76, 94 });
				add(new Integer[] { 47, 48, 49, 76, 94 });
				add(new Integer[] { 49, 76, 94 });
				add(new Integer[] { 50 });
				add(new Integer[] { 50, 51 });

				add(new Integer[] { 52, 62 }); // 51
				add(new Integer[] { 53, 54, 55, 56, 57, 58, 59, 60, 61 });
				add(new Integer[] { 54, 55, 56, 57, 58, 59, 60, 61 });
				add(new Integer[] { 55, 56, 57, 58, 59, 60, 61 });
				add(new Integer[] { 56, 57, 58, 59, 60, 61 });
				add(new Integer[] { 57, 58, 59, 60, 61 });
				add(new Integer[] { 57, 58, 59, 60, 61 });
				add(new Integer[] { 59, 60, 61 });
				add(new Integer[] { 59, 60, 61 });
				add(new Integer[] { 60, 61 });

				add(new Integer[] { 62 }); //61
				add(new Integer[] { 62, 63, 64, 65, 66, 67, 68 });
				add(new Integer[] { 64, 65, 66, 67, 68 });
				add(new Integer[] { 65, 66, 67, 68 });
				add(new Integer[] { 66, 67, 68 });
				add(new Integer[] { 66, 67, 68 });
				add(new Integer[] { 67, 68 });
				add(new Integer[] { 75, 69, 68 });
				add(new Integer[] { 70 });
				add(new Integer[] { 70, 71, 72, 73, 74 });

				add(new Integer[] { 72, 73, 74 }); // 71
				add(new Integer[] { 73, 74 });
				add(new Integer[] { 74 });
				add(new Integer[] { 75, 69 });
				add(new Integer[] { 94, 76, 49 });
				add(new Integer[] { 77 });
				add(new Integer[] { 77, 78, 79, 85 });
				add(new Integer[] { 79, 85 });
				add(new Integer[] { 80 });
				add(new Integer[] { 80, 81, 82, 83, 84 });

				add(new Integer[] { 82, 83, 84 }); // 81
				add(new Integer[] { 83, 84 });
				add(new Integer[] { 84 });
				add(new Integer[] { 85, 79 });
				add(new Integer[] { 85, 86 });
				add(new Integer[] { 86, 87, 88, 89, 93 });
				add(new Integer[] { 87, 88, 89, 93 });
				add(new Integer[] { 88, 89, 93 });
				add(new Integer[] { 90 });
				add(new Integer[] { 91, 92 });

				add(new Integer[] { 91, 92 }); // 91
				add(new Integer[] { 93 });
				add(new Integer[] { 94, 76 });
				add(new Integer[] { 95 });
				add(new Integer[] { 96, 97, 98 });
				add(new Integer[] { 96, 97, 98 });
				add(new Integer[] { 97, 98 });
				add(new Integer[] {}); // 98

			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
