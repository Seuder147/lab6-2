public class Character {
    private final String name;
    private final CharacterRase race;
    private final Stats attributes;

    public Character(String name, CharacterRase race) {
        this.name = name;
        this.race = race;
        attributes = Stats.generate();
    }

    public void addRaceBonuses() {
        for (String title : attributes.getStats().keySet()) {
            attributes.getStats().put(title, attributes.getStats().get(title) + race.getRaceBonuses().getStats().get(title));
        }
    }

    public void talk() {
        race.print();
        System.out.println("Attributes:");

        for (String attribute : attributes.getStats().keySet()) {
            System.out.println(attribute + ": " + attributes.getStats().get(attribute));
        }

        System.out.println();
    }
}
