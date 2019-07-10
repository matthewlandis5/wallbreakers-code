class Solution {
    public double pow(double x, int n) {
        if(n>0){
            return comp(x,n);
        }
        return 1/(comp(x,-n));
    }
    private double comp(double x, int n) {
        if (n==1) return x;
        if (n==0) return 1.0;
        double temp = comp(x, n / 2);
        if((n%2)==0){
            return temp*temp;
        }
        return temp*temp*x;
    }
}