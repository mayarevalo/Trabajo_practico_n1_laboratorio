
package tp1laboratiodecomputacion;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    //Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
   // multiplicación , división y módulo (resto de la división).
  
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int numero1;
     int numero2;
     numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor: "));
     
     numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo valor: "));
   
     JOptionPane.showMessageDialog(null, "La suma entre los numeros es: " + (numero1+numero2));
       JOptionPane.showMessageDialog(null, "La resta entre los numeros es: " + (numero1-numero2));
       JOptionPane.showMessageDialog(null, "La multiplicacion entre los numeros es: " + (numero1*numero2));
       JOptionPane.showMessageDialog(null, "La division entre los numeros es: " + (numero1/numero2));
       JOptionPane.showMessageDialog(null, "El resto de la division entre los numeros es: " + (numero1%numero2));
    }
    
}
