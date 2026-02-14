import java.util.Scanner;

public class inverted_and_rotated_half_pyramid {
    public static void inverted_and_rotated_half_pyramid(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.err.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter any no ");
        int a=sc.nextInt();
        inverted_and_rotated_half_pyramid(a);
    }
}
