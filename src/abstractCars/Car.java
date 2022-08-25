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
    private CarWheelRadius carWheelRadius;

    public Car(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price, Wheel[] wheels,
               Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights, CarWheelRadius carWheelRadius) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearboxType = gearboxType;
        this.isMoving = isMoving;
        this.price = price;
        this.wheels = wheels;
        this.engine = engine;
        this.electronic = electronic;
        this.fuelTank = fuelTank;
        this.lights = lights;
        this.carWheelRadius = carWheelRadius;
        for (Wheel wheel : wheels) {
            if(wheel.getWheelRadius()!=carWheelRadius){
                throw new RuntimeException("Wrong wheel radius");
            }
        }
    }

    public void startMoving() throws StartCarException {

        if (wheelDiagnictic() && !electronic.isBroken() && !lights.isBroken() && !engine.isBroken() && fuelTank.getFuelQuantity() > 0) {
            this.isMoving = true;
            System.out.println("abstractCars.Car start moving");
        }
        if (!wheelDiagnictic()) {
            throw new StartCarException("abstractCars.Car have a problem with wheels");
        }
        if (lights.isBroken()) {
            throw new StartCarException("abstractCars.Car have a problem with lights");
        }
        if (engine.isBroken()) {
            throw new StartCarException("abstractCars.Car have a problem with engine");
        }
        if (electronic.isBroken()) {
            throw new StartCarException("abstractCars.Car have a problem with electronic");
        }
        if (fuelTank.getFuelQuantity() <= 0) {
            throw new StartCarException("abstractCars.Car have a problem with fuel");
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
        System.out.println("abstractCars.Car stop moving");
    }

    public void turnOnLights() {
        if (!lights.isBroken()) {
            System.out.println("detail.Lights is turning on");
        }
    }

}
