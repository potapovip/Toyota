package abstractCars;

import detail.*;

public abstract class CargoVan extends Car {
    private int loadCapacity;

    public CargoVan(String color, int maxSpeed, GearboxType gearboxType, double price, Wheel[] wheels, Engine engine,
                    Electronic electronic, FuelTank fuelTank, Lights lights, int loadCapacity) {
        super(color, maxSpeed, gearboxType, price, wheels, engine, electronic, fuelTank, lights);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
