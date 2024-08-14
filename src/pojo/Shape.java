package pojo;

public abstract class Shape {
    int length;
    int bredth;
    public Shape(){
        this(1,1);
    }
    public Shape(int length,int bredth){
        this.length=length;
        this.bredth=bredth;
    }
    public abstract long area();
    public abstract int perimeter();
}
