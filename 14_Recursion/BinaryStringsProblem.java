public class BinaryStringsProblem {
    public static void printBinStrins(int n, int lastPlace, String sb){
        if(n == 0){
            System.out.println(sb);
            return;
        }
        
        if(lastPlace == 0){
            printBinStrins(n-1, 0, sb+("0"));
            printBinStrins(n-1, 1, sb+("1"));
        }else{
            printBinStrins(n-1, 0, sb+("0"));
        }
    }
    public static void main(String[] args) {
        printBinStrins(3, 0, "");
    }
}
