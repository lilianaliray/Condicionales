/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author LAB04
 */
public class Calificaciones 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       float nota1, nota2, nota3, promedio;
       
       nota1 =Float.parseFloat(JOptionPane.showInputDialog("ingrese primera nota"));
       nota2 =Float.parseFloat(JOptionPane.showInputDialog("ingrese segunda nota"));
       nota3 =Float.parseFloat(JOptionPane.showInputDialog("ingrese tercera nota"));
       promedio= (nota1 + nota2 + nota3)/3;
       
      
          if (promedio > 4)
          {
    JOptionPane.showMessageDialog(null, "el promedio es mayor que 4");
    JOptionPane.showMessageDialog(null, "aprobado");
      }
          else
          {
            JOptionPane.showMessageDialog(null, "el promedio es menor que 4");
            JOptionPane.showMessageDialog(null, "usted reprobo");
          }
          
    
         
     }
    
        
    }
       
        
    

