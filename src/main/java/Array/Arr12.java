package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Arr12 {
    public static void main(String[] args) {
        int[] arr={1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(countSubArr(arr, 3));
    }
    private static int countSubArr(int[] arr, int k){
        int n=arr.length;
        Map<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for (int j : arr) {
            sum += j;
            if (map.containsKey(sum - k)) {
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
