
package tp1laboratiodecomputacion;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio2 {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String nombre= JOptionPane.showInputDialog("INGRESE NOMBRE");
        
               JOptionPane.showMessageDialog(null, "Bienvenida " + nombre);
    }
    
}
