package array;

import java.util.Arrays;

public class MergingSortedArray {

    public static int[] merge(int[] arr1,int[] arr2){

        int[] arr3=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k++]=arr1[i++];
            }else{
                arr3[k++]=arr2[j++];
            }
        }

        while(i<arr1.length){
            arr3[k++]=arr1[i++];
        }
        while(j<arr2.length){
            arr3[k++]=arr2[j++];
        }

        return arr3;

    }

    public static void main(String args[]){
        int[] a={1,3,5,7};
        int[] b={2,4,6,8};

        int[] result=merge(a, b);
        System.out.println(Arrays.toString(result));


    }
    
}
