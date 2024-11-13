public class Main {
    public static void main(String[] args) {
    Car2 car2 = new Car2("blue","tesla");
    System.out.println(car2.color);

    Car car = new Car();
    car.color = "red";
    car.start();
    car.openSunroof();

    Bike bike = new Bike();
    bike.color = "blue";
    bike.start();
    bike.backBreak();
    System.out.println(car.toString());
    }
}
class Vehicle{
    String color;

    void start(){
        System.out.println("차량이 출발합니다.");
    }
}

class Car extends Vehicle{
    Engine engine = new Engine();
    void openSunroof(){
        System.out.println("선류프를 엽니다.");
    }
}

class Bike extends Vehicle{
    Engine engine = new Engine();
    void backBreak(){
        System.out.println("Hold BackBreak.");
    }
}

class Car2{
    String color;
    String maker;
    Car2(String color, String maker) {
        this.color = color;
        this.maker = maker;
    }
}

class Engine{
    void run(){
        System.out.println("엔진이 작동합니다.");
    }
}

interface Flyable{
    void fly();
}
class Bird implements Flyable{

    @Override
    public void fly() {

    }
}