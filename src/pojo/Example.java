package pojo;

public interface Example {
    default void print(){
        System.out.println("Printed on console");
    }
    public int delete();
    private int add(int a,int b){
        System.out.println("added");
        return a+b;
    }
}
