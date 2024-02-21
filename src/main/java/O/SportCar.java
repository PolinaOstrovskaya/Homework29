package O;

public class SportCar implements Car{
    @Override
    public void setColor(String color) {
        System.out.println("Red");
    }

    @Override
    public void setPrice(double price) {
        System.out.println(30000);
    }
}
