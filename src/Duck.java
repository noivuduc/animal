public class Duck extends TerrestrialAnimal implements CanSwim {
    @Override
    void say() {
        System.out.println("Quack, Quack");
    }

    @Override
    public void swim() {
        System.out.println("I'm a lovely Duck and I can swim...");
    }
}
