package OOPPolymorfizm;

import OOPPolymorfizm.Animal;
import OOPPolymorfizm.Cat;
import OOPPolymorfizm.Duck;

public class PolymorfizmMain {
    public static void main(String[] args) {

        Animal animal1 = new Cat();
        Animal animal2 = new Duck();

        animal1.sound();
        animal2.sound();

        animal1.numberOfFeet();
        animal2.numberOfFeet();
    }
}