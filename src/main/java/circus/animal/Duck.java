package circus.animal;

public class Duck extends Bird {
    @Override
    public String speak() {
        return toString() + "  Quack Quack";
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "I'm a circus.animal.Duck";
=======
        return "I'm " + name + ". I am a Duck!";
>>>>>>> upstream/master
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }
<<<<<<< HEAD
=======

    @Override
    public int getValue() {
        return 10;
    }

    public Duck(String name) {
        this.name = name;
    }
>>>>>>> upstream/master
}
