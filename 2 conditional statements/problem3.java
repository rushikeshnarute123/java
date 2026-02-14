import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        
        switch (day) {
            case 1: System.out.println(" Today is the Sunday !");
                break;
                
            case 2 : System.out.println(" Today is the Monday !");
                break;

            case 3 : System.out.println(" Today is the Tuesday !");
                break;

            case 4 : System.out.println(" Today is the Wensday !");
                break;

            case 5: System.out.println(" Today is the Thirsday !");
                break;
                
            case 6 : System.out.println(" Today is the Friday !");
                break;

            case 7 : System.out.println(" Today is the Saturday !");
                break;
                
            default:
                System.out.println("Wrong operator choosen !");
        }
    }
    
}
