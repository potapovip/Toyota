package abstractCars;

import detail.*;

public abstract class Cabriolet extends Car {
    private ConvertibleRoof convertibleRoof;

    public Cabriolet(String color, int maxSpeed, GearboxType gearboxType, double price, Wheel[] wheels, Engine engine
            , Electronic electronic, FuelTank fuelTank, Lights lights, ConvertibleRoof convertibleRoof) {
        super(color, maxSpeed, gearboxType, price, wheels, engine, electronic, fuelTank, lights);
        this.convertibleRoof = convertibleRoof;
    }

    public void openRoof() {
        this.convertibleRoof.changeRoofStatus();
    }
}
