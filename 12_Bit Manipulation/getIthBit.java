public class getIthBit {
    public static void main(String[] args) {
        int n = 15;
        int pos = 3;
        if((n & (1 << pos)) == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
