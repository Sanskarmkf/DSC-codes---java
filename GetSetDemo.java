import java.util.Scanner;

public class GetSetDemo {
    String name;
    int age;
    void set(String n,int a){
        name = n;
        age = a;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    public static void main(String[] args){
        GetSetDemo g = new GetSetDemo();
        Scanner sc  = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter the name and age");
        name = sc.next();
        age = sc.nextInt();
        g.set(name,age);
        System.out.println("The name is : "+g.getName());
        System.out.println("The age is : "+g.getAge());
    }
}
