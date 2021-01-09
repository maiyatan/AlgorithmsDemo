package c4_quick_sort;

import java.util.Arrays;
/**
 * 4.2 编写一个递归函数来计算列表包含的元素个数。
 * @author yangTan
 *
 */
public class RecursiveCount {

	public static void main(String[] args) {
		int[] arr = { 1, 10, 4, 5, 9, 0, 9 };

		System.out.println(count(arr));

	}

	private static int count(int[] arr) {

		while (arr.length > 0) {

			return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
		}

		return 0;
	}

}
