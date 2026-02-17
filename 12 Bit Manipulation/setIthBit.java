public class setIthBit {
    public static void main(String[] args) {
        int n = 10;
        int pos = 2;
        System.out.println(n | (1 << pos));
    }
}
