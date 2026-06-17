package sorts;

public class Main {
	
	public static void main(String[] args) {
//		BubbleSort sort = new BubbleSort();
		SelectionSort sort = new SelectionSort();
		Integer[] input = {5, 3, 8, 1, 2};
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] +" ");
		}
		System.out.println();
		System.out.println("After sorting the array");
		sort.sort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] +" ");
		}

	}
}
