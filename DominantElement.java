/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cop3530_assignment1;

/**
 *
 * @author Joey
 */


public class DominantElement {

    public static void main(String[] args) 
    {
        int[] array = {16, 17, 4, 3, 5, 2};
        dominantElement(array);
    }
    
    public static void dominantElement(int[] array)
    {
        int dominant = array[array.length-1];
        System.out.print(dominant+" ");
        
        for(int i=array.length-1;i>=0;i--)         
            if(dominant<array[i])
            {
                dominant = array[i];
                System.out.print(dominant+" ");
            }
         System.out.println();
    }
    
}
