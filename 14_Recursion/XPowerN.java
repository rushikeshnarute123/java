class XPowerN {

    // public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     int pow = x * power(x, n-1);
    //     return pow;
    // }

    public static int optimizedPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPow = optimizedPow(x, n/2);
        int halfPowSq = halfPow * halfPow;
        if( n % 2 != 0){
            halfPowSq = x * halfPowSq ;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 9;

        // System.out.println(power(x, n));

        System.out.println(optimizedPow(x, n));
    }
}