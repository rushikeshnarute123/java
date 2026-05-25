import java.util.Scanner;

class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year : ");
        int year = sc.nextInt();

        String result = (year%4 == 0) ? "Leap year" : "Not leap year";
        System.out.println(result);
    }
    
}
