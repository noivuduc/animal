public class Bird extends FlyingAnimal implements CanSing, CanWalk {

    @Override
    public void sing() {
        System.out.println("I'm Singing");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking");
    }
}
