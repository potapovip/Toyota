import abstractCars.StartCarException;
import detail.*;
import models.Camry;

public class Runner {
    public static void main(String[] args) throws StartCarException {
        Engine engine = new Engine();
        FuelTank fuelTank = new FuelTank();
        Electronic electronic = new Electronic();
        Lights lights = new Lights();
        Wheel[] wheels = createWheels(CarWheelRadius.R17);
        CruiseControl cruiseControl = new CruiseControl();
        Usb usb = new Usb();
        fuelTank.setFuelQuantity(10);

        Camry camry1 = new Camry("Silver", 160, GearboxType.ROBOT, false, 3_200_000, wheels, engine, electronic,
                fuelTank, lights, CarWheelRadius.R17,cruiseControl,usb);
        camry1.turnOnLights();
        camry1.startMoving();
        camry1.stopMoving();
        camry1.enableCruiseControl();
        camry1.enableCruiseControl();

    }


    public static Wheel[] createWheels(CarWheelRadius carWheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(CarWheelRadius.R17);
        }
        return wheels;
    }
}
