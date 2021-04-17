package algorithm.quicksort2;

import java.util.ArrayList;
import java.util.List;

public class Qsort {
	private List<Integer> list;
	
	public Qsort() {
		list = new ArrayList<Integer>();
	}
	
	public void add(Integer a) {
		System.out.println(list);
		System.out.println(a);
		int cnt = 0;
		while (list.size()>cnt) {
			if (list.get(cnt) > a) {
				list.add(cnt, a);
				return;
			}
			cnt++;
		}
		list.add(a);
//		list.add(a);
	}
	
	public void b(Qsort q) {
		List<Integer> a = new ArrayList<Integer>();
		a.addAll(list);
		list.clear();
		
		int left_cnt = 0;
		int right_cnt = 0;
		while (a.size() > left_cnt && q.getList().size() > right_cnt) {
			if (a.get(left_cnt) < q.getList().get(right_cnt)) {
				list.add(a.get(left_cnt++));
			}else {
				list.add(q.getList().get(right_cnt++));
			}
		}
		while (a.size() > left_cnt) {
			list.add(a.get(left_cnt++));
		}
		while (q.getList().size() > right_cnt) {
			list.add(q.getList().get(right_cnt++));
		}

	}
	
	public List<Integer> getList(){
		return list;
	}
}
