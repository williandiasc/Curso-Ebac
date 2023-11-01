package br.com.wdias;

public class Veiculo {
		/*
		 * @author Willian Dias	
		 * 
		 * */
	    private String marca;
	    private String modelo;
	    private int ano;
	    private String cor;

	    public Veiculo(String marca, String modelo, int ano, String cor) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.ano = ano;
	        this.cor = cor;
	    }

	    public void ligar() {
	        System.out.println("O veículo está ligado.");
	    }

	    public void desligar() {
	        System.out.println("O veículo está desligado.");
	    }

	    public void acelerar() {
	        System.out.println("O veículo está acelerando.");
	    }

	    public void frear() {
	        System.out.println("O veículo está freando.");
	    }
	    
	    /**
	     * Obtém informações detalhadas sobre o veículo, incluindo a marca, o modelo, o ano e a cor.
	     *
	     * @return Uma string formatada contendo as informações do veículo.
	     */
	    
	    public String getInfo() {
	        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor;
	    }

	    public static void main(String[] args) {
	        Veiculo meuVeiculo = new Veiculo("Toyota", "Corolla", 2022, "Prata");

	        System.out.println("Informações do veículo:");
	        System.out.println(meuVeiculo.getInfo());

	        meuVeiculo.ligar();
	        meuVeiculo.acelerar();
	        meuVeiculo.frear();
	        meuVeiculo.desligar();
	    }
	}
