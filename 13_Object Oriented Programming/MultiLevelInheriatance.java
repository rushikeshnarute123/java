public class MultiLevelInheriatance {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.eats();
        rocky.legs = 4;
        System.out.println(rocky.legs);
    }
}

class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("breaths");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
