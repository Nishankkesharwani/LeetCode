class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low=0;
        int ans=0;
        int max_count=0;
        int[] freq = new int[256];
        for(int high=0;high<n;high++){
            freq[s.charAt(high)]++;
            if(freq[s.charAt(high)]>max_count){
                max_count = freq[s.charAt(high)];
            }
            while((high-low+1)-max_count>k){
                freq[s.charAt(low)]--;
                low++;
            }
            ans = Math.max(high-low+1,ans);
        }
        return ans;
    }
}