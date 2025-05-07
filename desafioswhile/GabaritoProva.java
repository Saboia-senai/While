package desafioswhile;

import java.util.Scanner;

public class gabaritoprova {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] gabarito = {"A", "C", "B", "D", "A", "C", "D", "B", "A", "C"};
        int totalAlunos = 0;
        int totalNotas = 0;

        while (true) {
            int acertos = 0;

            System.out.println("\nAluno #" + (totalAlunos + 1) + ": Responda as questões");

            for (int i = 0; i < 10; i++) {
                String respostaAluno;
                while (true) {
                    System.out.print("Resposta da questão " + (i + 1) + " (A/B/C/D): ");
                    respostaAluno = ler.next().toUpperCase();

                    if (respostaAluno.matches("[ABCD]")) {
                        break; 
                    } else {
                        System.out.println("Resposta inválida. Por favor, digite apenas A, B, C ou D.");
                    }
                }

                if (respostaAluno.equals(gabarito[i])) {
                    acertos++;
                }
            }

            totalAlunos++;
            totalNotas += acertos;

            System.out.println("Você acertou " + acertos + " questões.\n");

            System.out.print("Outro aluno vai usar o sistema? (sim/não): ");
            String resposta = ler.next().toLowerCase();

            if (resposta.equals("não") || resposta.equals("nao")) {
                break;
            }
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.printf("Média das notas: %.2f\n", (double) totalNotas / totalAlunos);

        ler.close();
    }
}
