import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        // A.2

        Duck duck = new Duck();
        duck.swim();
        duck.say();
        duck.walk();

        Chicken chicken = new Chicken();
        chicken.say();
        chicken.walk();

        Parrot parrot = new Parrot(duck);
        parrot.say();

        Shark shark = new Shark();
        shark.eat();
        shark.say();
        Dolphin dolphin = new Dolphin();
        dolphin.swim();

        List<Animal> animals = new ArrayList<>(){{
            add(new Chicken());
            add(new Duck());
            add(new Bird());
            add(new Shark());
        }};
        countAnimal(animals);
    }

    private static void countAnimal(List<Animal> animals) {
        int canFly = 0;
        int canWalk = 0;
        int canSing = 0;
        int canSwim = 0;

        for (Animal animal: animals) {
            if (animal instanceof CanSwim) {
                canSwim++;
            }
            if (animal instanceof CanFly) {
                canFly++;
            }
            if (animal instanceof CanWalk) {
                canWalk++;
            }
            if (animal instanceof CanSing) {
                canSing++;
            }
        }

        System.out.println(canFly + " animal(s) can fly");
        System.out.println(canSing + " animal(s) can sing");
        System.out.println(canSwim + " animal(s) can swim");
        System.out.println(canWalk + " animal(s) can walk");
    }
}
