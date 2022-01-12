
//New ContaCorrente
public class ContaCorrente extends Conta implements Tributavel { // na extens�o de uma classe herda-se os atributos e m�todos, mas n�o herda os contrutores.
	
	
	public ContaCorrente(int agencia, int numero) { //aproveitamento do construtor da classe m�e(mesma assinatura).
		super(agencia, numero);
	}
	
	@Override
		public boolean saca(double valor) {
			double valorASacar = valor + 0.2;
			return super.saca(valorASacar);
		}

	@Override
	public void deposita(double valor) {
		super.saldo += valor; // Se na classe m�e o saldo estiver como private n�o ser� poss�vel o acesso, para isso utiliz�-se o saldo como protected 
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
