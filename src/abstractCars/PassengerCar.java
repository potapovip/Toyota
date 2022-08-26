package abstractCars;

import detail.*;

public abstract class PassengerCar extends Car {
    private CruiseControl cruiseControl;

    public PassengerCar(String color, int maxSpeed, GearboxType gearboxType, double price, Wheel[] wheels,
                        Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights,
                        CruiseControl cruiseControl) {
        super(color, maxSpeed, gearboxType, price, wheels, engine, electronic, fuelTank, lights);
        this.cruiseControl = cruiseControl;
    }

    public void enableCruiseControl() {
        this.cruiseControl.changeStatus();
    }
}
