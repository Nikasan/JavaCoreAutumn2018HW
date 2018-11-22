package Learner1;

class A {
    String a = "I am from A";
    void print(){
        System.out.println(a);
    }
}

class B extends A{
    String b="I am from B";

    void print(){
        System.out.println(b);
    }
}

public class Polimorfizm {
    public static void main(String[] args) {
        A qwerty = new A();
        qwerty.print();

        A abcdef = new B();
        abcdef.print();
    }
}
