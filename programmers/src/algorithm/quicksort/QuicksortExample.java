package algorithm.quicksort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuicksortExample {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		int a = 1;
		while (list1.size() != 20) {
			list1.add(a++);
		}
		Collections.shuffle(list1);
		System.out.println(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(1);
		list2.add(2);
		list2.add(4);
		list2.add(5);

		Qsort qs = new Qsort();
		System.out.println(qs.Quicksort(list2));
	}
}
