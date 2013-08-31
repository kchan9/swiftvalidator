package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt205covAllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 });//1
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 3, 4 });
				add(new Integer[] { 5 });
				add(new Integer[] { 6, 7, 8, 9 });
				add(new Integer[] { 7, 8, 9 });
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10, 11 });
				add(new Integer[] { 11 });

				add(new Integer[] { 12, 13, 14, 15 });
				add(new Integer[] { 13, 14, 15 });
				add(new Integer[] { 14, 15 });
				add(new Integer[] { 15 });
				add(new Integer[] { 16, 17, 18 });
				add(new Integer[] { 17, 18 });
				add(new Integer[] { 18 });
				add(new Integer[] {});
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
