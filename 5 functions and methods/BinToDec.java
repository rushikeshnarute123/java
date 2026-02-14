
import java.util.Scanner;

class BinToDec{
    public static void BinToDec(int binNum){
        int no= binNum;
        int pow=0;
        int decNum=0;

        while (binNum>0) { 
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int) Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of "+no+" = "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any binary number ");
        int n = sc.nextInt();
        BinToDec(n);
    }
}