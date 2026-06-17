package sorts;

public class SelectionSort implements SortAlgorithem{

	@Override
	public <T extends Comparable<T>> T[] sort(T[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			final int minIndex = findMinIndex(arr,i);
			if (minIndex != i)
				SortUtils.swap(arr, i, minIndex);
		}
		return arr;
	}

	private static <T extends Comparable<T>> int findMinIndex(T[] arr, int startIndex) {
		int minIndex = startIndex;
		for (int j = startIndex+1; j < arr.length; j++) {
			if(SortUtils.less(arr[j], arr[minIndex])) {
				minIndex = j;
			}
		}
		return minIndex;
	}
	
	

}
