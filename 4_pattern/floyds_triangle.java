import java.util.*;
public class floyds_triangle {
    public static void floyds_triangle(int a){
        int counter=1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=i; j++){
                System.out.print(counter+" ");
                counter++;      
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter any no ");
        int a =sc.nextInt();
        floyds_triangle(a);
    }
}
