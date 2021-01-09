package c2_selection_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 选择排序
 * @author yangTan
 *
 */
public class Selection_sort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 6, 1, 33, 56, 8));
		
		System.out.println(selectionSort(list));
	}

	/**
	 * 选择排序
	 * @param list
	 * @return
	 */
	public static List<Integer> selectionSort(List<Integer> list) {

		List<Integer> newList = new ArrayList<Integer>();


		int size = list.size();
		for (int i = 0; i < size; i++) {

			int index = findSmallest(list);
			newList.add(list.get(index));
			list.remove(index);
		}

		return newList;

	}

	/**
	 * 找到最小值的下标
	 * @param list
	 * @return 最小值的下标
	 */
	public static int findSmallest(List<Integer> list) {

		Integer smallest = list.get(0);
		int smallestIndex = 0;

		for (int i = 1; i < list.size(); i++) {
			if (smallest > list.get(i)) {
				smallest = list.get(i);
				smallestIndex = i;
			}
		}

		return smallestIndex;

	}
}
