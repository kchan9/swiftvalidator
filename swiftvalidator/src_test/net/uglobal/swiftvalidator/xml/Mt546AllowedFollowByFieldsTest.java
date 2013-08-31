package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt546AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 });
				add(new Integer[] { 3 });
				add(new Integer[] { 4, 5, 6 });
				add(new Integer[] { 5, 6 });
				add(new Integer[] { 5, 6 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10 });
				add(new Integer[] { 6, 11 });
				add(new Integer[] { 12 });
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14, 15, 16, 17 });
				add(new Integer[] { 16, 17 });
				add(new Integer[] { 17 });
				add(new Integer[] { 18, 32, 33, 34 });
				add(new Integer[] { 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 23, 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 24, 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 25, 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 26, 27, 28, 29, 30, 31 });
				add(new Integer[] { 27, 28, 29, 30, 31 });
				add(new Integer[] { 28, 29, 30, 31 });
				add(new Integer[] { 29, 30, 31 });
				add(new Integer[] { 31 });
				add(new Integer[] { 32, 33, 34 });
				add(new Integer[] { 32, 33, 34 });
				add(new Integer[] { 33, 34 });
				add(new Integer[] { 35 });
				add(new Integer[] { 36 });
				add(new Integer[] { 36, 37, 38, 39, 40, 41 });
				add(new Integer[] { 37, 38, 39, 40, 41 });
				add(new Integer[] { 39, 40, 41 });
				add(new Integer[] { 39, 40, 41 });
				add(new Integer[] { 41 });
				add(new Integer[] { 41, 42, 43, 50 });
				add(new Integer[] { 43, 50 });
				add(new Integer[] { 44, 45, 46, 47, 48, 49 });
				add(new Integer[] { 45, 46, 47, 48, 49 });
				add(new Integer[] { 46, 47, 48, 49 });
				add(new Integer[] { 47, 48, 49 });
				add(new Integer[] { 48, 49 });
				add(new Integer[] { 48, 49 });
				add(new Integer[] { 43, 50 });
				add(new Integer[] { 51, 60 });
				add(new Integer[] { 52, 53, 54, 55, 56, 57, 58, 59 });
				add(new Integer[] { 52, 53, 54, 55, 56, 57, 58, 59 });
				add(new Integer[] { 53, 54, 55, 56, 57, 58, 59 });
				add(new Integer[] { 54, 55, 56, 57, 58, 59 });
				add(new Integer[] { 55, 56, 57, 58, 59 });
				add(new Integer[] { 56, 57, 58, 59 });
				add(new Integer[] { 57, 58, 59 });
				add(new Integer[] { 59 });
				add(new Integer[] { 60 });
				add(new Integer[] { 61 });
				add(new Integer[] { 61, 62 });
				add(new Integer[] { 63 });
				add(new Integer[] { 63, 64, 65, 66, 67, 68 });
				add(new Integer[] { 65, 66, 67, 68 });
				add(new Integer[] { 66, 67, 68 });
				add(new Integer[] { 67, 68 });
				add(new Integer[] { 67, 68 });
				add(new Integer[] { 62, 69, 75 });
				add(new Integer[] { 70 });
				add(new Integer[] { 70, 71, 72, 73, 74 });
				add(new Integer[] { 71, 72, 73, 74 });
				add(new Integer[] { 73, 74 });
				add(new Integer[] { 73, 74 });
				add(new Integer[] { 69, 75 });
				add(new Integer[] { 76, 77 });
				add(new Integer[] { 76, 77 });
				add(new Integer[] { 77, 78, 79, 80 });
				add(new Integer[] { 79, 80 });
				add(new Integer[] { 80 });
				add(new Integer[] { 75, 81 });
				add(new Integer[] { 82 });
				add(new Integer[] { 83 });
				add(new Integer[] { 83, 84, 85, 86, 87 });
				add(new Integer[] { 85, 86, 87 });
				add(new Integer[] { 85, 86, 87 });
				add(new Integer[] { 87 });
				add(new Integer[] { 82 });
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}

}
