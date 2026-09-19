package array;

public class maxProfit {
    public static int profit(int[] a){
        int left=0,i;
        int right=1;
        int maxProfit=0;

        while(right<a.length){
            if(a[left]<a[right]){
                int currentProfit=a[right]-a[left];
                maxProfit=Math.max(maxProfit, currentProfit);
            }else{
                left=right;
            }
            right++;
        }

        return maxProfit;
        
    }
    public static void main(String[] args) {
        int[] prices={7,  1,  5,  3,  6,  4};
        System.out.println(profit(prices));
    }
}
