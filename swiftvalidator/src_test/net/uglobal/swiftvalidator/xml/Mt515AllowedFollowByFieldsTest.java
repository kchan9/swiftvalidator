package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt515AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7, 8 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 6, 10 });
				add(new Integer[] { 11, 18 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 13 });
				add(new Integer[] { 14, 15, 16, 17 });
				add(new Integer[] { 14, 15, 16, 17 });
				add(new Integer[] { 16, 17 });
				add(new Integer[] { 17 });
				add(new Integer[] { 11, 18 });
				add(new Integer[] { 19 });
				add(new Integer[] { 19, 20 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25 });

				add(new Integer[] { 21, 22, 23, 24, 25 }); // 21
				add(new Integer[] { 22, 23, 24, 25 });
				add(new Integer[] { 23, 24, 25 });
				add(new Integer[] { 25 });
				add(new Integer[] { 25, 26, 27 }); // 25
				add(new Integer[] { 27 });
				add(new Integer[] { 28 });
				add(new Integer[] { 28, 29, 30, 31, 32, 33, 34 });
				add(new Integer[] { 29, 30, 31, 32, 33, 34 });
				add(new Integer[] { 31, 32, 33, 34 });

				add(new Integer[] { 32, 33, 34 }); // 31
				add(new Integer[] { 32, 33, 34 });
				add(new Integer[] { 33, 34 });
				add(new Integer[] { 35, 27 });
				add(new Integer[] { 36, 35 });
				add(new Integer[] { 37, 51, 52, 53 });
				add(new Integer[] { 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 });

				add(new Integer[] { 42, 43, 44, 45, 46, 47, 48, 49, 50 }); // 41
				add(new Integer[] { 42, 43, 44, 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 43, 44, 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 44, 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 46, 47, 48, 49, 50 });
				add(new Integer[] { 47, 48, 49, 50 });
				add(new Integer[] { 48, 49, 50 });
				add(new Integer[] { 50 }); // 49
				add(new Integer[] { 51, 52, 53 });

				add(new Integer[] { 51, 52, 53 }); // 51 
				add(new Integer[] { 52, 53 });
				add(new Integer[] { 54, 78, 84 });
				add(new Integer[] { 55 });
				add(new Integer[] { 55, 56, 57, 64, 71, 77 });
				add(new Integer[] { 57, 64, 71, 77 });
				add(new Integer[] { 58 });
				add(new Integer[] { 58, 59, 60, 61, 62, 63 });
				add(new Integer[] { 60, 61, 62, 63 });
				add(new Integer[] { 61, 62, 63 });

				add(new Integer[] { 62, 63 }); // 61
				add(new Integer[] { 62, 63 });
				add(new Integer[] { 64, 57, 71, 77 }); // 63
				add(new Integer[] { 65 });
				add(new Integer[] { 65, 66, 67, 68, 69, 70 });
				add(new Integer[] { 66, 67, 68, 69, 70 });
				add(new Integer[] { 68, 69, 70 });
				add(new Integer[] { 69, 70 });
				add(new Integer[] { 70 });
				add(new Integer[] { 71, 77, 64 });

				add(new Integer[] { 72, 73 }); // 71
				add(new Integer[] { 72, 73 });
				add(new Integer[] { 73, 74, 75, 76 });
				add(new Integer[] { 75, 76 });
				add(new Integer[] { 76 });
				add(new Integer[] { 71, 77 });
				add(new Integer[] { 78, 84 });
				add(new Integer[] { 79 });
				add(new Integer[] { 79, 80, 81, 82, 83 }); // 79
				add(new Integer[] { 80, 81, 82, 83 });

				add(new Integer[] { 82, 83 }); // 81 
				add(new Integer[] { 83 });
				add(new Integer[] { 84, 78 });
				add(new Integer[] { 85, 86, 87, 88, 89, 90, 91, 92 });
				add(new Integer[] { 85, 86, 87, 88, 89, 90, 91, 92 });
				add(new Integer[] { 86, 87, 88, 89, 90, 91, 92 });
				add(new Integer[] { 87, 88, 89, 90, 91, 92 });
				add(new Integer[] { 88, 89, 90, 91, 92 });
				add(new Integer[] { 89, 90, 91, 92 });
				add(new Integer[] { 90, 91, 92 });

				add(new Integer[] { 92 }); // 91 
				add(new Integer[] {});
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
