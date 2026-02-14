public class binary_search {
    public static int binary_search(int numbers[], int key){
        int start=0;
        int end=numbers.length-1;

        while(start <= end ){
            int mid = (start + end)/2;

            // comaprisons
            if(key == numbers[mid]){
                return mid;
            }
            if(key > numbers[mid] ){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        int key=10;

        System.out.println("index for key is : "+binary_search(numbers, key));
    }
}
