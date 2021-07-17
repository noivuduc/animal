public class Pupa extends ButterFly implements Transformation {
    @Override
    void eat() {
        System.out.println("I'm getting fat");
    }

    @Override
    public Insect transform() {
        return new AdultButterfly();
    }
}
