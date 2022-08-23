public abstract class Car {
    //Для всех машин характерны следующие атрибуты: цвет,
    // максимальная скорость, тип коробки передач (акпп, механика, робот),
    // в состоянии движения (да/нет).
String color;
int maxSpeed;
String gearboxType;
boolean isMoving;
double price;
Electronic electronic;
Engine engine;
Lights lights;
FuelTank fuelTank;
Wheel [] wheel;

    public Car(String color, int maxSpeed, String gearboxType, boolean isMoving, Wheel [] wheel, Electronic electronic,
               Engine engine, Lights lights, FuelTank fuelTank ,double price) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearboxType = gearboxType;
        this.isMoving = isMoving;
        this.wheel = wheel;
        this.electronic = electronic;
        this.engine = engine;
        this.lights = lights;
        this.fuelTank = fuelTank;
        this.price = price;
    }
    public void startMoving(){
        this.isMoving = true;
        System.out.println("Car start moving");
    }
}
