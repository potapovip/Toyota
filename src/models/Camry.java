package models;

import abstractCars.DeviceUsageExeption;
import abstractCars.PassengerCar;
import detail.*;

public class Camry extends PassengerCar {
    private Usb usb;
    private CarWheelRadius carWheelRadius;

    public Camry(String color, int maxSpeed, GearboxType gearboxType, double price, Wheel[] wheels, Engine engine,
                 Electronic electronic, FuelTank fuelTank, Lights lights, CruiseControl cruiseControl, Usb usb) {
        super(color, maxSpeed, gearboxType, price, wheels, engine, electronic, fuelTank, lights, cruiseControl);
        this.usb = usb;
        this.carWheelRadius = CarWheelRadius.R17;
        for (Wheel wheel : wheels) {
            if (wheel.getWheelRadius() != carWheelRadius) {
                throw new RuntimeException("Wrong wheel radius");
            }
        }
    }


    public void deviceConnect() throws DeviceUsageExeption {
        if (!usb.isBroken()) {
            usb.deviceConnected();
        } else throw new DeviceUsageExeption("Usb is broken");
    }

}
