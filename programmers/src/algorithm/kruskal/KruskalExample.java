package algorithm.kruskal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KruskalExample {
	
	public Map<String, String> parent;
	public Map<String, Integer> rank;
	
	public KruskalExample() {
		parent = new HashMap<String, String>();
		rank = new HashMap<String, Integer>();
	}
	
	@SuppressWarnings("unchecked")
	public List<List<String>> kruskal(Map<String, List<?>> map) {
		List<List<String>> mst = new ArrayList<List<String>>();
		for (Object item : map.get("vetices")) {
			if(item instanceof String) {
				String node = (String) item;
				make_set(node);
			}else {
				System.out.println("type error!");
			}
		}
		List<String[]> graphList = (List<String[]>) map.get("edges");
		
		Collections.sort(graphList, (a, b) -> Integer.parseInt(a[0])-Integer.parseInt(b[0]));
		
		for (String[] edge : graphList) {
			int weight = Integer.parseInt(edge[0]);
			String node_v = edge[1];
			String node_u = edge[2];
			if (!find(node_v).equals(find(node_u))){
				union(node_v, node_u);
				mst.add(Arrays.asList(edge));
			}
			
		}
		return mst;
		
	}
	
	public void make_set(String node) {
		parent.put(node, node);
		rank.put(node, 0);
	}
	
	public void union(String node_v, String node_u) {
		
		String root1 = find(node_v);
		String root2 = find(node_u);
		
		if(rank.get(root1) > rank.get(root2)) {
			parent.put(root2, root1);
		}else {
			parent.put(root1, root2);
			if (rank.get(root1) == rank.get(root2)){
				int root2Int = rank.get(root2) + 1;
				rank.put(root2, root2Int);
			}
		}
	}
	
	public String find(String node) {
		if(!parent.get(node).equals(node)) {
			parent.put(node, find(parent.get(node)));
		}
		return parent.get(node);
	}
	
	public static void main(String[] args) {
		Map<String, List<?>> graph = new HashMap<String, List<?>>();
		String[] strList = {"A", "B", "C", "D", "E", "F", "G"};
		String[][] strlistlist = {{"7", "A", "B"},
		         {"5", "A", "D"},
		         {"9", "B", "D"},
		         {"7", "B", "A"},
		         {"8", "B", "C"},
		         {"7", "B", "E"},
		         {"8", "C", "B"},
		         {"5", "C", "E"},
		         {"5", "D", "A"},
		         {"9", "D", "B"},
		         {"7", "D", "E"},
		         {"6", "D", "F"},
		         {"5", "E", "C"},
		         {"7", "E", "B"},
		         {"7", "E", "D"},
		         {"8", "E", "F"},
		         {"9", "E", "G"},
		         {"6", "F", "D"},
		         {"8", "F", "E"},
		         {"11", "F", "G"},
		         {"9", "G", "E"},
		         {"11", "G", "F"}};
		
		graph.put("vetices", Arrays.asList(strList));
		graph.put("edges", Arrays.asList(strlistlist));
		KruskalExample ke = new KruskalExample();
		
		System.out.println(ke.kruskal(graph));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		         
	}
}
