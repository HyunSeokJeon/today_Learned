package algorithm.mergesort;

import java.util.ArrayList;
import java.util.List;

public class Mergesort {
	// 나누는 함수
	List<Integer> divide(List<Integer> list){
		if (list.size() <= 1) {
			return list; //재귀동작을 마무리
		}
		int centerIndex = list.size() / 2;
		List<Integer> left = list.subList(0, centerIndex);
		List<Integer> right = list.subList(centerIndex, list.size());
		
		return merge(divide(left), divide(right));
	}
	
	// 합치는 함수
	List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> mergedList = new ArrayList<Integer>();
		int left_index = 0;
		int right_index = 0;
		while (left.size() > left_index && right.size() > right_index) {
			if (left.get(left_index) < right.get(right_index)) {
				mergedList.add(left.get(left_index++));
			} else {
				mergedList.add(right.get(right_index++));
			}
		}
		if (right.size() > right_index) {
			mergedList.addAll(right.subList(right_index, right.size()));
		}
		if (left.size() > left_index) {
			mergedList.addAll(left.subList(left_index, left.size()));
		}
		
		return mergedList;
	}
}
