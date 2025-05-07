import java.util.Scanner;

public class ConstructDemo {
    int x;
    String name;
    ConstructDemo(){
        x = 10;
        name = "Amit";
    }
    ConstructDemo(ConstructDemo c){
        System.out.println("The value of x is : "+c.x);
        System.out.println("The anme is : "+c.name);
    }
    public static void main(String[] args){
        ConstructDemo cd = new ConstructDemo();
        ConstructDemo cd1 = new ConstructDemo(cd);
        System.out.println(cd1.x);
        System.out.println(cd1.name);

    }
}
