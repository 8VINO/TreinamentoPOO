
public abstract class ContaTransacional extends Conta {
	private double limite;
	
	public void verificaLimite() {
		System.out.println("Limite: "+limite);
	};
}
