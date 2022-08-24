public abstract class Cabriolet extends Car{
    ConvertibleRoof convertibleRoof;

    public Cabriolet(String color, int maxSpeed, String gearboxType, boolean isMoving, Wheel[] wheel,
                     Electronic electronic, Engine engine, Lights lights, FuelTank fuelTank, double price,ConvertibleRoof convertibleRoof) {
        super(color, maxSpeed, gearboxType, isMoving, wheel, electronic, engine, lights, fuelTank, price);
        this.convertibleRoof = convertibleRoof;
    }
}
