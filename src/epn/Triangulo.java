package epn;

import javax.swing.JOptionPane;

public class Triangulo extends Figura{
	private Punto p1;
	private Punto p2;
	private Punto p3;
	private double h;
	
	public Triangulo() {
		p1= new Punto();
		p2=new Punto();
		p3=new Punto();
	}
	public Triangulo(Punto p1, Punto p2, Punto p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public Punto getP3() {
		return p3;
	}
	public void setP3(Punto p3) {
		this.p3 = p3;
	}
	
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public void clasificar()
	{
		double dist1= Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));
		double dist2= Math.sqrt(Math.pow(p3.getX()-p2.getX(),2)+Math.pow(p3.getY()-p2.getY(),2));
		double dist3= Math.sqrt(Math.pow(p3.getX()-p1.getX(),2)+Math.pow(p3.getY()-p1.getY(),2));
		
		if(dist1==dist2 && dist2==dist3){
			JOptionPane.showMessageDialog(null, "TRIANGULO EQUILATERO" );
			
			
		}
		if(dist1==dist2 || dist2==dist3 || dist1==dist3)	
			JOptionPane.showMessageDialog(null, "TRIANGULO ISOCELES" );
		
		else
		JOptionPane.showMessageDialog(null, "TRIANGULO ESCALENO" );
	}

	 @Override
	public double calculoArea() {// area calculada por formula geometrica
		 double area=((p1.getX()*(p3.getY()-p2.getY()))+(p2.getX()*(p1.getY()-p3.getY()))+(p3.getX()*(p2.getY()-p1.getY())))/2;
		return area;
	}
	@Override
	public double perimetro() {
		double dist1= Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));
		double dist2= Math.sqrt(Math.pow(p3.getX()-p2.getX(),2)+Math.pow(p3.getY()-p2.getY(),2));
		double dist3= Math.sqrt(Math.pow(p3.getX()-p1.getX(),2)+Math.pow(p3.getY()-p1.getY(),2));
		
		double perim= dist1+dist2+dist3;
		return perim;
	}
	
	@Override
	public String toString() {
		return "Triangulo [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
	}
	
	
	

}
