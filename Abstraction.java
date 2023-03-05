abstract class Abstraction_Vehicle{
    abstract void start();
}
class Car extends Abstraction_Vehicle{
    void start(){
        System.out.println("Car start with key");
    }
}
class Scooter extends Abstraction_Vehicle{
    void start(){
        System.out.println("Scooter start with key");
    }
    public static void main(String[]args){
        Car c=new Car();
        c.start();
        Scooter s=new Scooter();
        s.start();
    }
}