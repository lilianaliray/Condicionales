/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
import java.lang.Math;
/**
 *
 * @author LAB04
 */
public class SwichNotas 
{
    public static void main(String[]args)
    
   {
     float nota =Float.parseFloat(JOptionPane.showInputDialog(args));
     switch(Math.round(nota))
     {
         case 7:// caso 1 - si el valor es 7
              JOptionPane.showMessageDialog(null, "Notable");
         break;
          case 6:// caso 2 - si el valor es 6
              JOptionPane.showMessageDialog(null, "bien");
         break; 
         case 5:// caso 3 - si el valor es 5
              JOptionPane.showMessageDialog(null, "suficiente");
         break; 
         case 4:// caso 4 - si el valor es 4
              JOptionPane.showMessageDialog(null, "insuficiente");
         break;
         default:
            JOptionPane.showMessageDialog(null, "insuficiente");
            break;
         
     }
   }
}
