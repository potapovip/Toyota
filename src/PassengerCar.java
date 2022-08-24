public abstract class PassengerCar extends Car{
    CruiseControl cruiseControl;
    public PassengerCar(String color, int maxSpeed, String gearboxType, boolean isMoving, Wheel[] wheel,
                        Electronic electronic, Engine engine, Lights lights, FuelTank fuelTank, double price,CruiseControl cruiseControl) {
        super(color, maxSpeed, gearboxType, isMoving, wheel, electronic, engine, lights, fuelTank, price);
        this.cruiseControl = cruiseControl;
    }
    // TODO: 23.08.2022 метод включения и выключения круих контроля
}
