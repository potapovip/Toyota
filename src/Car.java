public abstract class Car {
    //Для всех машин характерны следующие атрибуты: цвет,
    // максимальная скорость, тип коробки передач (акпп, механика, робот),
    // в состоянии движения (да/нет).
    private String color;
    private int maxSpeed;
    private GearboxType gearboxType;
    private boolean isMoving;
    private double price;

    public Car(String color, int maxSpeed, GearboxType gearboxType, boolean isMoving, double price) {
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
