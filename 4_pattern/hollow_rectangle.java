import java.util.*;
class hollow_rectangle {
    public static void hollow_rectangle(int totRows,int totCols){
        for (int i = 1; i <= totRows; i++) {
            for(int j=1;j<=totCols;j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no of rows");
        int a=sc.nextInt();
        System.out.println("enter total no of columns");
        int b=sc.nextInt();
        hollow_rectangle(a,b);
    }
}