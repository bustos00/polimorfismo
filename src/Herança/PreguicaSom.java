package Herança;

public class PreguicaSom extends Testes1 {

		private String som;

		public String getSom() {
			return som;
		}

		public void setSom(String som) {
			this.som = som;
		}
		
		public String getNome()
		{
			return "Som do preguica: "+super.getNome()+" - som:  "+this.getSom();
		}
}
