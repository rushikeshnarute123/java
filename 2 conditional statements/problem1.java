import java.util.Scanner;

class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        String result =  (a > 0) ? "positive" : "negative" ;
        System.out.println(result);
    }
    
}
