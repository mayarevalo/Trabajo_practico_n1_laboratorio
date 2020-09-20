
package tp1laboratiodecomputacion;

import javax.swing.JOptionPane;


public class Ejercicio14 {
  /*
     Codifique un programa de consola en Java que permita realizar las siguientes acciones:
Generar un número aleatorio entre 0 y 100, Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
para lograrlo.
    */
  
    public static void main(String[] args) {
        int numerox = new Double(Math.random() * 100).intValue();
        int numero;
        int intentos=0;
        //System.out.println(numerox);
        do {            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
            if(numerox<numero){
               JOptionPane.showMessageDialog(null,"Numero ingreado alto, intente otra vez: ");   
                
            }else if(numerox>numero) {
                JOptionPane.showMessageDialog(null,"Numero ingreado bajo, intente otra vez: ");  
            }
            intentos++;
            
         
            
        } while (numerox!=numero);
        
          JOptionPane.showMessageDialog(null,"¡FELICITACIONES ADIVINASTE!");
          JOptionPane.showMessageDialog(null,"Número de intentos: "+intentos);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
