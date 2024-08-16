import pojo.Employee;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Employee emp1=new Employee("name");
        Employee emp2=new Employee("name");
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        Map<Employee,String> m=new HashMap<>();
        m.put(emp1,"Hii");
        m.put(emp2,"Hii");
        System.out.println(m);
//        ExEmployee exEmp=new ExEmployee(145,"Anil");
//        exEmp.printthis();
//        Calculator calci=new Calculator();
//        try{
//            calci.start();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        Game game=new Game();
//        game.play();
//        Datatypes data=new Datatypes();
//        data.start();
//        ElectricCar ec=new ElectricCar();
//        System.out.println(ec.wheels);
//        ec.drive();
//        Car tata=new Car("petrol");
//        tata.horn();

    }
}