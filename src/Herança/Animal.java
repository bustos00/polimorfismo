package Herança;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	private String carac;
	 
	public Animal(String nome, int idade, String som, String carac) 
	{
		this.nome= nome;
		this.idade= idade;
		this.som= som;
		this.carac= carac; 		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCarac() {
		return carac;
	}

	public void setCarac(String carac) {
		this.carac = carac;
	}

	
}
	

