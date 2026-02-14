public class arrays{
    public static void main(String[] args) {
        // arrays

        int [] marks = new int[4];
        marks[0]=95;
        marks[1]=60;
        marks[2]=89;
        marks[3]=40;
        System.out.println("******* arrays*******");
        System.out.println(marks[1]);
        System.out.println(marks[3]);




        // 2D arrays

        int [][] finalmarks = {{90,97,99,60},{89,60,70,80}};
        System.out.println("******* 2D arrays*******");
        System.out.println(finalmarks[0][0]);
        System.out.println(finalmarks[1][1]);

    }
}