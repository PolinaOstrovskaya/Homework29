package L;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setX(5);
        rectangle.setY(3);
        System.out.println(rectangle.getArea());
        rectangle.setX(7);
        System.out.println(rectangle.getArea());
    }
}

