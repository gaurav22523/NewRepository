package array;

import java.util.Arrays;

public class ProductWithoutItSelf {
    public static int[] calculateProduct(int[] nums){
        int[] answer=new int[nums.length];
        int n=nums.length;
        int i;
        answer[0]=1;
        for(i=1;i<n;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }

        int suffixPro=1;
        for(i=n-1;i>=0;i--){
            answer[i]=answer[i]*suffixPro;
            suffixPro*=nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(Arrays.toString(calculateProduct(nums)));
    }
}
