package ramon.entrega.spring.model;

public class SumaNumeros {

	private double valor1;
	private double valor2;
	
	public SumaNumeros(double valor1, double valor2) {
		this.setValor1(valor1);
		this.setValor2(valor2);
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public double getResultado() {
		return this.getValor1() + this.getValor2();
	}
	
	
	
}
