package ramon.entrega.spring.model;


public class Triangulo {
    private double base;
    private double altura;
    private double area;
    private double perimetro;
    
    public Triangulo(double b, double a){
        base = b;
        altura = a;
        
        realizarCalculos();
    }
    
    private void realizarCalculos() {
		area = (base * altura) / 2;
		perimetro = base * 3;
	}

	public double getArea(){
        return area;
    }
    
    public double getPerimetro(){
        return perimetro;
    }

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
    
	
    
    
}
