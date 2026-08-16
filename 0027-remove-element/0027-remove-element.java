class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j=-1;
        int count =0;
        if(n==0){
            return 0;
        }

        for(int i = 0;i<n;i++){
            if(nums[i]==val){
                j=i;
                break;
            }
        }
        if(j==-1){
            return n;
        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=nums[j] ){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                j++;
            }
        }
                return j;
    }
}