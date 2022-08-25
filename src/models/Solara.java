package models;

import abstractCars.Cabriolet;
import abstractCars.DeviceUsageExeption;
import detail.*;

public class Solara extends Cabriolet {
    private Refregerator refregerator;

    public Solara(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price, Wheel[] wheels
            , Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights, CarWheelRadius carWheelRadius,
                  ConvertibleRoof convertibleRoof, Refregerator refregerator) {
        super(color, maxSpeed, gearboxType, isMoving, price, wheels, engine, electronic, fuelTank, lights,
                carWheelRadius, convertibleRoof);
        this.refregerator = refregerator;
    }

    public void coolTheDrink() throws DeviceUsageExeption {
        if (!refregerator.isBroken()) {
            refregerator.turnOnRefregerator();
        } else throw new DeviceUsageExeption("detail.Refregerator is broken");
    }
}
