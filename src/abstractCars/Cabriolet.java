package abstractCars;

import detail.*;

public abstract class Cabriolet extends Car {
   private ConvertibleRoof convertibleRoof;

    public Cabriolet(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price,
                     Wheel[] wheels, Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights,
                     CarWheelRadius carWheelRadius, ConvertibleRoof convertibleRoof) {
        super(color, maxSpeed, gearboxType, isMoving, price, wheels, engine, electronic, fuelTank, lights,
                carWheelRadius);
        this.convertibleRoof = convertibleRoof;
    }

    public void openRoof(){
        this.convertibleRoof.changeRoofStatus();
    }
}
