
package tp1laboratiodecomputacion;

import javax.swing.JOptionPane;



public class Ejercicio13 {
     /*
    Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
    solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
    entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e
     ir comprobando que si es divisible desde ese número hasta 1.
     NOTA: Si se introduce un número menor o igual que 1, directamente es no primo
    */
   
    public static void main(String[] args) {
        double numero;
        boolean primo=true;
        int contador = 2;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número, PARA SABER SI ES PRIMO: "));
             while ((primo) && (contador!=numero)){
                   if (numero % contador == 0)
                       primo = false;
                          contador++;
} 
             if (primo==true) {
        JOptionPane.showMessageDialog(null,"El número es PRIMO");
        
                     }else
                 JOptionPane.showMessageDialog(null,"El número NO es PRIMO");
        
    }
    
}
