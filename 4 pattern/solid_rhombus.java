public class solid_rhombus {
    public static void solid_rhombus(int a){
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=a-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=a; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(5);
    }
}
