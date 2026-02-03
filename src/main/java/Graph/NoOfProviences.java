package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Graph.DFS.dfs;

public class NoOfProviences {
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
        List<Boolean> visited= new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++){
            visited.add(false);
        }
        for(int i=0;i<n;i++){
            if(!visited.get(i)) {
                count++;
                visited.set(i, true);
                dfs(adj, i, result, visited);
            }
        }
        System.out.println(count);
    }
}
