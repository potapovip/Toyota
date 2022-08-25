package models;

import abstractCars.DeviceUsageExeption;
import abstractCars.PassengerCar;
import detail.*;

public class Camry extends PassengerCar {
    private Usb usb;

    public Camry(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price, Wheel[] wheels,
                 Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights,
                 CarWheelRadius carWheelRadius, CruiseControl cruiseControl, Usb usb) {
        super(color, maxSpeed, gearboxType, isMoving, price, wheels, engine, electronic, fuelTank, lights,
                carWheelRadius, cruiseControl);
        this.usb = usb;
    }

    public void deviceConnect() throws DeviceUsageExeption {
        if (!usb.isBroken()) {
            usb.deviceConnected();
        } else throw new DeviceUsageExeption("detail.Usb is broken");
    }

}