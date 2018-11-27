package Learner1;

abstract class Vehicle {
    abstract String getName();

    abstract int getSize();
}

class Train extends Vehicle {
    @Override
    String getName() {
        return "I am train";
    }

    @Override
    int getSize() {
        return 1;
    }

    public String Gudok() {
        return "tu-tu";
    }
}

class Jet extends Vehicle {

    @Override
    String getName() {
        return "I am Jet";
    }

    @Override
    int getSize() {
        return 2;
    }
}
class Helicopter extends Vehicle {

    @Override
    String getName() {
        return null;
    }

    @Override
    int getSize() {
        return 100;
    }
}

class SuperTrain extends Train {
    @Override
    String getName() {
        return "I am Supertrain";
    }

    @Override
    int getSize() {
        return 3;
    }
}

class Garage {
    private void parkbySize(int size) {
        switch (size) {
            case (1):
                System.out.println("parked 1");
                break;
            case (2):
                System.out.println("parked 2");
                break;
            case (3):
                System.out.println("parked 3");
                break;
            default:
                System.out.println("unknown size-do not park");
                break;
        }
    }

//    public void park(Train train) {
//        this.parkbySize(train.getSize());
//    }
//    public void park (Jet jet){
//        this.parkbySize(jet.getSize());
//    }
////    public void park (SuperTrain supertrain){
////        this.parkbySize(supertrain.getSize());
////    }
//    public  void park (Helicopter helicopter){
//        this.parkbySize(helicopter.getSize());
//    }
    public void park (Vehicle vehicle){
        this.parkbySize(vehicle.getSize());
    }
}

public class Polimorfizm {
    public static void main(String[] args) {
        Train starTrain = new Train();
        Jet jet147 = new Jet();
        SuperTrain superTrain = new SuperTrain();
        Helicopter heli = new Helicopter();
        Garage garage = new Garage();
        garage.park(superTrain);
        garage.park(starTrain);
        garage.park(jet147);
        garage.park(heli);


    }
}