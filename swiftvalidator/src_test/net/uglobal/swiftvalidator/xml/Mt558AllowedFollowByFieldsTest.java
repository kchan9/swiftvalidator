package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt558AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 3 });
				add(new Integer[] { 5 });
				add(new Integer[] { 5, 6 });
				add(new Integer[] { 6, 7, 8 });
				add(new Integer[] { 7, 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 9, 10, 11 });
				add(new Integer[] { 11 });

				add(new Integer[] { 8, 12, 19, 20, 21, 22, 26 }); //11
				add(new Integer[] { 13 });
				add(new Integer[] { 14, 18 }); // 13
				add(new Integer[] { 15 });
				add(new Integer[] { 16, 17 });
				add(new Integer[] { 17 });
				add(new Integer[] { 14, 18 }); // 17
				add(new Integer[] { 12, 19, 20, 21, 22, 26 });
				add(new Integer[] { 20, 21, 22, 26 });
				add(new Integer[] { 20, 21, 22, 26 });

				add(new Integer[] { 22, 21, 26 }); //21
				add(new Integer[] { 23, 24 });
				add(new Integer[] { 24 });
				add(new Integer[] { 25 });
				add(new Integer[] { 22, 26 });
				add(new Integer[] { 27 });
				add(new Integer[] { 28 });
				add(new Integer[] { 29, 30, 31, 32 });
				add(new Integer[] { 29, 30, 31, 32 });
				add(new Integer[] { 30, 31, 32 });

				add(new Integer[] { 31, 32 }); //31
				add(new Integer[] { 33, 44, 53 });
				add(new Integer[] { 34 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37, 38 });
				add(new Integer[] { 38 });
				add(new Integer[] { 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 40, 41, 42, 43 });
				add(new Integer[] { 40, 41, 42, 43 });

				add(new Integer[] { 42, 43 }); //41
				add(new Integer[] { 43 });
				add(new Integer[] { 44, 33, 53 });
				add(new Integer[] { 45 });
				add(new Integer[] { 46 });
				add(new Integer[] { 47, 48, 49 });
				add(new Integer[] { 47, 48, 49 });
				add(new Integer[] { 49 });
				add(new Integer[] { 49, 50, 51, 52 });
				add(new Integer[] { 51, 52 });

				add(new Integer[] { 52 }); // 51
				add(new Integer[] { 53, 44 });
				add(new Integer[] { 54, 55 });
				add(new Integer[] { 54, 55 });
				add(new Integer[] {});

			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
