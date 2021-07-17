public class Bird extends FlyingAnimal implements CanSing {

    @Override
    public void sing() {
        System.out.println("I'm Singing");
    }

    @Override
    void say() { }
}
