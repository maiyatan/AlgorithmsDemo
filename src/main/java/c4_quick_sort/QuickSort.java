package c4_quick_sort;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 快速排序 思路：选择一个值（一般选列表的第一个）作为对比，把比这个值小的放到less列表，比它大的放greater列表，
 * 然后递归快速排序方法，把less、对比值、greater合并到一起，就排序出来了。
 * 
 * @author yangTan
 * 语法说明：
 * 1. 使用了java8新特性 Stream，用来做计算等处理。它有很多中间处理，
 *  filter：过滤
 *  collect：收集。组成数组等
 *  map：映射。
 *  flatMap：把多个流压到一起
 * 2.identity()就是Function接口的一个静态方法。
 *         Function.identity()返回一个输出跟输入一样的Lambda表达式对象，等价于形如t -> t形式的Lambda表达式
 */
public class QuickSort {

	public static void main(String[] args) {
		System.out.println(quicksort(Arrays.asList(10, 5, 2, 3, 3, 8))); 

	}

	private static List<Integer> quicksort(List<Integer> list) {

		if (list.size() < 2) {
			return list;
		} else {

			Integer povit = list.get(0);

			List<Integer> less = list.stream().skip(1).filter(v -> v <= povit).collect(Collectors.toList());
			List<Integer> greater = list.stream().skip(1).filter(v -> v > povit).collect(Collectors.toList());

			List<Integer> collect = Stream.of(quicksort(less).stream(), Stream.of(povit), quicksort(greater).stream())
					.flatMap(Function.identity()).collect(Collectors.toList());

			return collect;
		}
	}
}
