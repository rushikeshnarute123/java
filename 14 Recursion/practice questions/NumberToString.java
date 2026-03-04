class NumberToString {
    // public static void convertToString(int num){
    //     if(0 == num){
    //         return;
    //     }
    //     convertToString(num / 10);
    //     int lastDigit = num % 10;
    //     if(lastDigit == 0){
    //         System.out.print("zero" + " ");
    //     }else if(lastDigit == 1){
    //         System.out.print("one" + " ");
    //     }else if(lastDigit == 2){
    //         System.out.print("two" + " ");
    //     }else if(lastDigit == 3){
    //         System.out.print("three" + " ");
    //     }else if(lastDigit == 4){
    //         System.out.print("four" + " ");
    //     }else if(lastDigit == 5){
    //         System.out.print("five" + " ");
    //     }else if(lastDigit == 6){
    //         System.out.print("six" + " ");
    //     }else if(lastDigit == 7){
    //         System.out.print("seven" + " ");
    //     }else if(lastDigit == 8){
    //         System.out.print("eight" + " ");
    //     }else{
    //         System.out.print("nine" + " ");
    //     }
    // }


    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public static void printDigits(int num){
        if(num == 0){
            return;
        }
        printDigits(num / 10);
        int lastDigit = num % 10;
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args) {
        int num = 1947;
        // convertToString(num);
        printDigits(num);
    }
}