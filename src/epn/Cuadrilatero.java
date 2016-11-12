package epn;

import javax.swing.JOptionPane;

public class Cuadrilatero extends Figura{
	private Punto p1;
	private Punto p2;
	private Punto p3;
	private Punto p4;
	
	public Cuadrilatero() {
		p1 = new Punto();
		p2 = new Punto();
		p3 = new Punto();
		p4 = new Punto();
	}

	public Cuadrilatero(Punto p1, Punto p2, Punto p3, Punto p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
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

	public Punto getP4() {
		return p4;
	}

	public void setP4(Punto p4) {
		this.p4 = p4;
	}
	
	public void clasificar(){
		
		double di1 = Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));//distancia entre dos puntos
		double di2 = Math.sqrt(Math.pow(p4.getX()-p3.getX(),2)+Math.pow(p4.getY()-p3.getY(),2));
		double pend1= (p2.getY()-p1.getY())/(p2.getX()-p1.getX());   // pendiente entre 2 puntos
		double pend2= (p4.getY()-p3.getY())/(p4.getX()-p3.getX());
		double di3 = Math.sqrt(Math.pow(p3.getX()-p2.getX(),2)+Math.pow(p3.getY()-p2.getY(),2));
		double di4 = Math.sqrt(Math.pow(p4.getX()-p1.getX(),2)+Math.pow(p4.getY()-p1.getY(),2));
		double pend3= (p3.getY()-p2.getY())/(p3.getX()-p2.getX());
		double pend4= (p4.getY()-p1.getY())/(p4.getX()-p1.getX());
		
		
		if(pend1*pend3!=-1) //producto de pendientes perpendiculares =-1
		JOptionPane.showMessageDialog(null, "OTRO");
		
		if(di1==di2 && di2==di3 && di3==di4 && pend1==pend2 && pend1*pend3==-1)		
			JOptionPane.showMessageDialog(null, "CUADRADO");
		
		if((di1==di2 || di3==di4 && di1!=di3 && pend1==pend2) && pend1*pend3==-1)
			JOptionPane.showMessageDialog(null, "RECTANGULO");

		
	}
	
	@Override
	public double calculoArea() {
		double area=0;
		double pend1= (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
		double pend3= (p3.getY()-p2.getY())/(p3.getX()-p2.getX());
		if(pend1*pend3!=-1){
			System.out.println("El area correspone a otro cuadrilatero no especificado");
			return 0;
		}
		else{
			double di1 = Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));
			double di2 = Math.sqrt(Math.pow(p4.getX()-p1.getX(),2)+Math.pow(p4.getY()-p1.getY(),2));
			 area = di1*di2; 		
	}
			
		return area;
	}
	@Override
	public double perimetro() {
		double di1 = Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));
		double di2 = Math.sqrt(Math.pow(p4.getX()-p1.getX(),2)+Math.pow(p4.getY()-p1.getY(),2));
		double di3 = Math.sqrt(Math.pow(p3.getX()-p2.getX(),2)+Math.pow(p3.getY()-p2.getY(),2));
		double di4 = Math.sqrt(Math.pow(p4.getX()-p3.getX(),2)+Math.pow(p4.getY()-p3.getY(),2));
		 
		return di1+di2+di3+di4;
	}

	@Override
	public String toString() {
		return "Cuadrado [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4="
				+ p4 + "]";
	}

	
	
	



}
