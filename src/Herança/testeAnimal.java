package Herança;

public class testeAnimal {
	public static void main (String [] args) {
	
	Animal cachorro = new Animal("cachorro", 12 , "emite som" , "corre");
	Animal cavalo = new Animal ("cavalo", 9, " emitir som" , "correr");
	Animal preguica = new Animal("preguica", 13 , "emitir som" , "sube em árvores");
	
	System.out.printf(cachorro.getNome());
	System.out.println(cachorro.getIdade());
	System.out.println(cachorro.getSom());
	System.out.println(cachorro.getCarac());

	
	System.out.println(cavalo.getNome());
	System.out.println(cavalo.getIdade());
	System.out.println(cavalo.getSom());
	System.out.println(cavalo.getCarac());
	
	System.out.println(preguica.getNome());
	System.out.println(preguica.getIdade());
	System.out.println(preguica.getSom());
	System.out.println(preguica.getCarac());

	}
}	
