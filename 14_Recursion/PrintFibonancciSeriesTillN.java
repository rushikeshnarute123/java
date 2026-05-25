public class PrintFibonancciSeriesTillN {
    public static int printFib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = printFib(n - 1);
        int f2 = printFib(n - 2);
        int fib = f1 + f2;
        return fib;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(printFib(n));
    }
}
