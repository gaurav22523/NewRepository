package array;

public class maxSubArray {

    public static int maxSubArray(int[] a){
        int i;
        int currentMax=a[0];
        int globalMax=a[0];

        for(i=1;i<a.length;i++){
            currentMax=Math.max(a[i],currentMax+a[i]);
            globalMax=Math.max(currentMax, globalMax);
        }

        return globalMax;

    }
    public static void main(String[] args) {
        int [] a={-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxSubArray(a));
    }
    
}
