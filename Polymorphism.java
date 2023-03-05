public class Polymorphism {
    void run() {
        System.out.println("Running");
    }
}
    class Splonder extends Polymorphism {
        void run() {
            System.out.println("63 km successfully drive");
        }
        public static void main(String[] args) {
            Splonder sp1=new Splonder();
            sp1.run();

    }
}
