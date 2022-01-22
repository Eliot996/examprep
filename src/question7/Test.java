package question7;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(new Circle(Math.random()*10));
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            list.add(new Square(Math.random()*10));
            System.out.println(10 + i);
        }

        for (Shape s : list) {
            System.out.println(s.getArea());
        }

        Square square = new Square(10);
        System.out.println(square.getArea());

        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
    }
}
