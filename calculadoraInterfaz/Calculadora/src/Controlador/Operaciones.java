/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author sistemas
 */
public class Operaciones {
    public String Sumar(int num1, int num2){
        int resultado = num1 + num2;
        return resultado + ""; //---> tambien saca el int con un String vacio, por lo tanto retorna el Int
        //return String.valueOf(resultado); //--> convierte cualquier numero a String; int a String
    }
    
    public String Restar(int num1, int num2){
        int resultado = num1 - num2;
        return resultado + "";
    }
    
     public String Multiplicar(int num1, int num2){
        int resultado = num1 * num2;
        return resultado + "";
    }
     
     public String Divdir(float num1, float num2){
        float resultado=0;
        
        if(num1 == 0){
            JOptionPane.showMessageDialog(null, "Indeterminacion");
        }else{
        
            resultado = num1 / num2;
        }
        
        return resultado + "";
     } 
    
}
