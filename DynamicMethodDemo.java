public class DynamicMethodDemo {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.display();
        // s1.printRectangle(); // Can't call - error
        Shape s2 = new Rectangle();
        s2.display();
        // s2.printRectangle(); -> error
        Rectangle r1 = new Rectangle();
        r1.display();
        r1.printRectangle();
        //Rectangle r2 = new Shape(); // Incompatible types - error
    }
}
// Dynamic Method Dispatch
class Shape{
    int l;
    int b;
    public Shape(){
    }
    public void display(){
        System.out.println("Inside shape class");
    }
}

class Rectangle extends Shape{
    public Rectangle(){
        super();
    }
    public void display(){
        System.out.println("Inside rectangle-display");
    }
    public void printRectangle(){
        System.out.println("Inside rectangle");
    }
}