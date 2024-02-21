package S;

public class Main {
    public static void main(String[] args) {
Computer computer=new Computer("IBM XT",80000);
    SaveComputer saveComputer=new SaveComputer();
    saveComputer.saveToFile("out.dat",computer);
    }
}