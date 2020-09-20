
package tp1laboratiodecomputacion;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio4 {
    /*
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
 * son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona
 * 
 */
 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int numero1;
         int numero2;
         
          numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor: "));
     
          numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo valor: "));
         if (numero1>numero2){
         JOptionPane.showMessageDialog(null, "El número mayor es: " + numero1);
         }else if(numero2>numero1){
         JOptionPane.showMessageDialog(null, "El número mayor es: " + numero2);
         }if(numero1==numero2){ 
             JOptionPane.showMessageDialog(null, "Los números son iguales "  );
         }   
    }  
}
