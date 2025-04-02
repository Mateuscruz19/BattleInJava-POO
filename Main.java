import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criar lista de personagens disponíveis
        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(new Personagem("Guerreiro", 100, 15, 10));
        personagens.add(new Personagem("Mago", 80, 20, 5));
        personagens.add(new Personagem("Arqueiro", 90, 18, 8));

        // Criar lista de inimigos disponíveis
        ArrayList<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(new Inimigo("Dragão", 120, 18, 12));
        inimigos.add(new Inimigo("Goblin", 70, 12, 6));
        inimigos.add(new Inimigo("Orc", 100, 15, 8));

        // Mostrar personagens disponíveis
        System.out.println("=== Personagens Disponíveis ===");
        for (int i = 0; i < personagens.size(); i++) {
            Personagem p = personagens.get(i);
            System.out.println((i + 1) + ". " + p.getNome() + 
                             " (Vida: " + p.getVida() + 
                             ", Ataque: " + p.getAtaque() + 
                             ", Defesa: " + p.getDefesa() + ")");
        }

        // Escolher personagem
        System.out.print("\nEscolha seu personagem (1-" + personagens.size() + "): ");
        int escolhaPersonagem = scanner.nextInt() - 1;
        Personagem personagemEscolhido = personagens.get(escolhaPersonagem);

        // Mostrar inimigos disponíveis
        System.out.println("\n=== Inimigos Disponíveis ===");
        for (int i = 0; i < inimigos.size(); i++) {
            Inimigo in = inimigos.get(i);
            System.out.println((i + 1) + ". " + in.getNome() + 
                             " (Vida: " + in.getVida() + 
                             ", Ataque: " + in.getAtaque() + 
                             ", Defesa: " + in.getDefesa() + ")");
        }

        // Escolher inimigo
        System.out.print("\nEscolha seu inimigo (1-" + inimigos.size() + "): ");
        int escolhaInimigo = scanner.nextInt() - 1;
        Inimigo inimigoEscolhido = inimigos.get(escolhaInimigo);

        // Iniciar batalha
        Batalha batalha = new Batalha(personagemEscolhido, inimigoEscolhido);
        batalha.iniciarBatalha();

        scanner.close();
    }
} 