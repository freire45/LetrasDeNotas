package br.com.erickfreire.letrasdenotas;

import java.util.Scanner;

/**
 * Programa em Java que calcula a letra das notas de alunos
 * @author Erick Freire
 * @version 1 - Criado em 16-04-2021 as 14:13
 */

public class LetrasDeNotas {
	public static void main(String[] args) {
		int total = 0;
		int contadorDeNotas = 0;
		int contaA = 0;
		int contaB = 0;
		int contaC = 0;
		int contaD = 0;
		int contaF = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n   %s%n   %s%n", 
				"Entre com um valor de nota entre 0 - 100.",
				"Tipo de finalizador de entradas: ",
				"No Unix ou Linux ou MAC OS, aperte <CTRL) + D e aperte enter:",
				"No Windows aperte <Ctrl> + Z e aperte enter:");
		
		
		while(entrada.hasNext()) {
			int nota = entrada.nextInt();
			total += nota;
			++contadorDeNotas;
			
			switch (nota/10){
			
			case 9 :
			case 10:
				++contaA;
				break;
				
			case 8:
				++contaB;
				break;
				
			case 7:
				++contaC;
				break;
				
			case 6:
				++contaD;
				break;
				
			default:
				++contaF;
				break;
				
			
			}
		}
		
		System.out.printf("%nRelatório de Notas: %n");
		
		if (contadorDeNotas != 0){
			double media = (double) total / contadorDeNotas;
			System.out.printf("Total %d notas inseridas é de: %d%n",
			contadorDeNotas, total);
			System.out.printf("A média da Classe é:  %.2f%n", media);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
			"Número de estudantes que recebeu notas: ",
			"A: ", contaA,
			"B: ", contaB, 
			"C: ", contaC, 
			"D: ", contaD, 
			"F: ", contaF); 
			} 
			else 
			System.out.println("Nenhuma nota foi inserida!");
	}

}
