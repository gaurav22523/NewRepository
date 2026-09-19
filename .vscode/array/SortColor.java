package array;

import java.util.Arrays;

public class SortColor {
    public int[] sortFlagColor(int[] colors) {
        int low = 0;
        int mid = 0;
        int high = colors.length - 1;

        while (mid<= high) {
            if (colors[mid] == 0) {
                swap(colors, mid, low);
                low++;
                mid++;
            } else if (colors[mid] == 2) {
                swap(colors, mid, high);
                high--;
            } else if (colors[mid] == 1) {
                mid++;
            }
        }

        return colors;
    }

    public void swap(int[] a, int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] colors = { 1, 2, 0, 1, 2, 0 };
        SortColor b = new SortColor();
        System.out.println(Arrays.toString(b.sortFlagColor(colors)));

    }
}
