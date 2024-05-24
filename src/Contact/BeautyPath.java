package Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BeautyPath {
	public static int beauty(int n, int m, String S, int[] X, int[] Y) {
	    // First, create the adjacency list for the graph
	    List<List<Integer>> adjList = new ArrayList<>();
	    for (int i = 0; i < n; i++) {
	        adjList.add(new ArrayList<>());
	    }
	    for (int i = 0; i < m; i++) {
	        adjList.get(X[i]-1).add(Y[i]-1);
	    }
	    
	    // Then, create a map to count the frequency of each letter in each path
	    Map<Integer, Map<Character, Integer>> freqMap = new HashMap<>();
	    
	    // Perform a DFS from each node to find the most frequent letter
	    for (int i = 0; i < n; i++) {
	        Map<Character, Integer> pathFreq = new HashMap<>();
	        dfs(i, adjList, S, pathFreq);
	        int pathLength = pathFreq.values().stream().max(Integer::compare).orElse(0);
	        if (!freqMap.containsKey(pathLength)) {
	            freqMap.put(pathLength, new HashMap<>());
	        }
	        Map<Character, Integer> currentMap = freqMap.get(pathLength);
	        for (char c : pathFreq.keySet()) {
	            currentMap.put(c, currentMap.getOrDefault(c, 0) + pathFreq.get(c));
	        }
	    }
	    
	    // Get the maximum beauty value from the map
	    int maxBeauty = freqMap.keySet().stream().max(Integer::compare).orElse(0);
	    if (maxBeauty > 0) {
	        int maxFreq = freqMap.get(maxBeauty).values().stream().max(Integer::compare).orElse(0);
	        return maxFreq;
	    } else {
	        return -1;
	    }
	}

	private static void dfs(int current, List<List<Integer>> adjList, String S, Map<Character, Integer> pathFreq) {
	    pathFreq.put(S.charAt(current), pathFreq.getOrDefault(S.charAt(current), 0) + 1);
	    for (int neighbor : adjList.get(current)) {
	        dfs(neighbor, adjList, S, pathFreq);
	    }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

	    // Sample test case
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    String S = sc.next();
	    
	    
	    int[] X = new int[4];
	    for (int i : X) {
			X[i]=sc.nextInt();
			}
	    
	    int[] Y =new int[4];
	    for (int i : Y) {
			Y[i]=sc.nextInt();
		}
	  System.out.println(beauty(n, m, S, X, Y));
		
		
		
		
		
	/*    // Sample test case
	    int n = 5;
	    int m = 4;
	    String S = "abaca";
	    int[] X = {1, 1, 3, 4};
	    int[] Y = {2, 3, 4, 5};
	    int expected = 3;
	    int result = beauty(n, m, S, X, Y);
	    System.out.println(result == expected ? "Test case passed" : "Test case failed");
	*/}

}
