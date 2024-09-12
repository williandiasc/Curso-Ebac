package br.com.willdias;

public class PessoaJuridica extends Pessoa {
	

	public PessoaJuridica(String nome) {
		super(nome);
				
	}
	
	
	
	@Override
	public void exibirDados() {
		System.out.println("Pessoa Jurídica: " + nome);
		
	}

	 
}
