public class MultilevelInheritence {
    void showA(){
        System.out.println("parent class method");
    }
}
class B extends MultilevelInheritence {
    void showB() {
        System.out.println("child class method");
    }
}
    class C extends B{
       void  showC(){
           System.out.println("another child class method");
        }

    public static void main(String[]args){
        C CC1=new C();
        CC1.showA();
        CC1.showB();
        CC1.showC();

    }
}
