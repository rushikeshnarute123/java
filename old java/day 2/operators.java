public class operators {
    public static void main(String[] args) {
        //arithmetic operators

        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println("****** sum ******");
        System.out.println(sum);

        int diff = a - b;
        System.out.println("****** diff ******");
        System.out.println(diff);

        int mul = a * b;
        System.out.println("****** mul ******");
        System.out.println(mul);

        int div = a / b;
        System.out.println("****** div ******");
        System.out.println(div);

        int modulo = b % a;
        System.out.println("****** modulo ******");
        System.out.println(modulo);



        
        //assignment operators ( = , += , -= , *= , /= )
        int c = 10;
        int d = c;
        System.out.println("****** = ******");
        System.out.println(d);




        // comparison operators ( == , < , > , != , <= , >=)
        int e = 10;
        int f = 6;
        System.out.println("****** == ******");
        if( e == f){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }


        System.out.println("****** != ******");
        if (e != f){
            System.out.println("not equal");
        }
        else{
            System.out.println("equal");
        }


        System.out.println("****** < ******");
        if (e < f){
            System.out.println("e is less than f");
        }
        else {
            System.out.println("e is greater than f");
        }




        // logical operators (and , or , not) == (&& , || , !)

        int aa = 60;
        int bb = 40;
        System.out.println("****** && ******");
        if (aa <50 && bb < 50){
            System.out.println("both less than 50");
        }
        else {
            System.out.println("not less than 50");
        }


        System.out.println("****** || ******");
        if (aa < 50 || bb < 50){
            System.out.println("atleast one is less than 50");
        }
        else {
            System.out.println("both not less than 50");
        }


        System.out.println("****** ! ******");
        boolean isAdult = false;
        if (! isAdult){
            System.out.println(" is adult");
        }
        else {
            System.out.println(" not adult");
        }


    }
}