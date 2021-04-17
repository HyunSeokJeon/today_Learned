package algorithm.quicksort;

import java.util.ArrayList;
import java.util.List;

public class QuicksortExample {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(1);
		list2.add(2);
		list2.add(4);
		list2.add(5);

		Qsort qs = new Qsort();
		qs.accumlate(list2);
		System.out.println(qs.list);
	}
}
