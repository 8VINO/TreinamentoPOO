
public abstract class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public abstract void sacar(double valor);
	public abstract void exibirDados();
	public abstract void depositar(double valor);
	public void verificarSaldo() {
		System.out.println("Saldo: "+saldo);
	}
}
