package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt538AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 9, 8, 14, 13 });
				add(new Integer[] { 9, 8, 14, 13 });
				add(new Integer[] { 11, 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 9, 14, 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 51 });
				add(new Integer[] { 18 });
				add(new Integer[] { 19, 33 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });

				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 }); //21
				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 25, 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 26, 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 27, 28, 29, 30, 31, 32 });
				add(new Integer[] { 28, 29, 30, 31, 32 });
				add(new Integer[] { 29, 30, 31, 32 });
				add(new Integer[] { 30, 31, 32 });

				add(new Integer[] { 32 }); //31
				add(new Integer[] { 33 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37, 41 });
				add(new Integer[] { 38, 39 });
				add(new Integer[] { 39 });
				add(new Integer[] { 40 });
				add(new Integer[] { 41, 37 });

				add(new Integer[] { 42, 43, 44 });//41
				add(new Integer[] { 43, 44 });
				add(new Integer[] { 44 });
				add(new Integer[] { 45 });
				add(new Integer[] { 45, 46, 47, 48 });

				add(new Integer[] { 47, 48 });
				add(new Integer[] { 48 });
				add(new Integer[] { 49, 36 });
				add(new Integer[] { 50, 33 });
				add(new Integer[] { 51, 17 });

				add(new Integer[] { 52, 53 });//51
				add(new Integer[] { 52, 53 });
				add(new Integer[] {});

			}

		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
