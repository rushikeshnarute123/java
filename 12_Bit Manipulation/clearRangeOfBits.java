public class clearRangeOfBits {
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        int j = 4;
        int a = ((~0) << (j + 1));
        int b = ((1 << i) - 1);
        int bitmask = a | b;
        System.out.println(n & bitmask);
    }
}
