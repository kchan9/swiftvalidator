package net.uglobal.swiftvalidator.xml;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class Mt207AllowedFollowByFieldsTest extends AbstractMtAllowedFollowByFieldsTest {

	protected ArrayList<Integer[]> getAllowedList() {
		return new ArrayList<Integer[]>() {
			{
				add(new Integer[] { 2, 3 });//1
				add(new Integer[] { 3 });
				add(new Integer[] { 4 });
				add(new Integer[] { 5, 6 });
				add(new Integer[] { 6 });
				add(new Integer[] { 7, 8, 9 }); // 6
				add(new Integer[] { 8, 9 });
				add(new Integer[] { 9 }); // 8 
				add(new Integer[] { 10, 11 });
				add(new Integer[] { 10, 11 });

				add(new Integer[] { 12, 13, 14 });//11
				add(new Integer[] { 13, 14 });
				add(new Integer[] { 14 });
				add(new Integer[] { 9 });
			}
		};
	}

	@Test
	public void test() throws FileNotFoundException {
		super.testFieldsSequence();
	}
}
