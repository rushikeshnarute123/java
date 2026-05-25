public class HeirarchicalInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
        shark.swim();
        Bird parrot = new Bird();
        parrot.breaths();
        parrot.fly();
        Mammal dog = new Mammal();
        dog.eats();
        dog.walk();
    }
}

class Animal{
    void eats(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("breaths");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim in water");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}