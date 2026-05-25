public class largest_number {
    public static int largest_number(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest){
                largest = numbers[i];
            }

            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,5,6,3,7,4};
        
        System.out.println("largest value is : "+largest_number(numbers));
    }
}
