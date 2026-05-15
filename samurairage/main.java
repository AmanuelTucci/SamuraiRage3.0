
 import java.util.*;
 public class Main {
    public static void main(String[] args) {
        
        Personaggio p1 = new Personaggio("Samurai", 80, 70, 60);
        PersonaggioLegend pl1 = new PersonaggioLegend("Shogun", 90, 80, 70, 100);

        System.out.println("Personaggio: " + p1.getNome());
        System.out.println("Forza: " + p1.getForza());
        System.out.println("Difesa: " + p1.getDifesa());
        System.out.println("Velocità: " + p1.getVelocita());

        System.out.println("\nPersonaggio Legend: " + pl1.getNome());
        System.out.println("Forza: " + pl1.getForza());
        System.out.println("Difesa: " + pl1.getDifesa());
        System.out.println("Velocità: " + pl1.getVelocita());
        System.out.println("Abilità Speciale: " + pl1.getAbilitaSpeciale());
    }
}