package Herança;

public class TestePolimorfismo {

		public static void main (String args[])
		{
			Cachorro1 cacho = new Cachorro1();
			cacho.setNome("Cachorro");
			cacho.setLate("Late");
			
			CavaloSom cava = new CavaloSom();
			cava.setNome("Cavalo");
			cava.setRelincho("Relincho");
			
			PreguicaSom pre = new PreguicaSom();
			pre.setNome("Preguica");
			pre.setSom("Som");
			
			Testes1[] testes = new Testes1[3];
			testes[0]= cacho;
			testes[1]= cava;
			testes[2]= pre;
			
			for(Testes1 teste:testes)
			{
				System.out.println(teste.getNome());
			}
		}
}
