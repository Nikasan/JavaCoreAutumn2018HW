package box;

public class Box {
    int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки

    // Конструктор ,без параметров
    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    // Конструктор ,с параметрами
    Box(int w, int h, int d) {
         //вызов конструктора по умолчанию,
        this();
        width = w;
        //  height = h;
        depth = d;

    }

    //Конструктор, у которого вместо параметра объект типа Shape
    Box(Shape objShape) {
        this.width = objShape.widht;
        this.height = objShape.heignt;
        this.depth = objShape.depth;
    }

    // вычисляем объём коробки
    int getVolume() {
        return width * height * depth;
    }
}
