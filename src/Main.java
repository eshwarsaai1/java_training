import pojo.Employee;
import com.training.ExEmployee;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee();
        System.out.println(emp.getEmployee_name());
        ExEmployee exEmp=new ExEmployee(145,"Anil");
        exEmp.printthis();
    }
}