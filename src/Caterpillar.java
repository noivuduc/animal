public class Caterpillar extends ButterFly implements CanWalk, Transformation {
    @Override
    public void walk() {
        System.out.println("Caterpillar walking");
    }

    @Override
    void eat() {
        System.out.println("Caterpillar eating");
    }

    @Override
    public Insect transform() {
        return new Pupa();
    }
}
