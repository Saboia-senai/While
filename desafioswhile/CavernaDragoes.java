package desafioswhile;

import java.util.Scanner;
import java.util.Random;

public class CavernaDosDragões {
	

	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        Random rand = new Random();
	        int pontos = 0;

	        System.out.println("🧙‍♂️ Bem-vindo à Caverna dos Dragões!");
	        System.out.println("Você está em uma caverna escura cheia de dragões e tesouros.");
	        System.out.println("Cada escolha sua pode levar à vitória ou derrota... Boa sorte!");

	        while (true) {
	            System.out.println("\nVocê se encontra em um corredor misterioso.");
	            System.out.print("Você quer ir para frente, para a esquerda ou para a direita? ");
	            String escolha = ler.next().toLowerCase();

	            while (!escolha.equals("frente") && !escolha.equals("esquerda") && !escolha.equals("direita")) {
	                System.out.print("Escolha inválida. Digite frente, esquerda ou direita: ");
	                escolha = ler.next().toLowerCase();
	            }

	            int encontro = rand.nextInt(10); // 0 a 9

	            if (encontro < 3) {
	                System.out.println("🐉 Você encontrou um dragão feroz! 🛑 Você foi derrotado.");
	                break; // Fim do jogo
	            } else {
	                System.out.println("💰 Você encontrou um tesouro brilhante! Ganhou 10 pontos.");
	                pontos += 10;

	                System.out.print("Você quer continuar explorando a caverna? (sim/não): ");
	                String continuar = ler.next().toLowerCase();

	                while (!continuar.equals("sim") && !continuar.equals("não") && !continuar.equals("nao")) {
	                    System.out.print("Resposta inválida. Digite sim ou não: ");
	                    continuar = ler.next().toLowerCase();
	                }

	                if (continuar.equals("não") || continuar.equals("nao")) {
	                    System.out.println("🛡️ Você decidiu sair da caverna com " + pontos + " pontos.");
	                    break; // Fim do jogo
	                }
	            }
	        }

	        System.out.println("\n==============================");
	        System.out.println("🏁 Jogo Finalizado do the king!");
	        System.out.println("🏆 Pontuação final: " + pontos + " pontos");
	        System.out.println("==============================");

	        ler.close();
	    }
	}
