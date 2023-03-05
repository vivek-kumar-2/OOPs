public class Encapsulation {
    private int emp_id;

public void setEmp_id(int Employee_Id) {
        emp_id=Employee_Id; //initialized
    }
        public int getEmp_id () {
            return emp_id;
    }
public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setEmp_id(1001);               //set data
        System.out.println(e.getEmp_id());  //view data
    }
}

