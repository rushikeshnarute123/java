import java.util.*;
public class O_I_triangle {
    public static void O_I_triangle(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }     
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter any no ");
        int a =sc.nextInt();
        O_I_triangle(a);
    }
}
