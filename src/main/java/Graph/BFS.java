package Graph;

import java.util.*;

import static Graph.CycleDetectionUsingBFS.cycleDetectionUsingBFS;
import static Graph.DFS.dfs;

public class BFS {
    public static void main(String[] args) {
        int n=10;
        List<List<Integer>> adj= new ArrayList<>();
        adj.add(List.of());
        adj.add(Arrays.asList(2,6));
        adj.add(Arrays.asList(1,3,4));
        adj.add(List.of(2));
        adj.add(Arrays.asList(2,5));
        adj.add(Arrays.asList(4,8));
        adj.add(Arrays.asList(1,7,9));
        adj.add(Arrays.asList(6,8));
        adj.add(Arrays.asList(5,7));
        adj.add(List.of());
        System.out.println(bfs(adj, 10));
        List<Boolean> visited= new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            visited.add(false);
        }
        for(int i=1;i<n;i++){
            if(!visited.get(i)) {
                visited.set(i, true);
                dfs(adj, i, result, visited);
            }
        }
        System.out.println(result);
        System.out.println(cycleDetectionUsingBFS(adj, n));
    }

    private static List<Integer> bfs(List<List<Integer>> adj, int n){
        List<Boolean> visited=new ArrayList<>();
        Queue<Integer> qu=new ArrayDeque<>();
        List<Integer> result= new ArrayList<>();
        for(int i=0;i<n;i++){
            visited.add(false);
        }
        for(int i=1;i<n;i++){
            if(!visited.get(i)){
                qu.offer(i);
                visited.set(i, true);
                while(!qu.isEmpty()){
                    int node= qu.poll();
                    result.add(node);
                    visited.set(node, true);
                    List<Integer> list= adj.get(node);
                    for(int m: list){
                        if(!visited.get(m)){
                            visited.set(m, true);
                            qu.offer(m);
                        }
                    }
                }
            }
        }
        return result;
    }
}
