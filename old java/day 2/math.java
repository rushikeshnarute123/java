import java.lang.Math;

public class math{
    public static void main(String[] args) {
        
        // math includes min() , max() , random ()

        int a = 20;
        int b = 30;
        System.out.println("****** max() ******");
        System.out.println(Math.max(a , b));

        System.out.println("****** min() ******");
        System.out.println(Math.min(a , b));
        

        System.out.println("****** random() ******");
        int mathnumber =(int) (Math.random() * 100);
        System.out.println(mathnumber);




    }
}