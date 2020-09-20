
package tp1laboratiodecomputacion;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    /**lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
     **lo volverá a pedir (do while), después muestra ese número por consola*/
    
    public static void main(String[] args) {
       int numero;  
        do {            
             numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
             
        } while (numero<=0);
        
        JOptionPane.showMessageDialog(null, "El número : "+ numero+". Es mayor o igual a cero.");
    }
    
}
