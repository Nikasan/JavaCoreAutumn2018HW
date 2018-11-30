package Learner1;

import static Learner1.Car.getInstance;

class Car {
    private static Car instance;

    private Car() {
    }

    public static Car getInstance() {
        if (instance == null)
        instance = new Car();
        return instance;
    }
}

public class Singletone {
    public static void main(String[] args) {
        Car myCar = Car.getInstance();
        System.out.println(myCar);



        Car secondCar = Car.getInstance();
        System.out.println(secondCar);


    }
}
