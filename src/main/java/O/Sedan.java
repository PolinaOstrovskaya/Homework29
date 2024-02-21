package O;

public class Sedan implements Car{
    @Override
    public void setColor(String color) {
        System.out.println("Gray");
    }

    @Override
    public void setPrice(double price) {
        System.out.println(25000);
    }
}
