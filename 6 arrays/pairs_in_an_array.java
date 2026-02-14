public class pairs_in_an_array {

    public static void pairs_in_an_array(int numbers[]){
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j=i+1; j<numbers.length; j++){
                System.out.print("("+ curr +"," + numbers[j] +")");
            }
            System.out.println();
        }
        System.out.println("total pairs = "+tp);
        
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        pairs_in_an_array(numbers);
    }
}
