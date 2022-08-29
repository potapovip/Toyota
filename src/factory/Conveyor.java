package factory;

import detail.CarWheelRadius;
import detail.GearboxType;
import models.Camry;

public class Conveyor {
    private Countries countries;
    private Factory factory;

    public Conveyor(Countries countries, Factory factory) {
        this.countries = countries;
        this.factory = factory;
    }

    public Camry createCamry(String color, double price) throws CountyFactoryNotEqualException {
        if (this.countries.equals(factory.getCountries())) {
            return new Camry(color, 150, GearboxType.ROBOT, price, Factory.createWheels(CarWheelRadius.R17),
                    Factory.createEngine(), Factory.createElectronic(), Factory.createFuelTank(),
                    Factory.cteateLights(), Factory.createCruiseControl(), Factory.createUsb());
        } else {
            throw new CountyFactoryNotEqualException("Несоответствие страны конвеера - стране завода");
        }
    }
}


