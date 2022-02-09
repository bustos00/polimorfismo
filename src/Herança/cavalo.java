package Herança;

public class cavalo extends Animal {

	private String infoCavalo;
	
	public cavalo(String nome, int idade, String som, String carac, String infoCavalo) 
	{
		super(nome, idade, som, carac);
		this.infoCavalo = infoCavalo;	
	}

	public String getInfoCavalo() {
		return infoCavalo;
	}

	public void setInfoCavalo(String infoCavalo) {
		this.infoCavalo = infoCavalo;
	}
	
}
