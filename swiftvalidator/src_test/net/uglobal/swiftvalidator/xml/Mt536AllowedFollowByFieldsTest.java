package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt536AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 8, 9, 13, 14 });
				add(new Integer[] { 10, 11 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12 }); //11
				add(new Integer[] { 9, 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 15, 16 });
				add(new Integer[] { 17, 51 });
				add(new Integer[] { 18, 19, 20, 21, 22, 50 });
				add(new Integer[] { 19, 20, 21, 22, 50 });
				add(new Integer[] { 20, 21, 22, 50 });
				add(new Integer[] { 21, 22, 50 });

				add(new Integer[] { 22, 50 }); //21
				add(new Integer[] { 23 });
				add(new Integer[] { 24, 25, 26, 27, 28 });
				add(new Integer[] { 25, 26, 27, 28 });
				add(new Integer[] { 26, 27, 28 });
				add(new Integer[] { 27, 28 });
				add(new Integer[] { 27, 28 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30, 31 });
				add(new Integer[] { 31 });

				add(new Integer[] { 32 }); //31
				add(new Integer[] { 29, 33, 48 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 34, 35 });
				add(new Integer[] { 35, 36, 37, 38 });
				add(new Integer[] { 37, 38 });
				add(new Integer[] { 37, 38 });
				add(new Integer[] { 39, 38 });
				add(new Integer[] { 39, 40, 41, 42, 47 });
				add(new Integer[] { 41, 42, 47 });

				add(new Integer[] { 42, 47 }); //41
				add(new Integer[] { 43 });
				add(new Integer[] { 44, 45, 46 });
				add(new Integer[] { 45, 46 });
				add(new Integer[] { 46 });
				add(new Integer[] { 42, 47 });
				add(new Integer[] { 48 });
				add(new Integer[] { 28, 49 });
				add(new Integer[] { 22, 50 });
				add(new Integer[] { 17, 51 });

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
