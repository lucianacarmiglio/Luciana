import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		// Se puede utilizar la clase JOptionPane para generar una ventanade dialogo
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		JOptionPane.showMessageDialog(null, "Buen dia " + nombre);
		String nombre1 = JOptionPane.showInputDialog("Su apellido: ");
		JOptionPane.showMessageDialog(null, "Buenas noches " + nombre1);
		// Tambi�n se puede utilizar el objeto Scanner para obtener informaci�n de la terminal
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la edad : ");
		System.out.println("Ud ingres�: " + sc.nextInt());
	}
	


}