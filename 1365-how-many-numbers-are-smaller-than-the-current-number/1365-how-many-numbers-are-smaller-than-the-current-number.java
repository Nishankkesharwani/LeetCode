class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int count=0;
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }   
            }
            ans[k]=count;
                k++;
                count=0;
        }
          return ans;
    }
}