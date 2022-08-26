package abstractCars;


import detail.*;

public abstract class Car {

    private String color;
    private int maxSpeed;
    private GearboxType gearboxType;
    private boolean isMoving;
    private double price;
    private Wheel[] wheels;
    private Engine engine;
    private Electronic electronic;
    private FuelTank fuelTank;
    private Lights lights;


    public Car(String color, int maxSpeed, GearboxType gearboxType, double price, Wheel[] wheels, Engine engine,
               Electronic electronic, FuelTank fuelTank, Lights lights) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearboxType = gearboxType;
        this.isMoving = false;
        this.price = price;
        this.wheels = wheels;
        this.engine = engine;
        this.electronic = electronic;
        this.fuelTank = fuelTank;
        this.lights = lights;


    }

    public void startMoving() throws StartCarException {

        if (wheelDiagnictic() && !electronic.isBroken() && !lights.isBroken() && !engine.isBroken() && fuelTank.getFuelQuantity() > 0) {
            this.isMoving = true;
            System.out.println("Car start moving");
        }
        if (!wheelDiagnictic()) {
            throw new StartCarException("Car have a problem with wheels");
        }
        if (lights.isBroken()) {
            throw new StartCarException("Car have a problem with lights");
        }
        if (engine.isBroken()) {
            throw new StartCarException("Car have a problem with engine");
        }
        if (electronic.isBroken()) {
            throw new StartCarException("Car have a problem with electronic");
        }
        if (fuelTank.getFuelQuantity() <= 0) {
            throw new StartCarException("Car have a problem with fuel");
        }
    }

    public boolean wheelDiagnictic() {
        int countNotBrokenWheels = 0;
        if (wheels.length == 4) {
            for (Wheel wheel : wheels) {
                if (!wheel.isBroken()) {
                    countNotBrokenWheels++;
                }
            }
        } else return false;
        return countNotBrokenWheels == 4;
    }

    public void stopMoving() {
        isMoving = false;
        System.out.println("Car stop moving");
    }

    public void turnOnLights() {
        if (!lights.isBroken()) {
            System.out.println("Lights is turning on");
        }
    }
    public void  refuel(int fuelQuantity){
         fuelTank.setFuelQuantity(fuelQuantity);
    }
}
