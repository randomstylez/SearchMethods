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
public class TernarySearch {

    public static void main(String[] args) 
    {
       int[] arr = {1,3,7,12,18,20,22,24};
       
       for(int i=arr[0]-1;i<=arr[arr.length-1]+1;i++)      
       System.out.printf("x = %d, index = %d\n",i,terSearch(arr, 0, arr.length-1, i));
       
    }
    
    public static int terSearch(int arr[], int l, int r, int x)
    {
         if (r >= l) {             
            int d1 = l + (r - l)/3;
            int d2 = d1 + (r - l)/3;
  
            if (arr[d1] == x)  return d1; 
            if (arr[d2] == x)  return d2; 
  
            if (x < arr[d1]) 
                return terSearch(arr, l, d1 - 1, x); 
            
            if (arr[d1]<x && x<arr[d2]) 
                return terSearch(arr, d1 + 1, d2 - 1, x); 
          
            return terSearch(arr, d2 + 1, r, x); 
        } 
  
        return -1; 
    }
    
}
