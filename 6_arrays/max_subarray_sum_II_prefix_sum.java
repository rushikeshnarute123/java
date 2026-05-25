public class max_subarray_sum_II_prefix_sum {
    public static void max_subarrays(int numbers[]){
        int tp = 0;
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                if(max<curr){
                    max=curr;
                }
                tp++;
                System.out.println(curr);
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
