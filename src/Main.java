import pacadg.*;


public class Main {


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cats cat3 = new Cats();
        Cat cat2 = new Cat();

        cat1.setName("Barsik");
        cat1.setColor("White");
        cat1.setAge(4);
        cat2.setName("Murzik");
        cat2.setColor("Black");
        cat2.setAge(6);

        System.out.println("Cat1 named: " + cat1.getName() +
                " is " + cat1.getColor() +
                " has age: " + cat1.getAge());
        System.out.println("Cat2 named: " + cat2.getName() +
                " is " + cat2.getColor() +
                " has age: " + cat2.getAge());

        cat3.name = "Barsik";
        cat3.color = "White";
        cat3.age = 4;
        cat3.voice();
        cat3.jump();


    }



}