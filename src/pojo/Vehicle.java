package pojo;

public abstract class Vehicle {
    public int wheels;
    public String fuel;
    public Vehicle(String fuel){
        this.fuel=fuel;
    }
    public Vehicle(int wheels){
        this.wheels=wheels;
    }
    public Vehicle(int wheels,String fuel){
        this.wheels=wheels;
        this.fuel=fuel;
    }
    public abstract void drive();
    public abstract void horn();
}
