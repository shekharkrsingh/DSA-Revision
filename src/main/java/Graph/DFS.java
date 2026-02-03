package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    static void dfs(List<List<Integer>> adj, int n, List<Integer> result, List<Boolean> visited) {
        List<Integer> list = adj.get(n);
        result.add(n);
        for (int node : list) {
            if (!visited.get(node)) {
                visited.set(node, true);
                dfs(adj, node, result, visited);
            }
        }
    }
}
