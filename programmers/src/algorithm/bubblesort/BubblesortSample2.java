package algorithm.bubblesort;

import java.util.ArrayList;
import java.util.List;

public class BubblesortSample2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(7);
		list.add(4);
		list.add(1);
		System.out.println(list);
		bubblesort(list);
		System.out.println(list);
	}

	public static List<Integer> bubblesort(List<Integer> list) {
		int temp;
		for (int i = 1; i < 4; i++) {
			
			for (int j = 0; j < 4 - i; j++) {
				
				if (list.get(j) > list.get(j + 1)) {
					
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j + 1, temp);
					
				} else {
					continue;
				}

			}

		}
		return list;
	}
}
