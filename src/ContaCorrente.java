
//New ContaCorrente
public class ContaCorrente extends Conta implements Tributavel { // na extensão de uma classe herda-se os atributos e métodos, mas não herda os contrutores.
	
	
	public ContaCorrente(int agencia, int numero) { //aproveitamento do construtor da classe mãe(mesma assinatura).
		super(agencia, numero);
	}
	
	@Override
		public boolean saca(double valor) {
			double valorASacar = valor + 0.2;
			return super.saca(valorASacar);
		}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; // Se na classe mãe o saldo estiver como private não será possível o acesso, para isso utilizá-se o saldo como protected 
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
