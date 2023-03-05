public class HieraricalInheritence {
    void showA() {
        System.out.println("A class method");
    }
}
    class D extends HieraricalInheritence {
        void showB() {
            System.out.println("B class method");

        }

    }
    class E extends HieraricalInheritence {
        void showC() {
            System.out.println("C class method");

        }
            public static void main(String[]args){
                D d1=new D();
                d1.showA();
                d1.showB();
                E e1=new E();
                e1.showA();
                e1.showC();

    }
}
