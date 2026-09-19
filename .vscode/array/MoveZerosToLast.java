package array;

import java.util.Arrays;

public class MoveZerosToLast {
    public static int[] moveZero(int a[]){
        int i,temp, index=0;
        for(i=0;i<a.length;i++){
            if(a[i]!=0){
                temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                index++;
            }
        }

        return a;
    }
    public static void main(String[] args) {
        int[] a={0,2,1,0,5,0};
        System.out.println(Arrays.toString(moveZero(a)));
    }
}
