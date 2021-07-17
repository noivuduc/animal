public class UnderWaterAnimal extends Animal implements CanSwim{
    @Override
    void say() {
        System.out.println("Under waters animal can't say");
    }

    @Override
    public void swim() {
        System.out.println("I'm living under water and I can swim");
    }
}
