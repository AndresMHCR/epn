package epn;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		int opc = JOptionPane.showOptionDialog( null,"Seleccione opcion", "Figuras",JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE, null,  new Object[] { "Punto", "Circulo", "Cuadrilatero","Triangulo","Linea" }, 
				   "opcion 1");

		switch (opc){
		
		case 0:
			JOptionPane.showMessageDialog(null, "Punto");// Ingreso de un punto
			String cadena=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens = new StringTokenizer(cadena,"/");
			double x=Double.parseDouble(tokens.nextToken());
			double y=Double.parseDouble(tokens.nextToken());
			Punto punto = new Punto(x, y);
			System.out.println("Punto"+punto.toString());
			break;
			
		case 1:
			JOptionPane.showMessageDialog(null, "Circulo");// Ingreso de un circulo
			String cadena2=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del centro separadas por /", "CIRCULO", 2);
			StringTokenizer tokens2 = new StringTokenizer(cadena2,"/");
			double x2=Double.parseDouble(tokens2.nextToken());
			double y2=Double.parseDouble(tokens2.nextToken());
			Punto punto2 = new Punto(x2, y2);		
			double radio=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio", "CIRCULO", 2));
			Circulo circulo = new Circulo(punto2,radio);
			System.out.println(circulo.toString()+"\nArea: "+circulo.calculoArea()+"\nPerimetro= "+circulo.perimetro());
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Cuadrilatero");//Ingreso de un cuadrilatero
			String cadena3=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens3 = new StringTokenizer(cadena3,"/");
			double x3=Double.parseDouble(tokens3.nextToken());
			double y3=Double.parseDouble(tokens3.nextToken());
			String cadena4=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens4 = new StringTokenizer(cadena4,"/");
			double x4=Double.parseDouble(tokens4.nextToken());
			double y4=Double.parseDouble(tokens4.nextToken());
			String cadena5=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens5 = new StringTokenizer(cadena5,"/");
			double x5=Double.parseDouble(tokens5.nextToken());
			double y5=Double.parseDouble(tokens5.nextToken());
			String cadena6=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens6 = new StringTokenizer(cadena6,"/");
			double x6=Double.parseDouble(tokens6.nextToken());
			double y6=Double.parseDouble(tokens6.nextToken());
			Punto p3 = new Punto(x3, y3);
			Punto p4 = new Punto(x4, y4);
			Punto p5 = new Punto(x5, y5);
			Punto p6 = new Punto(x6, y6);
			Cuadrilatero cuadrilatero = new Cuadrilatero(p3,p4,p5,p6);
			cuadrilatero.clasificar();
			System.out.println(cuadrilatero.toString()+"\nArea: "+cuadrilatero.calculoArea()+"\nPerimetro= "+cuadrilatero.perimetro());
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "Triangulo");//Ingreso de un triangulo
			String cadena7=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens7 = new StringTokenizer(cadena7,"/");
			double x7=Double.parseDouble(tokens7.nextToken());
			double y7=Double.parseDouble(tokens7.nextToken());
			String cadena8=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens8 = new StringTokenizer(cadena8,"/");
			double x8=Double.parseDouble(tokens8.nextToken());
			double y8=Double.parseDouble(tokens8.nextToken());
			String cadena9=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens9 = new StringTokenizer(cadena9,"/");
			double x9=Double.parseDouble(tokens9.nextToken());
			double y9=Double.parseDouble(tokens9.nextToken());
			Punto p7 = new Punto(x7, y7);
			Punto p8 = new Punto(x8, y8);
			Punto p9 = new Punto(x9, y9);
			Triangulo triangulo= new Triangulo(p7,p8,p9);
			triangulo.clasificar();
			System.out.println(triangulo.toString()+"\nArea: "+triangulo.calculoArea()+"\nPerimetro= "+triangulo.perimetro());
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Linea");//Ingreso de una linea
			String cadena10=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens10 = new StringTokenizer(cadena10,"/");
			double x10=Double.parseDouble(tokens10.nextToken());
			double y10=Double.parseDouble(tokens10.nextToken());
			String cadena11=JOptionPane.showInputDialog(null, "Ingrese las cordenadas del punto separadas por /","PUNTO", 2);
			StringTokenizer tokens11 = new StringTokenizer(cadena11,"/");
			double x11=Double.parseDouble(tokens11.nextToken());
			double y11=Double.parseDouble(tokens11.nextToken());
			Punto p10 = new Punto(x10, y10);
			Punto p11 = new Punto(x11, y11);			
			Linea linea = new Linea(p10,p11);
			System.out.println(linea.toString()+"\n Longitud= "+linea.longitud());
			break;
		}
		
		
	}

}
