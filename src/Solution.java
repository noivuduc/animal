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
    }
}
