package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt203AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2 });
				add(new Integer[] { 3, 4, 5, 6, 7 });
				add(new Integer[] { 4, 5, 6, 7 });
				add(new Integer[] { 5, 6, 7 });
				add(new Integer[] { 6, 7 });
				add(new Integer[] { 7 });
				add(new Integer[] { 8 });
				add(new Integer[] { 9 });
				add(new Integer[] { 10, 11, 12 });
				add(new Integer[] { 11, 12 });

				add(new Integer[] { 12 });
				add(new Integer[] { 13 });
				add(new Integer[] { 7 });
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
