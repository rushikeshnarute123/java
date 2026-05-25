public class diamond_pattern {
    public static void diamond_pattern(int a){

        // first half
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <=(a-i)+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for (int i = a; i >=1; i--) {
            for (int j = 1; j <=(a-i)+1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond_pattern(4);
    }
}
