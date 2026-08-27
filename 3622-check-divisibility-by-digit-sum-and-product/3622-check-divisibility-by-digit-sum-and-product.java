class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int product = 1;
        int org = n;
        while(n>0){
            int lastdigit = n % 10;
            sum += lastdigit;
            product *= lastdigit;
            n = n/10;

        }
        int totalsum = sum + product;
        if(org%totalsum == 0){
            return true;
        }else{
            return false;
        }

        
    }
}