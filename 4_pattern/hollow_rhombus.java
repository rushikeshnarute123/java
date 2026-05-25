public class hollow_rhombus {
    public static void hollow_rhombus(int a){
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=a-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=a; j++) {
                if(i==1 || i==a || j==1 || j==a){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
        }
        System.err.println();
    }
}
    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}

