public class FactorialOfN {
    public static int printFac(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = printFac(n - 1);
        int fn = n * printFac(n - 1);
        return fn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFac(n));
    }
}
