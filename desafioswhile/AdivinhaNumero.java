package desafioswhile;
import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        // Criando objetos para entrada de dados e geração de números aleatórios
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        
        // Gerando número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;
        int palpite = 0;
        
        System.out.println("Bem-vindo ao jogo de Adivinhação do Número Secreto!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        
        // Loop principal do jogo
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = ler.nextInt();
            tentativa++;
            
            // Verifica se o palpite está correto
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
                System.out.println("Número de tentativas: " + tentativa);
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR que seu palpite.");
            } else {
                System.out.println("O número secreto é MENOR que seu palpite.");
            }
        }
        
        ler.close();
    }
}