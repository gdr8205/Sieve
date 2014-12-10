/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sieve;

/**
 *
 * @author grichards
 */
public class Sieve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Start array
        boolean[] arrayX;
        
        arrayX = new boolean[501];
        
        // Init all of array to true
        for(int x= 0; x<=500; x++){
            arrayX[x] = true;
        }
        
        // Step 2
        for(int p= 2; p<23; p++){
            if (arrayX[p] == true) {          
                Sieve.test(p, arrayX);
            }
        }
        
        //Print Cases
        Sieve.results(arrayX);
    }
    
    public static void test(int p, boolean arrayX[]){
            if (arrayX[p] == true) {
                for(int q = p+1; q <= 500; q++){
                    if(q % p == 0) {
                        arrayX[q] = false;
                    }
                }
            }
    }
    
    public static void results (boolean arrayX[]) {
        for(int x= 2; x<=500; x++){
            if(arrayX[x] == true) {
              System.out.println(x + " true");  
            }
        }
    }
    
}
