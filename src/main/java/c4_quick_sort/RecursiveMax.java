package c4_quick_sort;

import java.util.Arrays;

/**
 * 4.3 找出列表中最大的数字
 * 
 * @author yangTan
 *
 */
public class RecursiveMax {

	public static void main(String[] args) {
		// System.out.println(max(new int[] { 100, 5, 10, 25, 16, 1 }));
		System.out.println(max(new int[] { 100, 2, 200 }));
	}

	private static Integer max(int[] list) {

		if (list.length == 0) {
			return null;
		}

		if (list.length < 2) {
			return list[0];
		}

		if (list.length == 2) {
			return list[0] > list[1] ? list[0] : list[1];
		}
		int subMax = max(Arrays.copyOfRange(list, 1, list.length));
		return list[0] > subMax ? list[0] : subMax;

	}

}