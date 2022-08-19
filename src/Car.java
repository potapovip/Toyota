public class Car {
    //Для всех машин характерны следующие атрибуты: цвет,
    // максимальная скорость, тип коробки передач (акпп, механика, робот),
    // в состоянии движения (да/нет).
String color;
int maxSpeed;
String gearboxType;
boolean isMoving;

    public Car(String color, int maxSpeed, String gearboxType, boolean isMoving) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.gearboxType = gearboxType;
        this.isMoving = isMoving;
    }
}
