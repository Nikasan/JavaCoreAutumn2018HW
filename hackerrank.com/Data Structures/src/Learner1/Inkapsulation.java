package Learner1;

class Cat{
    private String name = "Tom";
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

    public String getSound() {
        return sound;
    }
    public void setSound (String s){
        sound = s;

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

    }
}
