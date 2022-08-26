package factory;

import detail.CarWheelRadius;
import detail.GearboxType;
import models.Camry;

public class Conveyor{
    private Countries countries;

    public Conveyor(Countries countries) {
        this.countries = countries;
    }

    public  Camry createCamry(String color, double price) {

        return new Camry(color, 150, GearboxType.ROBOT, price, Factory.createWheels(CarWheelRadius.R17),
                Factory.createEngine(), Factory.createElectronic(), Factory.createFuelTank(), Factory.cteateLights(),
                Factory.createCruiseControl(), Factory.createUsb());
    }

}
