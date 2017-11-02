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
public class Condicionales 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       float numero1, numero2;
       
       numero1 =Float.parseFloat(JOptionPane.showInputDialog("ingrese un numero"));
       numero2 =Float.parseFloat(JOptionPane.showInputDialog("ingrese otro numero"));
       
        if (numero1 == numero2)//aqui va una condicion
        {
            // si la condicion se cumple se ejecuta este codigo
            JOptionPane.showMessageDialog(null, "son iguales");
            
        }
         else// si la condicion  no se cumple se ejecuta este codigo
        {
         JOptionPane.showMessageDialog(null, "son diferentes");
            if (numero1 > numero2)
            {
              JOptionPane.showMessageDialog(null, "numero"+numero1+"es mayor");
              
            }
            else
           {
        
           else
           
           JOptionPane.showMessageDialog(null, "numero"+numero2+"es mayor");
    }
        }
        
            
        }
    
}
