package circus.animal;

import circus.animal.Bird;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return name + " wants a cracker";
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am a Parrot!";
    }
<<<<<<< HEAD
=======

    @Override
    public int getValue() {
        return 20;
    }

    public Parrot(String name) {
        this.name = name;
    }
>>>>>>> upstream/master
}
