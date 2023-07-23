public class Pow {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n; // duplicate copy of n
        if (nn < 0){ // if number is negative make it positive
            nn = -1*nn;
        }
        while(nn > 0){

            if(nn % 2 == 1){ // nn is odd
                ans = ans*x;
                nn = nn-1;
            }
            else{
                // nn is even
                x = x*x; 
                nn = nn/2;
            }
        }

        if(n<0){ // if n is negative the ans = 1/ans
            ans = (double) (1.0)/ (double) (ans);
        }
        return ans;
    }
}
