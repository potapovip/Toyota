package detail;

public class Refregerator extends DetailWithBrokenState {
    public Refregerator() {
        super(false);
    }

    public void turnOnRefregerator() {
        System.out.println("Drink is cooling");
    }
}
