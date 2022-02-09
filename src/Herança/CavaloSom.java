package Herança;

public class CavaloSom extends Testes1 {
	private String relincho;

	public String getRelincho() {
		return relincho;
	}

	public void setRelincho(String relincho) {
		this.relincho = relincho;
	}
	
	public String getNome()
	{
		return "Som do cavalo: "+super.getNome()+" - relincho:  "+this.getRelincho();
	}
}
