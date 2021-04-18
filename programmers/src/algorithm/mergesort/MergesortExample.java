package algorithm.mergesort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergesortExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Collections.shuffle(list);
		
		System.out.println(list);
		
		List<Integer>list2 = MergesortInstance.mergesort(list);
		System.out.println(list2);
		
	}
}
