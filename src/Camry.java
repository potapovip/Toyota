public class Camry extends PassengerCar{
    private Usb usb;

    public Camry(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price, Wheel[] wheels,
                 Engine engine, Electronic electronic, FuelTank fuelTank, Lights lights, CruiseControl cruiseControl,
                 Usb usb) {
        super(color, maxSpeed, gearboxType, isMoving, price, wheels, engine, electronic, fuelTank, lights, cruiseControl);
        this.usb = usb;
        for (Wheel wheel : wheels) {
            if(wheel.getWheelRadius()!=CarWheelRadius.R17){
                throw new RuntimeException("Wrong wheel radius");
            }
        }

    }

    public void deviceConnect() throws DeviceUsageExeption {
        if(!usb.isBroken()){
            usb.deviceConnected();
        }else throw new DeviceUsageExeption("Usb is broken");
    }
}
