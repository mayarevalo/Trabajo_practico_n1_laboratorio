
package tp1laboratiodecomputacion;
import javax.swing.JOptionPane;
public class Ejercicio12 {
  /*
    Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no
  (siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número
   ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente.
    */
   
    public static void main(String[] args) {
       
         int dias;
        
         
         do{
            dias=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
            switch (dias) 
            {
             case 1: JOptionPane.showMessageDialog(null,"Lunes, LABORABLE");
                     break;
             case 2:  JOptionPane.showMessageDialog(null, "Martes LABORABLE");
                     break;
             case 3: JOptionPane.showMessageDialog(null,"Miercoles LABORABLE");
                      break;
             case 4:  JOptionPane.showMessageDialog(null, "Jueves LABORABLE");
                     break;
             case 5:  JOptionPane.showMessageDialog(null, "Viernes LABORABLE");
                     break;
             case 6:  JOptionPane.showMessageDialog(null, "Sabado NO LABORABLE");
                     break;
             case 7:  JOptionPane.showMessageDialog(null,"Domingo NO LABORABLE");
                     break;
             default:
                JOptionPane.showMessageDialog(null,"NUMERO INVALIDO, INTRODUZCA NUEVAMENTE UN NUMERO DEL 1 AL 7");
                    break;
            }
            }while(dias<1 || dias>7);
    
     }
}
        
        