public abstract class CargoVan extends Car{
    public CargoVan(String color, int maxSpeed, String gearboxType, boolean isMoving, Wheel[] wheel, Electronic electronic, Engine engine, Lights lights, FuelTank fuelTank, double price) {
        super(color, maxSpeed, gearboxType, isMoving, wheel, electronic, engine, lights, fuelTank, price);
    }
}
