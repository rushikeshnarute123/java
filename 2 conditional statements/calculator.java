import java.util.Scanner;

class calculator{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no : ");
        int a = sc.nextInt();
        System.out.println("Enter second no : ");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        char operator = sc.next() .charAt(0);

        switch (operator) {
            case '+': System.out.println(a+b);
                break;
                
            case '-' : System.out.println(a-b);
                break;

            case '*' : System.out.println(a*b);
                break;

            case '/' : System.out.println(a/b);
                break;

            default:
                System.out.println("Wrong operator choosen !");
        }
    }
}