package models;

import abstractCars.CargoVan;
import detail.*;

public class Hiance extends CargoVan {
    private Wheel safeWheel;
    private CarWheelRadius carWheelRadius;

    public Hiance(String color, int maxSpeed, GearboxType gearboxType, double price, Wheel[] wheels, Engine engine,
                  Electronic electronic, FuelTank fuelTank, Lights lights, int loadCapacity, Wheel safeWheel) {
        super(color, maxSpeed, gearboxType, price, wheels, engine, electronic, fuelTank, lights, loadCapacity);
        this.safeWheel = safeWheel;
        this.carWheelRadius = CarWheelRadius.R20;
        for (Wheel wheel : wheels) {
            if (wheel.getWheelRadius() != carWheelRadius) {
                throw new RuntimeException("Wrong wheel radius");
            }
        }
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }

    public void setSafeWheel(Wheel safeWheel) {
        this.safeWheel = safeWheel;
    }
}
