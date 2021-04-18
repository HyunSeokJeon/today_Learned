package algorithm.mergesort;

import java.util.ArrayList;
import java.util.List;

public class MergesortInstance {
	
	static List<Integer> mergesort(List<Integer> list) {
		List<Integer> sortedList =
		list.parallelStream()
		.collect(
			// 생성자
			ArrayList::new
			
			// 수집
			,(a, b) ->
			a.add(b)
			
			// 병합
			,(main, right) -> {
			List<Integer> left = new ArrayList<Integer>();
			left.addAll(main);
			main.clear();
			int left_index = 0;
			int right_index = 0;
			while (left.size() > left_index && right.size() > right_index) {
				if (left.get(left_index) < right.get(right_index)) {
					main.add(left.get(left_index++));
				} else {
					main.add(right.get(right_index++));
				}
			}
			if (right.size() > right_index) {
				main.addAll(right.subList(right_index, right.size()));
			}
			if (left.size() > left_index) {
				main.addAll(left.subList(left_index, left.size()));
			}
		});
		return sortedList;	
	}
}
