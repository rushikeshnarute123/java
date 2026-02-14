public class max_subarray_sum_III_kadanes_algorithm {
    public static void max_subarrays(int numbers[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            curr = curr + numbers[i];
            if(curr < 0){
                curr = 0;
            }
            if (curr > max){
                max = curr;
            }
        }
        System.out.println("Maximum Subarray Sum: " + max);   
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        max_subarrays(numbers);
    }
}
