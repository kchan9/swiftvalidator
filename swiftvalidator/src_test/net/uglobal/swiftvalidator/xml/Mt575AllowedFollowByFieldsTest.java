package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt575AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8, 9, 13, 14, 15 });
				add(new Integer[] { 8, 9, 13, 14, 15 });
				add(new Integer[] { 10, 11 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 9, 13, 14, 15 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 55, 76 });
				add(new Integer[] { 18, 19 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21 });

				add(new Integer[] { 22 });//21
				add(new Integer[] { 23 }); // 22
				add(new Integer[] { 23, 24, 53 });
				add(new Integer[] { 25 });
				add(new Integer[] { 26, 27 });
				add(new Integer[] { 27 });
				add(new Integer[] { 28 });
				add(new Integer[] { 25, 29, 37, 48, 52 }); //28
				add(new Integer[] { 30 });
				add(new Integer[] { 31, 32, 33 });

				add(new Integer[] { 32, 33 }); // 31
				add(new Integer[] { 33 });
				add(new Integer[] { 33, 34 });
				add(new Integer[] { 35, 36 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37, 48, 52 });
				add(new Integer[] { 38, 39 });
				add(new Integer[] { 39 });
				add(new Integer[] { 39, 40 });
				add(new Integer[] { 41, 42 });

				add(new Integer[] { 42 }); //41
				add(new Integer[] { 43 });
				add(new Integer[] { 43, 44 });
				add(new Integer[] { 44, 45, 46, 47 });
				add(new Integer[] { 46, 47 });
				add(new Integer[] { 47 });
				add(new Integer[] { 48, 52 });
				add(new Integer[] { 49 });
				add(new Integer[] { 50, 51 });
				add(new Integer[] { 51 });

				add(new Integer[] { 52, 48 }); // 51
				add(new Integer[] { 53, 24 });
				add(new Integer[] { 54, 20 });
				add(new Integer[] { 17, 55, 76 });
				add(new Integer[] { 56 });
				add(new Integer[] { 57, 58 });
				add(new Integer[] { 58 });
				add(new Integer[] { 59 });
				add(new Integer[] { 56, 60, 75 });
				add(new Integer[] { 61, 62, 63 });

				add(new Integer[] { 62, 63 }); // 61
				add(new Integer[] { 63 });
				add(new Integer[] { 64, 65 });//63
				add(new Integer[] { 65 });
				add(new Integer[] { 66 });
				add(new Integer[] { 66, 67 });
				add(new Integer[] { 67, 68, 69, 70, 74 });
				add(new Integer[] { 69, 70, 74 });
				add(new Integer[] { 70, 74 });
				add(new Integer[] { 71 });

				add(new Integer[] { 72, 73 }); //71
				add(new Integer[] { 73 });
				add(new Integer[] { 70, 74 });
				add(new Integer[] { 75 });
				add(new Integer[] { 76, 55 });
				add(new Integer[] { 77, 78 });
				add(new Integer[] { 77, 78 });
				add(new Integer[] {}); // 78

			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}

}
