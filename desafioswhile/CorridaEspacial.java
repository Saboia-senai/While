package desafioswhile;

import java.util.Scanner;

public class corridaespacial {
	
	
		public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
	     int estrelas = 0;
	     String comando;

	     System.out.println("🚀 Corrida Espacial Iniciada!");
	     System.out.println("Colete estrelas e desvie dos meteoros!\n");

	     while (estrelas < 30) {
	         estrelas++;
	         System.out.println("⭐ Estrela coletada: " + estrelas);

	         if (estrelas % 10 == 0) {
	             System.out.println("☄️ Meteoro! Digite 'esquerda' ou 'direita' para desviar.");

	             do {
	                 System.out.print("Comando: ");
	                 comando = ler.next().toLowerCase();
	             } while (!comando.equals("esquerda") && !comando.equals("direita"));

	             System.out.println("✅ Você desviou com sucesso!\n");
	         }
	     }

	     System.out.println("🏁 Fim da corrida! Você coletou 30 estrelas!");
	     ler.close();
	 }
	}
