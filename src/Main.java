import com.training.assignment2.Car;
import com.training.assignment2.ElectricCar;
import pojo.Vehicle;

public class Main {
    public static void main(String[] args) {

//        Employee emp=new Employee();
//        System.out.println(emp.getEmployee_name());
//        ExEmployee exEmp=new ExEmployee(145,"Anil");
//        exEmp.printthis();
//        Calculator calci=new Calculator();
//        calci.start();
//        Game game=new Game();
//        game.play();
//        Datatypes data=new Datatypes();
//        data.start();
        ElectricCar ec=new ElectricCar();
        System.out.println(ec.wheels);
        ec.drive();
        Car tata=new Car("petrol");
        tata.horn();

    }
}