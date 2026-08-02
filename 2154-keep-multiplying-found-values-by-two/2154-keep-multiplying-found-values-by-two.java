class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int n= nums.length;
        int i=0;
        while(n>i){
            if(nums[i]==original){
                original = 2*original;
            }
            i++;
        }
        return original;
    }
}