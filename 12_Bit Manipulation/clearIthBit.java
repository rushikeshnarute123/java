public class clearIthBit {
    public static void main(String[] args) {
        int n = 10;
        int pos = 1;
        System.out.println(n & ( ~ (1 << pos)));
    }
}
