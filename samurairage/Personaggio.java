package samurairage;

public class Personaggio {
    private String nome;
    private int forza;  
    private int difesa;
    private int velocita;
    public Personaggio(String nome, int forza, int difesa, int velocita) {
        this.nome = nome;
        this.forza = forza;
        this.difesa = difesa;
        this.velocita = velocita;
    }               
    public String getNome() {
        return nome;
    }
    public int getForza() {
        return forza;
    }
    public int getDifesa() {
        return difesa;
    }
    public int getVelocita() {
        return velocita;
    }

        
}
