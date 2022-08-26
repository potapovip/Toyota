package models;

import abstractCars.CargoVan;
import abstractCars.DeviceUsageExeption;
import detail.*;

public class Dyna extends CargoVan {
    private Socket socket;
    private CarWheelRadius carWheelRadius;

    public Dyna(String color, int maxSpeed, GearboxType gearboxType, double price, Wheel[] wheels, Engine engine,
                Electronic electronic, FuelTank fuelTank, Lights lights, int loadCapacity, Socket socket) {
        super(color, maxSpeed, gearboxType, price, wheels, engine, electronic, fuelTank, lights, loadCapacity);
        this.socket = socket;
        this.carWheelRadius = CarWheelRadius.R20;
        for (Wheel wheel : wheels) {
            if (wheel.getWheelRadius() != carWheelRadius) {
                throw new RuntimeException("Wrong wheel radius");
            }
        }
    }

    public void chargePhone() throws DeviceUsageExeption {
        if (!socket.isBroken()) {
            socket.useSocket();
        } else throw new DeviceUsageExeption("Socket is broken");
    }
}
