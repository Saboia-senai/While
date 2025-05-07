package desafioswhile;

import java.util.Scanner;


public class SuperHeroiContagem {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CODIGO_ARMADILHA = "54";

        System.out.println("Bem-vindo, Super-Herói!");
        System.out.print("Digite o número final da contagem para salvar a cidade: ");
        int numeroFinal = scanner.nextInt();

        System.out.println("\nContagem iniciada...");

        for (int i = 1; i <= numeroFinal; i++) {
            System.out.println("Contando: " + i);

            if (i % 10 == 0) {
                System.out.println("\n🚨 ARMADILHA ATIVADA! Digite o código para desativar (dica: 1 a 100)");

                String codigoDigitado;
                do {
                    System.out.print("Código da armadilha: ");
                    codigoDigitado = scanner.next();
                    if (!codigoDigitado.equals(CODIGO_ARMADILHA)) {
                        System.out.println("❌ Código incorreto! Tente novamente.");
                    }
                } while (!codigoDigitado.equals(CODIGO_ARMADILHA));

                System.out.println("✅ Armadilha desativada! Continuando a missão...\n");
            }
        }

        System.out.println("🎉 Parabéns! Você salvou a cidade!");
        scanner.close();
    }
}
