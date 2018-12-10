package Learner1;

import javax.naming.directory.InvalidAttributeValueException;
import java.security.InvalidParameterException;

class Cat{
    protected String name = "Tom";
    private int age;
    private static String sound = "Mur";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSound() {
        return sound;
    }

    public static void setSound(String sound) {
        Cat.sound = sound;
    }
}


class Lion extends Cat{
    private int weight;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class Pantera extends Lion{
    private String color="Black";


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(!color.equals("black")){
            throw new InvalidParameterException("Color can't be not black");
        }
        this.color = color;
    }
}


public class Inkapsulation {
    public static void main(String[] args) {
        Cat Yarik = new Cat();
        Yarik.setAge(2);
        Yarik.setName("Yarik");
        Yarik.setSound("Mrrrrr");
        System.out.println(Yarik.getName()+Yarik.getAge()+" "+ Yarik.getSound());

        Lion Simba = new Lion();
        Simba.setAge(1);
        Simba.setName("Simba");
        Simba.setWeight(3);
        Simba.setSound("ARRRR");
        System.out.println(Simba.getAge()+" "+Simba.getWeight()+" "+Simba.getName()+" "+Simba.getSound());

        System.out.println();

        Pantera bagira =new Pantera();
        bagira.setWeight(10);
        Pantera.setSound("arrrr");

        try {
            bagira.setColor("arrr");
        } catch (InvalidParameterException e) {
            System.out.println(e);
        } finally {

            System.out.println("After exeption in finnally");
        }

        System.out.println(bagira.getWeight()+" "+bagira.getColor()+Pantera.getSound());
        System.out.println(String.format("%d %s %s",bagira.getWeight(),bagira.getColor(),bagira.getName()));
        System.out.println(bagira.toString());
    }
}
