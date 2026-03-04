class PrintOccurrence {
    public static void findOccurrence(int arr[], int key, int ind){
        if(ind == arr.length){
            return;
        }
        if(key == arr[ind]){
            System.out.println(ind);;
        }
        findOccurrence(arr, key, ind+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,2,5,6,2,7,3,2,5};
        int key = 2;
        findOccurrence(arr, key, 0);
    }
}