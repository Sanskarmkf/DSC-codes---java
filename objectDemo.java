public class objectDemo {
    int x;
    public static void main(String[] args){
        objectDemo o = new objectDemo();
        o.x = 15;
        PassObject p = new PassObject();
        p.display(o);
        p.display2();

    }
}
class PassObject{
    void display(objectDemo od1){
        System.out.println("The vlaue of x is : "+od1.x);
    }
    void display2(){
        objectDemo od = new objectDemo();
        System.out.println("The value of x is in display2 : "+od.x);
    }
}