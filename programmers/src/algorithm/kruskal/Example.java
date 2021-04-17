package algorithm.kruskal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		Map<String, String> parent = new HashMap<String, String>();
		parent.put("a", "a");
		System.out.println(parent);
		parent.put("a", "b");
		System.out.println(parent);
		
		List<String> list;
		String a = "a b c";
		list = Arrays.asList(a.split(" "));
		System.out.println(list);
	}
}
