public abstract class PassengerCar extends Car {
    private CruiseControl cruiseControl;

    public PassengerCar(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price,
                        Wheel[] wheels, Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights,
                        CarWheelRadius carWheelRadius, CruiseControl cruiseControl) {
        super(color, maxSpeed, gearboxType, isMoving, price, wheels, engine, electronic, fuelTank, lights,
                carWheelRadius);
        this.cruiseControl = cruiseControl;
    }

    public void enableCruiseControl() {
        this.cruiseControl.changeStatus();
    }
}
