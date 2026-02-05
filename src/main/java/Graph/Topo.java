package Graph;

import java.util.*;

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
        System.out.println(bfsTopo(n, adj));
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

    private static List<Integer> bfsTopo(int n, List<List<Integer>> adj){
        List<Integer> indegree= new ArrayList<>();
        List<Integer> result= new ArrayList<>();
        Queue<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            indegree.add(0);
        }
        for(List<Integer> list: adj){
            for(int val: list){
                indegree.set(val, indegree.get(val)+1);
            }
        }
        for(int i=0;i<n; i++){
            if(indegree.get(i)==0){
                st.offer(i);
            }
        }

        while(!st.isEmpty()){
            int node= st.poll();
            result.add(node);
            List<Integer> list=adj.get(node);
            for(int val: list){
                int ind=indegree.get(val);
                ind--;
                indegree.set(val, ind);
                if(ind==0){
                    st.offer((val));
                }
            }
        }
        return result;
    }

}
