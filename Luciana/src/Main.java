import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		// Se puede utilizar la clase JOptionPane para generar una ventanade dialogo
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		JOptionPane.showMessageDialog(null, "Buen dia " + nombre);

		// También se puede utilizar el objeto Scanner para obtener información de la terminal
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero : ");
		System.out.println("Ud ingresó: " + sc.nextInt());
	}
	public class OperacionesApp {
		 
	    public static void main(String[] args) {
	 
	        //Declaramos las variables
	        int num1=10;
	        int num2=5;
	 
	        /*Realizamos las operaciones.
	         * Tambien lo podemos guardar el resultado en variables. */
	 
	        System.out.println("El resultado de la suma es "+(num1+num2));
	 
	        System.out.println("El resultado de la resta es "+(num1-num2));
	 
	        System.out.println("El resultado de la multiplicación es "+(num1*num2));
	 
	        System.out.println("El resultado de la división es "+(num1/num2));
	    }
	}


}