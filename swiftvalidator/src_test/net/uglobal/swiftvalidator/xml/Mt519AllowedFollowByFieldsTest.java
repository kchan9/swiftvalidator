package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt519AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 10 });
				add(new Integer[] { 5, 10 });
				add(new Integer[] { 6, 7, 8 });
				add(new Integer[] { 7, 8 }); // 6
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 5, 10 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12 }); // 11
				add(new Integer[] { 12, 13 }); // 12
				add(new Integer[] { 13, 14, 15, 16, 17, 30, 34 });
				add(new Integer[] { 15, 16, 17, 30, 34 });
				add(new Integer[] { 16, 17, 30, 34 });
				add(new Integer[] { 17, 30, 34 });
				add(new Integer[] { 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 });

				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29 }); // 21
				add(new Integer[] { 22, 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29 });
				add(new Integer[] { 25, 26, 27, 28, 29 });
				add(new Integer[] { 26, 27, 28, 29 });
				add(new Integer[] { 27, 28, 29 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30, 34 });
				add(new Integer[] { 31, 32, 33 });

				add(new Integer[] { 32, 33 }); // 31
				add(new Integer[] { 33 });
				add(new Integer[] { 34 });
				add(new Integer[] { 35, 52 });
				add(new Integer[] { 36, 44, 51 });
				add(new Integer[] { 37 });
				add(new Integer[] { 37, 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 38, 39, 40, 41, 42, 43 });
				add(new Integer[] { 39, 40, 41, 42, 43 });
				add(new Integer[] { 40, 41, 42, 43 });

				add(new Integer[] { 41, 42, 43 }); // 41
				add(new Integer[] { 42, 43 });
				add(new Integer[] { 44, 51 });
				add(new Integer[] { 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 45, 46, 47, 48, 49, 50 });
				add(new Integer[] { 47, 48, 49, 50 });
				add(new Integer[] { 47, 48, 49, 50 });
				add(new Integer[] { 48, 49, 50 });
				add(new Integer[] { 50 });
				add(new Integer[] { 51 });

				add(new Integer[] { 52, 35 }); // 51
				add(new Integer[] { 53, 54 });
				add(new Integer[] { 53, 54 });
				add(new Integer[] {});
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
