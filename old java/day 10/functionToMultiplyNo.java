import java.util.Scanner;
public class functionToMultiplyNo {
    public static int calculateMultiplication(int a,int b){
        int multiplication = a*b;
        return multiplication;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input first integer");
        int a=sc.nextInt();
        System.out.println("input second integer");
        int b=sc.nextInt();
        int multiplication = calculateMultiplication(a, b);
        System.out.println("multiplication of 2 numbers is : "+multiplication);
    }
}
