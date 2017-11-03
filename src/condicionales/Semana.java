/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;


/**
 *
 * @author LAB04
 */
public class Semana
{
    public static void main(String[]args) 
    {
        int semana =Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
     switch(Math.round(semana))
     {
    
         case 7:// caso 1 - si el valor es 7
              JOptionPane.showMessageDialog(null, "domingo");
         break;
          case 6:// caso 2 - si el valor es 6
              JOptionPane.showMessageDialog(null, "sabado");
         break; 
         case 5:// caso 3 - si el valor es 5
              JOptionPane.showMessageDialog(null, "viernes");
         break; 
         case 4:// caso 4 - si el valor es 4
              JOptionPane.showMessageDialog(null, "jueves");
         break;
            
            case 3:// caso 5 - si el valor es 3
              JOptionPane.showMessageDialog(null, "miercoles");
         break;
         case 2:// caso 6 - si el valor es 2
              JOptionPane.showMessageDialog(null, "martes");
         break;
         case 1:// caso 7 - si el valor es 1
          default:
              JOptionPane.showMessageDialog(null, "lunes");
         break;
            
            
    
 
                
                    
    }
      }



    
    
        
    }