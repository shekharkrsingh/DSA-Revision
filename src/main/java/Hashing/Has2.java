package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Has2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,4,3,2,3,3};
        int n=arr.length;
        Map<Integer, Integer> map=new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> key: map.entrySet()){
            System.out.println(key.getKey()+" "+key.getValue());
        }
    }
}
