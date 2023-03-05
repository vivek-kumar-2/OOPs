public class InheritenceAnimal {
    void eat() {
        System.out.println("I am eating");
    }
}
    class Dog extends InheritenceAnimal {
        public static void main(String[] args) {
            Dog d=new Dog();
            d.eat();

        }
    }

