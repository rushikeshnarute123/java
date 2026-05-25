import java.util.*;
public class inverted_half_pyramid_with_no {
    public static void inverted_and_rotated_half_pyramid_with_no(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=a-i+1; j++){
                System.out.print(j);          
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter any no ");
        int a =sc.nextInt();
        inverted_and_rotated_half_pyramid_with_no(a);
    }
}
