public class max_subarray_sum_I_brute_force {
    public static void max_subarrays(int numbers[]){
        int tp = 0;
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    curr = curr+numbers[k];
                    
                }
                if(max<curr){
                    max=curr;
                }
                tp++;
                System.out.println(" = "+curr);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum of subarray = "+max);
        System.out.println("total pairs = "+tp);
        
    }

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        max_subarrays(numbers);
    }
}