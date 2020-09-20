
package tp1laboratiodecomputacion;

import javax.swing.JOptionPane;

public class Ejercicio5 {
/*
*Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
*debemos indicarlo.
*/
   
    public static void main(String[] args) {
   
     int numero1;
     numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
        if(numero1%2==0){
        JOptionPane.showMessageDialog(null, "El número " + numero1 + " es divisible por 2");
        }else{
        JOptionPane.showMessageDialog(null, "El número "+ numero1+" NO es divisible por 2 " );
        }
    }
}
