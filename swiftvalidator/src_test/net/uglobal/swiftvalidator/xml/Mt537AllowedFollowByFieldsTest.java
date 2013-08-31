package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt537AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

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

				add(new Integer[] { 8, 12, 13 });
				add(new Integer[] { 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16, 43, 70 });
				add(new Integer[] { 17 });
				add(new Integer[] { 18, 22 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20, 21 });
				add(new Integer[] { 21 });

				add(new Integer[] { 22, 18 }); //21
				add(new Integer[] { 23 });
				add(new Integer[] { 24, 25 });
				add(new Integer[] { 25 });
				add(new Integer[] { 26 });
				add(new Integer[] { 27, 23, 41 });
				add(new Integer[] { 29, 28 });
				add(new Integer[] { 29, 28 });
				add(new Integer[] { 30 });
				add(new Integer[] { 30, 31, 32 });

				add(new Integer[] { 31, 32 }); //31
				add(new Integer[] { 32, 33 });
				add(new Integer[] { 33, 34, 35, 40 });
				add(new Integer[] { 40, 35 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37, 38, 39 });
				add(new Integer[] { 39, 38 });
				add(new Integer[] { 39 });
				add(new Integer[] { 35, 40 });
				add(new Integer[] { 41 });

				add(new Integer[] { 42, 22 }); //41
				add(new Integer[] { 16, 43, 70 });
				add(new Integer[] { 44 });
				add(new Integer[] { 45, 46 });
				add(new Integer[] { 46 });
				add(new Integer[] { 47 });
				add(new Integer[] { 44, 48, 62, 69 });
				add(new Integer[] { 50, 49 });
				add(new Integer[] { 50, 49 });
				add(new Integer[] { 51 });

				add(new Integer[] { 51, 52, 53 }); // 51
				add(new Integer[] { 52, 53 });
				add(new Integer[] { 54, 53 });
				add(new Integer[] { 54, 55, 56, 61 });
				add(new Integer[] { 56, 61 });
				add(new Integer[] { 57 });
				add(new Integer[] { 58, 59, 60 });
				add(new Integer[] { 59, 60 });
				add(new Integer[] { 60 });
				add(new Integer[] { 61, 56 });

				add(new Integer[] { 62, 69 }); // 61
				add(new Integer[] { 63 });
				add(new Integer[] { 64, 68 });
				add(new Integer[] { 65 });
				add(new Integer[] { 66, 67 });
				add(new Integer[] { 67 });
				add(new Integer[] { 64, 68 });
				add(new Integer[] { 69, 62 });
				add(new Integer[] { 70, 43 });
				add(new Integer[] { 71, 72 });

				add(new Integer[] { 71, 72 }); // 71
				add(new Integer[] {});

			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
