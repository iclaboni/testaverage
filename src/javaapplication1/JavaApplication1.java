/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author class
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TO DO: declare and initialize test scores as int.
       int testScore1=90 ;
       int testScore2 =100;
       int testScore3 = 85;
       int Total = testScore1 + testScore2 + testScore3 ;
        
    System.out.println("The score for test 1 is: " + testScore1);
    System.out.println("The score for test 2 is: " + testScore2);
    System.out.println("The score for test 3 is: " + testScore3);
            
    double average = Total/3.0  ; 
    
    System.out.println(" The average test score is: " + average);
    }
    
    
}