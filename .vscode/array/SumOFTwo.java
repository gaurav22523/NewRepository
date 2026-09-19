package array;

import java.util.Arrays;

public class SumOFTwo {

    public static void sum(int[] a, int x) {
        int i, j;
        int l = a.length;
        for (i = 0; i < l; i++) {
            for (j = i + 1; j < l; j++) {
                if (a[i] + a[j] == x) {
                    System.out.println(a[i] + "," + a[j] + "    ");
                }
            }
        }
    }

    public static int[] sum2(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == target) {
                return new int[] { a[left], a[right] };
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9 };
        int x = 8;
        System.out.println(Arrays.toString(sum2(a, x)));
    }

}
