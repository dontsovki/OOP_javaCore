package pacadg;

public class Cats {
    public String name;
    public String color;
    public int age;
    public void voice() {
        System.out.println(name + " meows");
    }
    public void jump() {
        if (this.age < 5) System.out.println(name + " jumps");
    }
}
