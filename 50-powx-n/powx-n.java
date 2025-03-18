class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;

        if(n==0){
            return 1.0;
        }
        if(n == Integer.MIN_VALUE){
            x = 1/x;
            n = -n-1;
            return x*myPow(x,n);
        }
        if(n<0){
            x = 1/x;
            n = -n;
        }
        while(n!=0){
            if(n%2==1){
                ans *= x;
            }
            x = x*x;
            n = n/2;
        }
        return ans;
    }
}