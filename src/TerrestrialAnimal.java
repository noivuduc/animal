public abstract class TerrestrialAnimal extends Animal implements CanWalk {
    @Override
    public void walk() {
        System.out.println("I'm walking");
    }
}
