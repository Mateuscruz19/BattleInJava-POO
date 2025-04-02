public class Batalha {
    private Personagem personagem;
    private Inimigo inimigo;

    public Batalha(Personagem personagem, Inimigo inimigo) {
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    public void iniciarBatalha() {
        System.out.println("=== Batalha Iniciada ===");
        System.out.println(personagem.getNome() + " vs " + inimigo.getNome());
        System.out.println();

        while (personagem.estaVivo() && inimigo.estaVivo()) {
            // Turno do personagem
            System.out.println("Turno de " + personagem.getNome());
            int danoPersonagem = personagem.getAtaque() - inimigo.getDefesa();
            if (danoPersonagem > 0) {
                inimigo.receberDano(danoPersonagem);
                System.out.println(personagem.getNome() + " causou " + danoPersonagem + " de dano!");
            } else {
                System.out.println(personagem.getNome() + " não causou dano!");
            }
            System.out.println(inimigo.getNome() + " tem " + inimigo.getVida() + " de vida");

            // Turno do inimigo (se ainda estiver vivo)
            if (inimigo.estaVivo()) {
                System.out.println("\nTurno de " + inimigo.getNome());
                int danoInimigo = inimigo.getAtaque() - personagem.getDefesa();
                if (danoInimigo > 0) {
                    personagem.receberDano(danoInimigo);
                    System.out.println(inimigo.getNome() + " causou " + danoInimigo + " de dano!");
                } else {
                    System.out.println(inimigo.getNome() + " não causou dano!");
                }
                System.out.println(personagem.getNome() + " tem " + personagem.getVida() + " de vida");
            }
            System.out.println("\n-------------------\n");
        }

        // Anunciar vencedor
        if (personagem.estaVivo()) {
            System.out.println(personagem.getNome() + " venceu a batalha!");
        } else {
            System.out.println(inimigo.getNome() + " venceu a batalha!");
        }
    }
} 