public class Dyna extends CargoVan{
    private Socket socket;

    public Dyna(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price, Wheel[] wheels,
                Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights, CarWheelRadius carWheelRadius
            , int loadCapacity, Socket socket) {
        super(color, maxSpeed, gearboxType, isMoving, price, wheels, engine, electronic, fuelTank, lights,
                carWheelRadius, loadCapacity);
        this.socket = socket;
    }
public void chargePhone() throws DeviceUsageExeption {
        if (!socket.isBroken()){
            socket.useSocket();
        }else throw new DeviceUsageExeption("Socket is broken");
}
}
