
package tp1laboratiodecomputacion;
import javax.swing.JOptionPane;
public class Ejercicio11 {

    /**
 Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te
pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la contraseña y mostrara un 
* mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de
salida (3 intentos y si acierta sale, aunque le queden intentos).
     * @param args
 */
      
    public static void main(String[] args) {
       double contraseña = 366388;
       double  ingreso;
       int i=0;
       ingreso= Double.parseDouble(JOptionPane.showInputDialog ("INGRESE LA CONTRASEÑA: ")); 
        
     if (ingreso == contraseña) {
         JOptionPane.showMessageDialog(null,"CONTRASEÑA CORRECTA, ¡BIENVENID@!");
         
    }else {
         while(i<3){
        
          i++;
          ingreso= Double.parseDouble(JOptionPane.showInputDialog ("ERROR, VUELVA A INTENTAR: "));
          
          if (ingreso == contraseña) {
          JOptionPane.showInputDialog ("CONTRASEÑA CORRECTA, ¡BIENVENID@!");
          
          break;
         }
          if(i>=3){
         JOptionPane.showMessageDialog (null,"USUARIO BLOQUEADO");
         
     }
        
         }
        
    }
    
}
}