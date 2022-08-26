package models;

import abstractCars.Cabriolet;
import abstractCars.DeviceUsageExeption;
import detail.*;

public class Solara extends Cabriolet {
    private Refregerator refregerator;
    private CarWheelRadius carWheelRadius;

    public Solara(String color, int maxSpeed, GearboxType gearboxType, double price, Wheel[] wheels, Engine engine,
                  Electronic electronic, FuelTank fuelTank, Lights lights, ConvertibleRoof convertibleRoof,
                  Refregerator refregerator) {
        super(color, maxSpeed, gearboxType, price, wheels, engine, electronic, fuelTank, lights, convertibleRoof);
        this.refregerator = refregerator;
        this.carWheelRadius = CarWheelRadius.R16;
        for (Wheel wheel : wheels) {
            if (wheel.getWheelRadius() != carWheelRadius) {
                throw new RuntimeException("Wrong wheel radius");
            }
        }
    }

    public void coolTheDrink() throws DeviceUsageExeption {
        if (!refregerator.isBroken()) {
            refregerator.turnOnRefregerator();
        } else throw new DeviceUsageExeption("Refregerator is broken");
    }
}
