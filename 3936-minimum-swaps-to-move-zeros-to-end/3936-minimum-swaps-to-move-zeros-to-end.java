class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int zeros = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeros++;
            }
        }
        for (int i = 0; i < n - zeros; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }

        return count;
    }
}