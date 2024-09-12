package br.com.willdias;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tipo de pessoa (F para Pessoa Física ou J para Pessoa Jurídica):");
		String tipo = scanner.nextLine().trim().toUpperCase();
		
		System.out.println("Digite o nome:");
		String nome = scanner.nextLine().trim();
		
		Pessoa pessoa = null;
		
		if (tipo.equals("F")) {
            pessoa = new PessoaFisica(nome);
        } else if (tipo.equals("J")) {
            pessoa = new PessoaJuridica(nome);
        } else {
            System.out.println("Tipo inválido! Use 'F' para Física e 'J' para Jurídica.");
        }

        // Exibe os dados se uma pessoa válida foi criada
        if (pessoa != null) {
            pessoa.exibirDados();
        }

        // Fecha o scanner
        scanner.close();
	}

}
