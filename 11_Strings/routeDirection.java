
public class routeDirection {
    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;
        for (int i = 0; i < direction.length(); i++) {
            if (direction.charAt(i) == 'N') {
                y2++;
            }else if (direction.charAt(i) == 'S') {
                y2--;
            }else if(direction.charAt(i) == 'W'){
                x2--;
            }else if(direction.charAt(i) == 'E'){
                x2++;
            }
        }
        double ans = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
        System.out.println(ans);
    }
}
