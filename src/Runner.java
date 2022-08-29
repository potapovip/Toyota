import abstractCars.DeviceUsageExeption;
import abstractCars.StartCarException;
import detail.*;
import factory.Conveyor;
import factory.Countries;
import factory.CountyFactoryNotEqualException;
import factory.Factory;
import models.Camry;
import models.Dyna;
import models.Hiance;
import models.Solara;

public class Runner {
    public static void main(String[] args) throws StartCarException, DeviceUsageExeption, CountyFactoryNotEqualException {
        Engine engine = new Engine();
        FuelTank fuelTank = new FuelTank();
        Electronic electronic = new Electronic();
        Lights lights = new Lights();
        Wheel[] wheels = createWheels(CarWheelRadius.R17);
        CruiseControl cruiseControl = new CruiseControl();
        Usb usb = new Usb();
        fuelTank.setFuelQuantity(10);

        Camry camry1 = new Camry("Silver", 160, GearboxType.ROBOT, 3_200_000, wheels, engine, electronic, fuelTank,
                lights, cruiseControl, usb);
        camry1.turnOnLights();
        camry1.startMoving();
        camry1.stopMoving();
        camry1.enableCruiseControl();
        camry1.enableCruiseControl();
        System.out.println("-----------------------");

        Engine engine1 = new Engine();
        FuelTank fuelTank1 = new FuelTank();
        Electronic electronic1 = new Electronic();
        Lights lights1 = new Lights();
        Wheel[] wheels1 = createWheels(CarWheelRadius.R16);
        Refregerator refregerator = new Refregerator();
        ConvertibleRoof convertibleRoof = new ConvertibleRoof();
        fuelTank1.setFuelQuantity(10);

        Solara solara = new Solara("black", 150, GearboxType.MECHANICAL, 3_000_000, wheels1, engine1, electronic1,
                fuelTank1, lights1, convertibleRoof, refregerator);
        solara.startMoving();
        solara.stopMoving();
        solara.coolTheDrink();
        solara.openRoof();
        solara.openRoof();
        System.out.println("-----------------------");

        Engine engine2 = new Engine();
        FuelTank fuelTank2 = new FuelTank();
        Electronic electronic2 = new Electronic();
        Lights lights2 = new Lights();
        Wheel[] wheels2 = createWheels(CarWheelRadius.R20);
        fuelTank2.setFuelQuantity(10);
        Socket socket = new Socket();
        Dyna dyna = new Dyna("Grey", 100, GearboxType.MECHANICAL, 5_000_000, wheels2, engine2, electronic2, fuelTank2
                , lights2, 200, socket);
        dyna.startMoving();
        dyna.stopMoving();
        dyna.chargePhone();
        dyna.turnOnLights();

        System.out.println("-----------------------");

        Engine engine3 = new Engine();
        FuelTank fuelTank3 = new FuelTank();
        Electronic electronic3 = new Electronic();
        Lights lights3 = new Lights();
        Wheel[] wheels3 = createWheels(CarWheelRadius.R20);
        fuelTank2.setFuelQuantity(10);
        Wheel safeWheel = new Wheel(CarWheelRadius.R20);
        Hiance hiance = new Hiance("White", 120, GearboxType.AUTOMATIC, 6_500_000, wheels3, engine3, electronic3,
                fuelTank3, lights3, 300, safeWheel);
        dyna.startMoving();
        dyna.stopMoving();
        dyna.chargePhone();
        dyna.turnOnLights();

        System.out.println("+++++++++++++++++++++++++++++++++");
        Factory factory = new Factory(Countries.USA);
        Conveyor conveyor = new Conveyor(Countries.USA,factory);
        Camry camry = conveyor.createCamry("Black", 1_500_000);
        camry.enableCruiseControl();
        camry.refuel(10);
        camry.startMoving();



    }


    public static Wheel[] createWheels(CarWheelRadius carWheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(carWheelRadius);
        }
        return wheels;
    }

}
