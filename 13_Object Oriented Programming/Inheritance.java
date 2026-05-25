class Inheritance{
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
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

// derivedd class / subclass
class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("swims in water");
    }
}