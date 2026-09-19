package array;

public class RemoveDuplicateFromSortedArray {
    public static void removeDuplicate(int[] a) {
        int i, j;
        i = 0;
        for (j = i + 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(a[k] + " ");
        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 3 };
        removeDuplicate(a);

    }
}
