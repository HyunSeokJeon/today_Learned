package algorithm.quicksort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuicksortExample {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i = 0; i < 500; i++) {
			list1.add(i);
		}
		Collections.shuffle(list1);
		System.out.println(list1);
		long start1 = System.nanoTime();
		Qsort qSort = list1.parallelStream()
				.collect(Qsort::new, Qsort::add, Qsort::b);
		long end1 = System.nanoTime();
		List<Integer> sortedList = qSort.getList();
		System.out.println(sortedList);
		
		long time1 = end1 - start1;
		System.out.println(time1);
		
		long start2 = System.nanoTime();
		List<Integer> bublesortedList = bubblesort(list1);
		long end2 = System.nanoTime();
		long time2 = end2 - start2;
		System.out.println(bublesortedList);
		System.out.println(time2);
		
	}
	
	public static List<Integer> bubblesort(List<Integer> list) {
		List<Integer> returnList = new ArrayList<Integer>();
		returnList.addAll(list);
		int temp;
		boolean sortFlag;
		for (int i = 1; i < returnList.size(); i++) {
			sortFlag = true;
			for (int j = 0; j < returnList.size() - i; j++) {
				if (returnList.get(j) > returnList.get(j + 1)) {
					temp = returnList.get(j);
					returnList.set(j, returnList.get(j+1));
					returnList.set(j + 1, temp);
					sortFlag = false;
				} else {
					continue;
				}
			}
			if (sortFlag) {
				break;
			}
		}
		return returnList;
	}
}
