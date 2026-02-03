package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CycleDetectionUsingBFS {
    static boolean cycleDetectionUsingBFS(List<List<Integer>> adj, int n){
        Queue<Integer> qu= new ArrayDeque<>();
        List<Boolean> visited=new ArrayList<>();
        List<Integer> parent= new ArrayList<>();
        for(int i=0;i<n;i++){
            visited.add(false);
            parent.add(-1);
        }

        for(int i=0;i<n;i++){
            if(!visited.get(i)){
                visited.set(i, true);
                qu.offer(i);
                while(!qu.isEmpty()){
                    int node= qu.poll();
                    List<Integer> list= adj.get(node);
                    for(int val: list){
                        if(visited.get(val)){
                            if(parent.get(node)!=val){
                                return true;
                            }
                        }else{
                            visited.set(val, true);
                            parent.set(val, node);
                            qu.offer(val);
                        }
                    }
                }
            }
        }
        return false;
    }
}
