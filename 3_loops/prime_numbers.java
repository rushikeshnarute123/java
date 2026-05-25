// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class prime_numbers {
    public static boolean prime(int n){
        if(n==1){
            return false;
        }

        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(prime(i)){
                System.out.print(i +" ");
            }
        }
    }
}