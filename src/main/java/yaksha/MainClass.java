package yaksha;

public class MainClass {
	public static void main(String[] args) {
		int i;
		int[] arr = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
		int result[]=QuickSort.quickSort(arr, 0, 9);
		System.out.println("\n The sorted array is: \n");
		for (i = 0; i < 10; i++)
			System.out.println(result[i]);///
	}
}
