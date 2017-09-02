/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaseparar;

/**
 *
 * @author Camila
 */
public class PilaSeparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila cami;
        cami = new Pila();
        
        char[] cm= cami.leerCadena();
        
      //  for (int k = 0; k< cm.length ; k++){
      //      System.out.println(cm[k] + " ");
      //  }
      
     /* char[] letras = cami.separarCaracteres(cm);
      char[] esp = cami.separarCaracteresEspeciales(cm);
      char[] num = cami.separarNumeros(cm);
    
      for (int k = 0; k< num.length ; k++){
            System.out.println(num[k] + " ");
       }
    }*/
    
}}
