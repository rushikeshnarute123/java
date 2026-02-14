import java.util.Scanner;
class methods{
    public static void printMyName(String name ){
        System.out.println("Hi "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name");
        String name = sc.nextLine();
        printMyName(name);     
    }
}