/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakstatements;

/**
 *
 * @author FIONA KANYI
 */
public class BreakStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the for loop is labeled as fast
        // labelled break statement
        fast:
        for( int i = 1; i < 10; i++)  {
            sun:
            for(int j = 1; j < 9; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);
                if ( i == 10)
                    break fast;
    }
    
        }
         for (int  k= 11; k <= 21; ++k) {
            if (k > 12 && k < 18) {
                continue;
            }
            System.out.println(k);
        }
    }   
}
