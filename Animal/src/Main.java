abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog's sound");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat's sound");
    }
}

abstract class Vehicle{
    abstract void move();
    abstract void permission();
}

class Rickshaw extends Vehicle{
    void move(){

    }
    void permission(){

    }
}

abstract class MotorVehicle extends Vehicle{
    abstract void refill();
}

class CNG extends MotorVehicle{
    void move(){

    }
    void permission(){

    }

    void refill(){
        System.out.println("cng");
    }
}

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.sound();
        Vehicle v = new Rickshaw();
        v.move();
        v = new CNG();
        v.move();
        v.permission();
//        v.reill();
        MotorVehicle m = (MotorVehicle) v;
        m.refill();
    }
}