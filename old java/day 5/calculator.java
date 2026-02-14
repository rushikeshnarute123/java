import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        int a = sc.nextInt();
        System.out.println("enter second no");
        int b = sc.nextInt();
        System.out.println("1 for addition");
        System.out.println("2 for subtract");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        System.out.println("any other for exit");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: 
                int add = a+b;
                System.out.println(add);
                break;
            case 2 : 
                int sub = a-b;
                System.out.println(sub);
                break;
            case 3 :
                int mul = a*b;
                System.out.println(mul);
                break;
            case 4 :
                int div = a/b;
                System.out.println(div);
                break;
            default :
                System.out.println("invalid no");
                break;
        }
    }
}
