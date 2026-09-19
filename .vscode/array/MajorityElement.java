package array;

public class MajorityElement {
    public static int Voting(int[] nums) {
        int i, count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 2,2 };
        System.out.println(Voting(nums));
    }
}
