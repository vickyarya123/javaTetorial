class Shape {
    String color;

    public void area(int a ,int b) {
        System.out.println(a*b);
    }
}

class Triangle extends Shape {
    public void parameter(int a, int b){
        System.out.println(2*(a+b));
    }
}
class EquilateralTriangle extends Triangle{
    
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("hellow boss");
        Triangle t1 = new Triangle();
        // t1.color="red";
        // System.out.println(t1.color);
        t1.parameter(2, 5);
        t1.area(2, 5);
    }
}
