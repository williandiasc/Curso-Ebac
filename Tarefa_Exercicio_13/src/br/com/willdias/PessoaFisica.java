package br.com.willdias;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String nome) {
		super(nome);
		
	}

	@Override
	public void exibirDados() {
		System.out.println("Pessoa Física: " + nome);
		
	}
	
}
