public class DecToBin {
    public static void DecToBin(int n){
        int no= n;
        int pow=0;
        int BinNum=0;

        while (n>0) { 
            int rem = n%2;
            BinNum = BinNum + (rem * (int) Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary of "+no+" = "+BinNum);
    }
    public static void main(String[] args) {
        DecToBin(15);
    }
}
