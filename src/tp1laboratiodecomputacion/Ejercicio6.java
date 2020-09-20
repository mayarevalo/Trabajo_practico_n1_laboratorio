
package tp1laboratiodecomputacion;
import javax.swing.JOptionPane;

public class Ejercicio6 {
/*
*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
*el precio final con IVA. El IVA sera una constante que sera del 21%
 */
    public static void main(String[] args) {
        double numero1; 
        numero1= Double.parseDouble(JOptionPane.showInputDialog ("Ingresa el precio del prodctor SIN IVA"));
        JOptionPane.showMessageDialog(null, "El precio del producto CON IVA es: " + (numero1*1.21));
    }
    
}
