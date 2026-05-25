public class containsDuplicate {
    public boolean containsDuplicate(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,3,5,7};
        containsDuplicate obj = new containsDuplicate();
        System.out.println(obj.containsDuplicate(arr));
    }
}
