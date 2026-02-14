import java.util.Scanner;
public class taking_input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******* enter a no *********");
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("******* enter your marks *********");
        float marks = sc.nextFloat();
        System.out.println(marks);
        System.out.println("******* enter your full name *********");
        String name = sc.next();    // it takes only first word
        System.out.println(name);
        System.out.println("******* enter your full name *********");
        String line = sc.nextLine();
        System.out.println(line);

    }
}