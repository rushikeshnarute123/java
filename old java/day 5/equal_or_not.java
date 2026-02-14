import java.util.Scanner;
class equal_or_not{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("both no are equal");
        }
        else {
            System.out.println("both no are not equal");
        }
    }
}