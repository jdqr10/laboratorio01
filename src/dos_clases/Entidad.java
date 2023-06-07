package dos_clases;

import javax.swing.JOptionPane;

public class Entidad {//Declaramos la clase publica "Entidad"
	
	private double ladoA;//En las lineas 7 y 8 declaramos dos variables privadas "ladoA, ladoB" tipo Double.
	private double ladoB;
	
	public void ingresarDatos() {//Creamos el metodo "ingresardatos()" el cual le solicita al usurio inresar los lados
		
		String cadena;//Declaramos variable local "cadena"
		
		cadena = JOptionPane.showInputDialog (null, "Ingrese la longitud del lado A: ");//Le solicitamos al usuario que ingrese el valor del lado a.
		ladoA = Double.parseDouble( cadena );//Le asignamos el valor a la variable "ladoA"
		
		cadena = JOptionPane.showInputDialog (null, "Ingrese la longitud del lado B: ");//Le solicitamos al usuario que ingrese el valor del lado b y se lo asignamos a la variable "ladoB"
		ladoB = Double.parseDouble( cadena );//Le asignamos el valor a la variable "ladoB"
	}//Este es el final del método "ingresarDatos()".
	
	public void calcularArea() {//Empezamos este metodo el cual se encarga de calcular el área utilizando los valores "ladoA" y "ladoB"
		
		double resultado;//Decalramos la vaariable "resultado" tipo double la cual almacenará el resultado del cálculo 
		resultado = ladoA * ladoB;//Realizamos el cálculo y le asignamos el resuktado en la varible "resultado"
		
		JOptionPane.showMessageDialog (null, "El resultadp es: " + resultado);//Imprimimos el resultado seguido de un mensaje
	}

}
