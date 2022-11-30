public class Demo {
    public static void main(String[] args) {
        RaseAbstractFactory raseAbstractFactory = new HobgoblinFactory();

        Character hobgoblinr = new Character("Lin", raseAbstractFactory.create());
        hobgoblinr.addRaceBonuses();
        hobgoblinr.talk();

        raseAbstractFactory = new HalflingFactory();

        Character halfling = new Character("Bilbo", raseAbstractFactory.create());
        halfling.addRaceBonuses();
        halfling.talk();
}
}