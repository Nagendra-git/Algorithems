package sorts;

final class SortUtils {
	
	private SortUtils() {
		
	}

	public static <T extends Comparable<T>> boolean greater(T firstElement, T secondElement) {
		return firstElement.compareTo(secondElement) > 0;
	}

	public static <T> void swap(T[] array, int i, int j) {
		if(i!=j) {
			final T temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
	}
}
