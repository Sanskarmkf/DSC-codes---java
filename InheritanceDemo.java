public class InheritanceDemo {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.display();
        System.out.println(s.l);  // output -> 0
        Shape s1 = new Shape(4,2);
        s1.display();
        Rectangle r = new Rectangle(2,4);
        r.display();
        Cuboid c = new Cuboid(1,2,3);
        c.display(); // -> call - display method of shape class
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Shape{
    int l;
    int b;
    public Shape(int x, int y){
        l=x;
        b=y;
    }
    public Shape(){

    }
    public void display(){
        System.out.println("Inside shape class");
    }
}

class Rectangle extends Shape{
    public Rectangle(int x, int y){
        super(x,y);
    }
    public void display(){
        System.out.println("Inside Rectangle");
    }
}

class Cuboid extends Shape{
    int h;
    public Cuboid(int x, int y, int z){
        super(x,y);
        h=z;
    }
}