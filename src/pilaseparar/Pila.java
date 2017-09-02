/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaseparar;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Pila {

    
    
 public char[] leerCadena (){
    Scanner in=new Scanner(System.in);
    String palabra = in.nextLine();  
    return palabra.toCharArray();
 
 }
 
 public char[] separarNumeros(String texto){
     char[] arreglo = texto.toCharArray();
     char[] numeros = new char[50];
       for(int i=0; i < arreglo.length ; i++){
           char a = arreglo[i];
                 if (Character.isDigit(a)) {
                     numeros[i] = a;
                 }
       }              
     
     return numeros;
 
 }
 
  public char[] separarCaracteres(String texto){
      char[] arreglo = texto.toCharArray();
     char[] letras=new char[150];
       for(int i=0; i < arreglo.length ; i++){
           char a = arreglo[i];
                 if (Character.isLetter(a)) {
                     letras[i] = a;
                 }
       }              
     
     return letras;
 
 }
  
   public char[] separarCaracteresEspeciales(String texto){
     char[] arreglo = texto.toCharArray();
     char[] especiales = new char[150];
       for(int i=0; i < arreglo.length ; i++){
           char a = arreglo[i];
                 if (Character.isLetterOrDigit(a)==false) {
                     especiales[i] = a;
                 }
       }              
     
     return especiales;
 
 }
   
   public char[] dejarSinEspacios (char[] arr){
      char[] nuevo = new char[150];
      for(int j=0 ;j < arr.length; j++){
        if (arr[j]!= ' '){
          for(int k=0 ;k < nuevo.length; k++){
            nuevo[k]=arr[j];
          }
      }
      }  
       
       return nuevo;
   }
}
