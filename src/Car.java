public abstract class Car {
    //Для всех машин характерны следующие атрибуты: цвет,
    // максимальная скорость, тип коробки передач (акпп, механика, робот),
    // в состоянии движения (да/нет).
String color;
int maxSpeed;
String gearboxType;
boolean isMoving;
double price;

    public Car(String color, int maxSpeed, String gearboxType, boolean isMoving, double price) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearboxType = gearboxType;
        this.isMoving = isMoving;
        this.price = price;
    }
    public void startMoving(){
        this.isMoving = true;
        System.out.println("Car start moving");
    }
}
