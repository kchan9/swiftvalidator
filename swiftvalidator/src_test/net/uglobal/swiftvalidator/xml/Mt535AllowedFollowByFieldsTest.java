package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt535AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7, 8, 12, 13 });
				add(new Integer[] { 9, 10 });
				add(new Integer[] { 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 8, 12, 13 }); //11
				add(new Integer[] { 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 16, 74 });
				add(new Integer[] { 17, 18, 19, 20, 21, 73 });
				add(new Integer[] { 18, 19, 20, 21, 73 });
				add(new Integer[] { 19, 20, 21, 73 });
				add(new Integer[] { 20, 21, 73 });
				add(new Integer[] { 21, 73 });

				add(new Integer[] { 22 }); //21
				add(new Integer[] { 23, 37, 38, 39, 40, 41 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 });
				add(new Integer[] { 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 });
				add(new Integer[] { 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36 });
				add(new Integer[] { 28, 29, 30, 31, 32, 33, 34, 35, 36 });
				add(new Integer[] { 28, 29, 30, 31, 32, 33, 34, 35, 36 });
				add(new Integer[] { 29, 30, 31, 32, 33, 34, 35, 36 });
				add(new Integer[] { 30, 31, 32, 33, 34, 35, 36 });

				add(new Integer[] { 31, 32, 33, 34, 35, 36 });// 31
				add(new Integer[] { 32, 33, 34, 35, 36 });
				add(new Integer[] { 33, 34, 35, 36 });
				add(new Integer[] { 34, 35, 36 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37, 38, 39, 40, 41 });
				add(new Integer[] { 38, 39, 40, 41 });
				add(new Integer[] { 39, 40, 41 });
				add(new Integer[] { 40, 41 });
				add(new Integer[] { 41 });

				add(new Integer[] { 41, 42, 60, 61, 62, 63, 64, 72 });// 41
				add(new Integer[] { 43 });
				add(new Integer[] { 43, 44, 45, 46, 47, 48, 49, 50, 51, 59 });
				add(new Integer[] { 44, 45, 46, 47, 48, 49, 50, 51, 59 });
				add(new Integer[] { 46, 47, 48, 49, 50, 51, 59 });
				add(new Integer[] { 47, 48, 49, 50, 51, 59 });
				add(new Integer[] { 48, 49, 50, 51, 59 });
				add(new Integer[] { 48, 49, 50, 51, 59 });
				add(new Integer[] { 50, 51, 59 });
				add(new Integer[] { 51, 59 });

				add(new Integer[] { 52, 53, 54, 55, 56, 57, 58 });// 51
				add(new Integer[] { 53, 54, 55, 56, 57, 58 });
				add(new Integer[] { 54, 55, 56, 57, 58 });
				add(new Integer[] { 55, 56, 57, 58 });
				add(new Integer[] { 56, 57, 58 });
				add(new Integer[] { 57, 58 });
				add(new Integer[] { 57, 58 });
				add(new Integer[] { 51, 59 });
				add(new Integer[] { 42, 60, 61, 62, 63, 64, 72 });
				add(new Integer[] { 61, 62, 63, 64, 72 });

				add(new Integer[] { 61, 62, 63, 64, 72 });//61
				add(new Integer[] { 63, 64, 72 });
				add(new Integer[] { 64, 72 });
				add(new Integer[] { 65, 66, 67, 68, 69, 70, 71 });
				add(new Integer[] { 66, 67, 68, 69, 70, 71 });
				add(new Integer[] { 67, 68, 69, 70, 71 });
				add(new Integer[] { 68, 69, 70, 71 });
				add(new Integer[] { 69, 70, 71 });
				add(new Integer[] { 70, 71 });
				add(new Integer[] { 70, 71 });

				add(new Integer[] { 64, 72 });//71
				add(new Integer[] { 21, 73 });
				add(new Integer[] { 16, 74 });
				add(new Integer[] { 75, 76, 77 });
				add(new Integer[] { 75, 76, 77 });
				add(new Integer[] { 76, 77 });
				add(new Integer[] { 74 });

			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
