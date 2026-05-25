

public class trapped_rainwater {
    public static int trapped_rainwater(int height[]){
        int n = height.length;
        int trapped_water = 0;

        // calculate left max boundry - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // calculate right max booundry - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftMax[i],rightMax[i])
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            // trapped_water = waterLevel - height[i]
            trapped_water += waterLevel - height[i];
        }

        return trapped_water;
    }

    public static void main(String[] args) {
        int height[] = {4,2,00,6,3,2,5};
        System.out.println(trapped_rainwater(height));
    }
}
