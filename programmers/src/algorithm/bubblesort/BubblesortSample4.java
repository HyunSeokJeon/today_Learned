package algorithm.bubblesort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class BubblesortSample4 {
	public static void main(String[] args) {
		Random random = new Random();
		IntStream a = random.ints(1, 10000);
		Iterator<Integer> iterator = a.iterator();
		List<Integer> list = new ArrayList<Integer>();
		int b;
		while (list.size() != 100) {
			b = iterator.next();
			list.add(b);
		}
		System.out.println(list);
		bubblesort(list);
		System.out.println(list);
		
	}
	
	/**
	 * @author hyunseok
	 * @param list
	 * @return bubblesorted list
	 * @summary 
	 * 			temp : 두 수를 바꿀때 임시로 값 저장
	 * 			ex) a = 1, b = 10 일때 a = 10, b = 1로 만들기 위해
	 * 				temp = a
	 * 				a = b
	 * 				b = temp
	 * 				위와 같은 과정으로 사용
	 * 			
	 * 			int i : 배열을 순회하는 횟수 = 1번, 2번, 3번, ..., (list.size() - 1)번
	 * 
	 * 			int j : 배열의 0번 index부터 순회하는데,
	 * 					i번 순회때는 0번부터 (list.size() - i - 1)번까지  (list.size() - i) 번 순회
	 * 					ex) i = 3, list.size() = 10 일때
	 * 						j는 0번 부터 (10 - 3 - 1) = 6번까지 (10 - 3) = 7번을 순회하게 된다.
	 * 
	 * 			sortFlag :  배열의 0번부터 순회할때 한번이라도 바뀌면 false
	 * 						배열의 index를 순회하고 난 뒤에 true이면 정렬이 완료되었다고 간주 빠져나온다.
	 * 						i번째 배열을 돌때마다 true로 초기화 
	 * 						
	 */
	public static List<Integer> bubblesort(List<Integer> list) {
		int temp;
		boolean sortFlag;
		for (int i = 1; i < list.size(); i++) {
			sortFlag = true;
			for (int j = 0; j < list.size() - i; j++) {
				if (list.get(j) > list.get(j + 1)) {
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j + 1, temp);
					sortFlag = false;
				} else {
					continue;
				}
			}
			if (sortFlag) {
				break;
			}
		}
		return list;
	}
}
