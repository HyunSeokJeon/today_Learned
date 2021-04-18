package algorithm.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Qsort {
	public List<Integer> list;
	
	public Qsort() {
		list = new ArrayList<Integer>();
	}
	
	
	
	public List<Integer> Quicksort(List<Integer> list){
		if (list.size() <= 1) {
			return list;
		}
		int a = list.get(0);
		List<Integer> left = list.stream()
								.filter(i -> i < a)
								.collect(Collectors.toList());
		
		List<Integer> right = list.stream()
								.filter(i -> i > a)
								.collect(Collectors.toList());
		
		List<Integer> sortedList = new ArrayList<Integer>();
		sortedList.addAll(Quicksort(left));
		sortedList.add(a);
		sortedList.addAll(Quicksort(right));
		
		
		return sortedList;
	}
	
	
}
