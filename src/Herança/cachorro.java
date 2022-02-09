package Herança;

public class cachorro extends Animal {

	private String informacoes;
	
	public cachorro(String nome, int idade, String som, String carac, String informacoes)
	{
		super(nome, idade, som, carac);
		this.informacoes = informacoes;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	
	
}
