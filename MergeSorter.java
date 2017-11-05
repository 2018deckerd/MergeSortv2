
/**
 * Implements the merge sorting technique with two methods, mergeSort and merge.
 * @author Dylan Decker
 *
 */
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		int mid = 0;
		if (lo < hi) {
			mid = (lo + hi) / 2;
			mergeSort(list, lo, mid);
			mergeSort(list, mid + 1, hi);
			merge(list, lo, mid, hi);
		}
	}
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		/*
		 * This method should merge the two subarrays from lo to mid, and
		 * from mid + 1 to hi into a new sorted array that overwrites
		 * the entries in list from lo to hi.
		 */
		int[] tempArray = new int[list.length]; // scratch array for sorting
		int pointerLeft =  0; // index counter for left subarray
		int pointerRight = mid + 1; // index counter for right subarray
		int pointerMerge = 0; // index counter for final sorted list
		System.arraycopy(list, 0, tempArray, 0, list.length); // copies elements of given array to temp array
		boolean finishMerge = false;
		// merges the two sub-lists together 
		
		while (finishMerge == false) {
		  if (pointerLeft != mid + 1 && pointerRight != hi + 1) {
			if (list[pointerLeft] < tempArray[pointerRight]) {
				list[pointerMerge] = tempArray[pointerLeft];
				pointerLeft++;
				pointerMerge++;
			} else if (list[pointerRight] < tempArray[pointerLeft])  {
				list[pointerMerge] = tempArray[pointerRight];
				pointerRight++;
				pointerMerge++;
		    } else {
		    	finishMerge = true;
		    }
		 } else {
			 finishMerge = true;
		 }
		}
		
		// sorting when one of the "sides" have reached their bound 
		if (pointerLeft == mid + 1) {
			while (pointerRight != hi + 1) {
				list[pointerMerge] = tempArray[pointerRight];
				pointerMerge++;
				pointerRight++;
			}

		} else if (pointerRight == hi + 1) {
			while (pointerLeft != mid + 1) {
				list[pointerMerge] = tempArray[pointerLeft];
				pointerMerge++;
				pointerLeft++;
			}
		}
		
	}
}
	

		// merging
		
		// need while loop
		// have conditional inside for loop
	
	
	

