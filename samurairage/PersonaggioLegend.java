package samurairage;

public abstract class PersonaggioLegend extends Personaggio {
    private int abilitaSpeciale;

    public PersonaggioLegend(String nome, int forza, int difesa, int velocita, int abilitaSpeciale) {
        super(nome, forza, difesa, velocita);
        this.abilitaSpeciale = abilitaSpeciale;
    }

    public int getAbilitaSpeciale() {
        return abilitaSpeciale;
    }
}
