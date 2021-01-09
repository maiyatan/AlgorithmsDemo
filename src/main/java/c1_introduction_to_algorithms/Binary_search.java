package c1_introduction_to_algorithms;

/**
 * 二分查找法
 * 
 * @author yangTan
 *
 */
public class Binary_search {

	public static void main(String[] args) {
		int list[] = { 1, 2, 4, 6, 7, 9 };
		int item = -2;

		Integer index = BinarySearch(list, item);
		System.out.println(index);
	}

	private static Integer BinarySearch(int[] list, int item) {

		// 定义数组的起始位置和最大位置
		int low = 0;
		int high = list.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;
			int guess = list[mid];

			if (guess == item) {
				return mid;
			} else if (guess > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return null;
	}

}
