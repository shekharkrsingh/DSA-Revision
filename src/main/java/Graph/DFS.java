package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    static void dfs(List<List<Integer>> adj, int n, List<Integer> result, List<Boolean> visited){
        if(!visited.get(n)){
            visited.set(n, true);
            result.add(n);
            List<Integer> list= adj.get(n);
            for(int node: list){
                dfs(adj, n, result, visited);
            }
        }
    }
}
