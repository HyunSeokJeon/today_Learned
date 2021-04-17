package algorithm.quicksort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Qsort {
	public List<Integer> list;
	
	public Qsort() {
		list = new ArrayList<Integer>();
	}
	
	
	
	public List<Integer> accumlate(List<Integer> list){
		if (list.size() <= 1) {
			return list;
		}
		int a = list.get(0);
		list.remove(0);
		List<Integer> left = list.stream()
								.filter(i -> i < a)
								.collect(Collectors.toList());
		
		List<Integer> right = list.stream()
								.filter(i -> i > a)
								.collect(Collectors.toList());
		return this.list;
	}
	
	
}
