public class Wheel extends Detail{

    private boolean isPierced;
    private CarWheelRadius wheelRadius;

    public Wheel(CarWheelRadius wheelRadius) {
        this.isPierced = false;
        this.wheelRadius = wheelRadius;
    }

    public boolean isPierced() {
        return isPierced;
    }

    public CarWheelRadius getWheelRadius() {
        return wheelRadius;
    }

    public void setPierced(boolean pierced) {
        isPierced = pierced;
    }
}
