public class FirstOccurenceOfElementInArray {
    public static int firstOccurance(int[] arr, int i, int key){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(firstOccurance(arr, 0, 5));
    }
}
