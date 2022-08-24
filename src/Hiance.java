public class Hiance extends CargoVan{
 private Wheel safeWheel;

    public Hiance(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price, Wheel[] wheels,
                  Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights, int loadCapacity, Wheel safeWheel) {
        super(color, maxSpeed, gearboxType, isMoving, price, wheels, engine, electronic, fuelTank, lights, loadCapacity);
        this.safeWheel = safeWheel;
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }

    public void setSafeWheel(Wheel safeWheel) {
        this.safeWheel = safeWheel;
    }
}
