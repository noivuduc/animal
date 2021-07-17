public class Parrot extends Bird {
    private Animal livingWith;

    public Parrot(Animal livingWith) {
        this.livingWith = livingWith;
    }

    @Override
    void say() {
        livingWith.say();
    }
}
