package Herança;

public class Cachorro1 extends Testes1 {
	private String late;

	public String getLate() {
		return late;
	}

	public void setLate(String late) {
		this.late = late;
	}

	public String getNome()
	{
		return "Som do cahorro: "+super.getNome()+" - late:  "+this.getLate();
	
	}
}
