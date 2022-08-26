package factory;

import detail.*;

public class Factory {
    private Countries countries;

    public Factory(Countries countries) {
        this.countries = countries;
    }


    public static Engine createEngine() {
        return new Engine();
    }

    public static Electronic createElectronic() {
        return new Electronic();
    }

    public static FuelTank createFuelTank() {
        return new FuelTank();
    }

    public static Lights cteateLights() {
        return new Lights();
    }

    public static CruiseControl createCruiseControl() {
        return new CruiseControl();
    }

    public static ConvertibleRoof createConvertibleRoof() {
        return new ConvertibleRoof();
    }

    public static Refregerator createRefregerator() {
        return new Refregerator();
    }

    public static Socket createSocket() {
        return new Socket();
    }

    public static Usb createUsb() {
        return new Usb();
    }

    public static Wheel[] createWheels(CarWheelRadius carWheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(carWheelRadius);
        }
        return wheels;
    }
}
