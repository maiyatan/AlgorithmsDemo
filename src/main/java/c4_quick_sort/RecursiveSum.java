package c4_quick_sort;

import java.util.Arrays;

/**
 * 用递归方法写求和
 * 
 * Arrays.copyOfRange(T[ ] original,int from,int to)
 * 将一个原始的数组original，从下标from开始复制，复制到上标to，生成一个新的数组。
 * 
 * @author yangTan
 *
 */
public class RecursiveSum {

	public static void main(String[] args) {
		int[] arr = { 1, 10, 4, 5 };

		System.out.println(summation(arr));
	}

	private static int summation(int[] arr) {
		while (arr.length > 0) {
			int i = arr[0];

			return i + summation(Arrays.copyOfRange(arr, 1, arr.length));
		}
		return 0;

	}

}
