public class Shark extends Fish{
    protected Shark() {
        super("Large", "Grey");
    }

    @Override
    void eat() {
        System.out.println("I'm eating smaller fishes....");
    }
}
