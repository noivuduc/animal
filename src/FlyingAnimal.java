public abstract class FlyingAnimal extends Animal implements CanFly, CanWalk {
    @Override
    public void fly() {
        System.out.println("I'm flying...");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking...");
    }
}
