package array;

import java.util.Arrays;
import java.util.Map;

public class TwoSumUnsorted {

    public static int[] twoSum(int [] a,int target){
        Map<Integer,Integer> map=new java.util.HashMap<>();
        int i;
        for(i=0;i<a.length;i++){
            int com=target-a[i];

            if(map.containsKey(com)){
                return new int[] {map.get(com),i};
            }

            map.put(a[i],i);
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int [] a={2,11,7,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(a,target)));
    }
}
 