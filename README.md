# Arena de Batalha - Projeto POO

Um jogo simples de batalha por turnos desenvolvido em Java puro, demonstrando conceitos fundamentais de Programação Orientada a Objetos.

## 🎮 Sobre o Projeto

Este projeto foi desenvolvido como parte de um exercício de Programação Orientada a Objetos, focando em:
- Definição e uso de classes e construtores
- Encapsulamento de atributos
- Uso de coleções (ArrayList)
- Interação entre objetos
- Herança

## 🏗️ Estrutura do Projeto

O projeto é composto por 4 classes principais:

1. `Personagem.java`
   - Classe base com atributos básicos
   - Implementa getters e setters
   - Gerencia vida e dano

2. `Inimigo.java`
   - Herda de Personagem
   - Representa os oponentes do jogador

3. `Batalha.java`
   - Gerencia o sistema de combate
   - Controla os turnos
   - Calcula danos

4. `Main.java`
   - Ponto de entrada do programa
   - Gerencia a interface do usuário
   - Controla a seleção de personagens

## 🎯 Personagens Disponíveis

### Heróis
1. **Guerreiro**
   - Vida: 100
   - Ataque: 15
   - Defesa: 10

2. **Mago**
   - Vida: 80
   - Ataque: 20
   - Defesa: 5

3. **Arqueiro**
   - Vida: 90
   - Ataque: 18
   - Defesa: 8

### Inimigos
1. **Dragão**
   - Vida: 120
   - Ataque: 18
   - Defesa: 12

2. **Goblin**
   - Vida: 70
   - Ataque: 12
   - Defesa: 6

3. **Orc**
   - Vida: 100
   - Ataque: 15
   - Defesa: 8

## ⚔️ Sistema de Combate

- Combate por turnos
- Personagem ataca primeiro
- Cálculo de dano: Ataque - Defesa do alvo
- Dano negativo ou zero não causa dano
- Batalha continua até que um dos combatentes fique sem vida

## 🚀 Como Executar

1. Certifique-se de ter o JDK instalado
2. Clone ou baixe o repositório
3. Abra o terminal na pasta do projeto
4. Compile os arquivos:
   ```bash
   javac *.java
   ```
5. Execute o jogo:
   ```bash
   java Main
   ```
6. Siga as instruções na tela para:
   - Escolher seu personagem (1-3)
   - Escolher seu inimigo (1-3)
   - Acompanhar a batalha

## 💻 Requisitos

- Java Development Kit (JDK)
- Sistema operacional compatível com Java

## 📝 Observações

- O projeto foi desenvolvido para fins educacionais
- Foco em demonstrar conceitos básicos de POO
- Interface via console para simplicidade
