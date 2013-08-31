package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt303AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 }); // 1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9, 10, 11, 18, 33 });
				add(new Integer[] { 10, 11, 18, 33 });
				add(new Integer[] { 11, 18, 33 });

				add(new Integer[] { 12 }); //11
				add(new Integer[] { 13 });
				add(new Integer[] { 14 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16 });
				add(new Integer[] { 17, 18, 33 });
				add(new Integer[] { 18, 33 });
				add(new Integer[] { 19 });
				add(new Integer[] { 20 });
				add(new Integer[] { 21 });

				add(new Integer[] { 22, 23, 24 }); //21
				add(new Integer[] { 23, 24 });
				add(new Integer[] { 24 });
				add(new Integer[] { 25 });
				add(new Integer[] { 26 });
				add(new Integer[] { 27 });
				add(new Integer[] { 28 });
				add(new Integer[] { 29 });
				add(new Integer[] { 30 });
				add(new Integer[] { 31 });

				add(new Integer[] { 32, 33 }); //31
				add(new Integer[] { 33 });
				add(new Integer[] { 34 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36 });
				add(new Integer[] { 37 });
				add(new Integer[] { 38, 39, 40 });
				add(new Integer[] { 39, 40 });
				add(new Integer[] { 40 });
				add(new Integer[] { 41 });

				add(new Integer[] { 42, 43, 44 }); //41
				add(new Integer[] { 44, 43 });
				add(new Integer[] { 44 });
				add(new Integer[] { 46, 45 });
				add(new Integer[] { 46 });
				add(new Integer[] { 47, 48, 49 });
				add(new Integer[] { 48, 49 });
				add(new Integer[] { 49 });
				add(new Integer[] { 33, 50 });
				add(new Integer[] { 33 }); // 50
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
