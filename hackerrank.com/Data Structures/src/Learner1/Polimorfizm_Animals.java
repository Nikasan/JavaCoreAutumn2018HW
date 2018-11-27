package Learner1;

abstract class Animals {
    abstract String sound();
}

class Dog extends Animals {

    @Override
    String sound() {
        return "Gav";
    }
}

class Kitty extends Animals {
    @Override
    String sound() {
        return "Mur";
    }
}

class MusicMaker {
    public String getSound(Animals animal) {
        return animal.sound();
    }
}

public class Polimorfizm_Animals {
    public static void main(String[] args) {

        Dog lucky = new Dog();
        Kitty tom = new Kitty();
        MusicMaker maker = new MusicMaker();
        String a = maker.getSound(lucky);
        System.out.println(a);

        String b = maker.getSound(tom);
        System.out.println(b);
    }
}
