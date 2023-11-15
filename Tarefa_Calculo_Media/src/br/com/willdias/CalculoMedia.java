package br.com.willdias;

import java.util.Scanner;

public class CalculoMedia {
	
	public static void main(String[] args) {
		// Criando um objeto Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira as quatro notas obtidas
        System.out.println("Digite a sua primeira nota e depois aperte a tecla Enter: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a sua segunda nota e depois aperte a tecla Enter: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a sua terceira nota e depois aperte a tecla Enter: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a sua quarta nota e depois aperte a tecla Enter: ");
        double nota4 = scanner.nextDouble();

        // Calculando a média das quatro notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Imprimindo a média no console
        System.out.println("A média das quatro notas que você obteve é: " + media);

        // Fechando o Scanner para evitar vazamentos de recursos
        scanner.close();
		
		
	}
	
	
}
