public class SingleInheritence {
    void showA(){
        System.out.println("parent class method");
    }
}
class ChildClass extends SingleInheritence{
    void showB() {
        System.out.println("child class method");
    }
        public static void main(String[]args){
        ChildClass CC1=new ChildClass();
        CC1.showA();
        CC1.showB();

        }
    }

