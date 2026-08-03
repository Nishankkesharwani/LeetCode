class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int i=0;
        while(n>i && i!=n-1){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
            i++;
        }
        int j=-1;
        for(int m = 0;m<n;m++){
            if(nums[m]==0){
                j=m;
                break;
            }
        }
        if(j==-1){
            return nums;
        }
        for(int s = j+1;s<n;s++){
            if(nums[s]!=nums[j]){
                int temp = nums[s];
                nums[s]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}