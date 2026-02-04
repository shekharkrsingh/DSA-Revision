package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetectCycleUsingDFS {
    public static void main(String[] args) {
        List<List<Integer>> adj=new ArrayList<>();
        adj.add(List.of(1,2));
        adj.add(List.of(2));
        adj.add(List.of());
//        adj.add(List.of(4,7));
//        adj.add(List.of(5));
//        adj.add(List.of(6));
//        adj.add(List.of());
//        adj.add(List.of(5));
//        adj.add(List.of(9));
//        adj.add(List.of(10));
//        adj.add(List.of(8));

        int n=3;

        List<Boolean> visited=new ArrayList<>();
        List<Boolean> pathVisited=new ArrayList<>();

        for(int i=0;i<n;i++){
            visited.add(false);
            pathVisited.add(false);
        }
        visited.set(0, true);

        System.out.println(detectCycleUsingDFS(0, adj, visited, pathVisited));

    }

    private static boolean detectCycleUsingDFS( int n, List<List<Integer>> adj,
                                                List<Boolean> visited,
                                                List<Boolean> pathVisited){
        visited.set(n, true);
        pathVisited.set(n, true);

        List<Integer> list= adj.get(n);
        for(int node : list){
            if(!visited.get(node)){
                if(detectCycleUsingDFS(node, adj, visited, pathVisited)){
                    return true;
                }
            }
            else if(pathVisited.get(node)){
                return true;
            }
        }
        pathVisited.set(n, false);
        return false;
    }
}
