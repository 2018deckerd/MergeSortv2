import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * JUnit Tester Class
 * @author Dylan Decker
 */

import org.junit.Test;

public class MergeSorterTest {

	@Test
	public void testMergeSort() {
		// fail("Not yet implemented");
	}

	@Test
	public void testMerge() {
		// test case
		int[] testArray = {2, 3, 1};
		MergeSorter.merge(testArray, 0, 1, 2);
		int[] sorted = {1, 2, 3};
		assertTrue(Arrays.equals(testArray, sorted));
		}
	
	@Test
	public void testMerge2() {
		// test case
		int[] testArray = {-3, 3, 1};
		MergeSorter.merge(testArray, 0, 1, 2);
		int[] sorted = {-3, 1, 3};
		assertTrue(Arrays.equals(testArray, sorted));
	}
	}


