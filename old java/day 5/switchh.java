import java.util.Scanner;
public class switchh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : 
                System.out.println("sunday");
                break;
            case 2 : 
                System.out.println("monday");
                break;
            case 3 : 
                System.out.println("tuesday");
                break;               
            case 4 : 
                System.out.println("wensday");
                break;       
            case 5 : 
                System.out.println("thursday");
                break;       
            case 6 : 
                System.out.println("friday");
                break;        
            case 7 : 
                System.out.println("saturday");
                break;
            default :
                System.out.println("invalid no");
                break;

        }
    }
}
