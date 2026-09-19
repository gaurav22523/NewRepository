package array;

public class ContainerWithMostWater {

    public static int mostWater(int[] a){
        int maxWater=0;
        int left=0;
        int right=a.length-1;

        while(left<right){
            int width=right-left;

            int currnetHight=Math.min(a[left],a[right]);

            int currentWater=width*currnetHight;
            maxWater=Math.max(maxWater, currentWater);

            if(a[left]<a[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxWater;

    }
    public static void main(String[] args) {
        int[] height={1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(mostWater(height));

    }
    
}
