package sorts;

final class SortUtils {
	
	private SortUtils() {
		
	}

	/**
     * Compares two elements to see if the first is greater than the second.
     *
     * @param firstElement  the first element to compare
     * @param secondElement the second element to compare
     * @return true if the first element is greater than the second, false otherwise
     */
	public static <T extends Comparable<T>> boolean greater(T firstElement, T secondElement) {
		return firstElement.compareTo(secondElement) > 0;
	}


	/**
     * Swaps two elements at the given positions in an array.
     *
     * @param array the array in which to swap elements
     * @param i     the index of the first element to swap
     * @param j     the index of the second element to swap
     * @param <T>   the type of elements in the array
     */
	public static <T> void swap(T[] array, int i, int j) {
		if(i!=j) {
			final T temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
	}

	/**
     * Compares two elements to see if the first is less than the second.
     *
     * @param firstElement  the first element to compare
     * @param secondElement the second element to compare
     * @return true if the first element is less than the second, false otherwise
     */
	public static <T extends Comparable<T>> boolean less(T firstElement, T secondElement) {
		// TODO Auto-generated method stub
		return firstElement.compareTo(secondElement) < 0;
	}
}
