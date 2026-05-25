class reverse_the_given_original_no {
    public static void main(String[] args) {
        int n=10899;
        int reverse=0;
        while(n>0){
            int lastDigit =n%10;
            // System.err.print(lastDigit);
            n=n/10;
            reverse=(reverse*10) + lastDigit;
        }
        System.out.print(reverse);
    }
}
