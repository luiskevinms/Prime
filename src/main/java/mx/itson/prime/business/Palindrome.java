/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.prime.business;

/**
 *
 * @author janto
 */
public class Palindrome {
    
    public static boolean isPalindrome (String value){
        
        
        
        value = value.replaceAll("\\s", "");
        char[] letras = value.toCharArray();
        
        
        int counter = letras.length;
        for (char letra : letras){
         
            if (letra != letras[counter - 1]){
                return false;
            }
            counter--;
            if (counter < 0){
                return true;
            }
        }
        
        return true;
    }
}
