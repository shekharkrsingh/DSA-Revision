package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Topo {
    public static void main(String[] args) {
        List<List<Integer>> adj=new ArrayList<>();
        adj.add(List.of());
        adj.add(List.of());
        adj.add(List.of(3));
        adj.add(List.of(1));
        adj.add(List.of(0, 1));
        adj.add(List.of(0, 2));
        System.out.println(topo(adj, 6));
    }

    private static List<Integer> topo(List<List<Integer>> adj, int n){
        Stack<Integer> result= new Stack<>();
        List<Boolean> visited = new ArrayList<>();
        for(int i=0;i<n;i++){
            visited.add(false);
        }

        for(int i=0;i<n;i++){
            if(!visited.get(i)){
                dfs(i, adj, visited, result);
            }
        }
        return new ArrayList<>(result).reversed();
    }

    private static void dfs(int n, List<List<Integer>> adj, List<Boolean> visited,  List<Integer> result){
        visited.set(n, true);
        List<Integer> list= adj.get(n);
        for(int val: list){
            if(!visited.get(val)){
                dfs(val, adj, visited, result);
            }
        }
        result.add(n);
    }

}
