public class LengthOfString {
    public static int countLength(String str){
        if(0 == str.length()){
            return 0;
        }
        return countLength(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(countLength(str));
    }
}
