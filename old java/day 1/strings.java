public class strings{
    public static void main(String[] args){
        String name1 = "rushi";
        String name2 = "narute";
        String name3 = "i love java";

        
        
        // concatenate

        System.out.println("************** concatination ***********");
        System.out.println(name1 + " " + name2);

        
        
        //char At

        System.out.println("************** char At ***********");
        System.out.println(name1.charAt(1));
        System.out.println(name2.charAt(2));



        //length

        System.out.println("************** length ***********");
        System.out.println(name1.length());
        System.out.println(name3.length());



        //replace

        System.out.println("************** replace ***********");
        String name4 = name1.replace("u","i");
        System.out.println(name4);



        // sudstring

        System.out.println("************** substring ***********");
        System.out.println(name3.substring(0,7));
        System.out.println(name3.substring(3,6));

    }
}