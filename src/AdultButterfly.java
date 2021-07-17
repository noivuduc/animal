public class AdultButterfly extends ButterFly implements CanFly {
    @Override
    public void fly() {
        System.out.println("I'm flying...");
    }

    @Override
    void eat() {
        System.out.println("I'm eating...");
    }
}
