package c6_breadth_first_search;

import java.util.*;

/**
 * _广度优先搜索
 * 
 * @author yangTan
 *
 */
public class BreadthFirstSearch {
	private static Map<String, List<String>> graph = new HashMap<>();

	private static boolean search(String name) {

		ArrayList<String> searched = new ArrayList<String>();
		// 用队列处理
		Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));

		// 如果队列中还有数据，就进行查询处理
		while (!searchQueue.isEmpty()) {

			String searchName = searchQueue.poll();
			// 检查是否已经搜索过
			if (!searched.contains(searchName)) {
				if (person_is_seller(searchName)) {
					System.out.println("芒果商是:" + searchName);
					return true;
				}
				// 把检查人的朋友加入到队列
				List<String> list = graph.get(searchName);
				if (list != null) {
					searchQueue.addAll(list);
				}
				// 检查过的放到已检查list
				searched.add(searchName);
			}

		}
		System.out.println("这里没有芒果商");
		return false;

	}

	private static boolean person_is_seller(String name) {
		return name.endsWith("m");
	}

	public static void main(String[] args) {
		graph.put("you", Arrays.asList("alice", "bob", "claire"));
		graph.put("bob", Arrays.asList("anuj", "peggy"));
		graph.put("alice", Arrays.asList("peggy"));
		graph.put("claire", Arrays.asList("tho", "jonny"));
		graph.put("anuj", Collections.emptyList());
		graph.put("peggy", Collections.emptyList());
		graph.put("thom", Collections.emptyList());
		graph.put("jonny", Collections.emptyList());

		search("you");
	}
}
