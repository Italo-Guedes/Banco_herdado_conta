
public class CalculadorDeImposto { //pelo diagrama este bloco é o pós interface.
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;		
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
