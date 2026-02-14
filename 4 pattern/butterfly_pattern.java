import java.util.*;
public class butterfly_pattern {
    public static void butterfly_pattern(int a){
        // First half
        for (int i = 1; i <= a; i++) {
            
            // for stars = i
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }

            // for spaces = 2*(a-i)
            for (int j = 1; j <= 2*(a-i); j++) {
                System.out.print(" ");
            }

            // for stars = i
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half

        for (int i = a; i >= 1; i--) {
            
            // for stars = i
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }

            // for spaces = 2*(a-i)
            for (int j = 1; j <= 2*(a-i); j++) {
                System.out.print(" ");
            }

            // for stars = i
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter no of lines");
        int a =sc.nextInt();
        butterfly_pattern(a);
    }
}
