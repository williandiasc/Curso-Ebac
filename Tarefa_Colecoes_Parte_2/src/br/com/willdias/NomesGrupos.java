package br.com.willdias;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NomesGrupos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        System.out.println("Quantas pessoas você deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

        // Loop para capturar os nomes e sexos
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            String nome = scanner.nextLine().trim();

            System.out.println("Digite o sexo da pessoa (M para Masculino, F para Feminino):");
            String sexo = scanner.nextLine().trim().toUpperCase();

            // Verifica o sexo e adiciona o nome à lista correspondente
            if (sexo.equals("M")) {
                nomesMasculinos.add(nome);
            } else if (sexo.equals("F")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, use M ou F. (em letra maiscula)");
                i--; // Decrementa o contador para repetir a entrada em caso de erro
            }
        }

        // Ordena os nomes em cada lista
        Collections.sort(nomesMasculinos);
        Collections.sort(nomesFemininos);

        // Imprime os nomes Masculinos
        System.out.println("\nGrupo Masculino :");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        // Imprime os nomes Femininos
        System.out.println("\nGrupo Feminino :");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }

        // Fecha o Scanner
        scanner.close();

	}

}
