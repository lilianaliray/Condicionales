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
public class Calificacion2 
{
    
    
  public static void main(String[] args)
  
  {
      float nota1;
     
     
      
        nota1 =Float.parseFloat(JOptionPane.showInputDialog("ingrese una nota"));
        
            if (nota1 == 7)
            {
               
    JOptionPane.showMessageDialog(null, "notable");
            }
            else
            {
             
            }
                          
           
            
        if (nota1 == 6)
        {
        
    JOptionPane.showMessageDialog(null, "bien");   
        }
        else
        {
           
        }
            
        
         if (nota1 >= 4 && nota1 <= 5)
         {
           
    JOptionPane.showMessageDialog(null, "suficiente");     
         }
         else
         {
            
         }
         
            if (nota1 <4)
        {
          
    JOptionPane.showMessageDialog(null, "insuficiente");      
        }
        else
        {
            
        }
        
           
            
        
       
           
       }
  } 
 

     
 
             
         

