package epn;


public class Circulo extends Figura{
	private Punto centro;
	private double radio;
	
	public Circulo() {
		this.centro = new Punto();
		this.radio = 1;
	}
	
	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calculoArea() {
		double area=0;
		
		area=Math.PI*radio*radio;
		return area;
	}
	@Override
	public double perimetro() {

		double per=0;
			per=2*Math.PI*radio;
			
		return per;
	}
	@Override
	public String toString() {
		return "Circulo [" + centro + ", radio=" + radio + "]";
	}
	

}
