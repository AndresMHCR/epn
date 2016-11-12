package epn;

public class Linea {
	private Punto pi;
	private Punto pf;
	
	
	public Linea() {
		pi = new Punto();
		pf = new Punto();
	
	}
	
	public Linea(Punto p1, Punto p2) {
		this.pi = p1;
		this.pf = p2;
	}

	public Punto getP1() {
		return pi;
	}

	public Punto getP2() {
		return pf;
	}

	public double longitud(){
		double dist= Math.sqrt(Math.pow(pf.getX()-pi.getX(),2)+Math.pow(pf.getY()-pi.getY(),2));
		return dist;
	}

	@Override
	public String toString() {
		return "Linea [pi=" + pi.toString() + ", pf=" + pf.toString() + "]";
	}
	

}
