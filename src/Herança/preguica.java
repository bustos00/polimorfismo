package Herança;

public class preguica extends Animal {
	
	private String rasPreguica;
	
	public preguica(String nome, int idade, String som, String carac, String rasPreguica)
	
	{
		super(nome, idade, som, carac);
		this.rasPreguica = rasPreguica;
	}

	public String getRasPreguica() {
		return rasPreguica;
	}

	public void setRasPreguica(String rasPreguica) {
		this.rasPreguica = rasPreguica;
	}
	
}
