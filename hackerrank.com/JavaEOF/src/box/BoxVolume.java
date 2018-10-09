package box;


public class BoxVolume {
    public static void main(String[] args) {

        Shape shape1=new Shape(30,40,50);
        Box box=new Box(shape1);
        System.out.println("Объём коробки: " +box.getVolume());

//        Box catBox = new Box(10,20,30);
//        System.out.println("Объём коробки: " + catBox.getVolume());
    }
}