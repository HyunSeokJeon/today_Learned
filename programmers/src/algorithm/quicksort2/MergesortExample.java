package algorithm.quicksort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergesortExample {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();

		for (int i = 0; i < 500; i++) {
			list1.add(i);
		}
		Collections.shuffle(list1);
		
		List<Integer> sorted = list1.parallelStream()
							.collect(ArrayList::new, (a, b) -> {
								System.out.println(Thread.currentThread().getName());
								int cnt = 0;
								while (a.size()>cnt) {
									if (a.get(cnt) > b) {
										a.add(cnt, b);
										return;
									}
									cnt++;
								}
								a.add(b);
							}, (alist, blist) -> {
								List<Integer> templist = new ArrayList<Integer>();
								templist.addAll(alist);
								alist.clear();
								int left_cnt = 0;
								int right_cnt = 0;
								while (templist.size() > left_cnt && blist.size() > right_cnt) {
									if (templist.get(left_cnt) < blist.get(right_cnt)) {
										alist.add(templist.get(left_cnt++));
									}else {
										alist.add(blist.get(right_cnt++));
									}
								}
								while (templist.size() > left_cnt) {
									alist.add(templist.get(left_cnt++));
								}
								while (blist.size() > right_cnt) {
									alist.add(blist.get(right_cnt++));
								}
							});
		System.out.println(sorted);
	}
}
