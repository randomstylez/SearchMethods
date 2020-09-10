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
public class Exponentiation {
    
    static int count;
    
    public static void main(String[] args) 
    {
        long x = 2;
        int n = 63;
        count = 0;
        System.out.printf("%d ^ %d = %d\n",x,n, exponentiation(x,n));
        System.out.printf("Count = %d\n",count);
        int complexity = (int)Math.pow(2, (int)(Math.log(n)/Math.log(2))+1)-1;
        System.out.printf("Theoretical count = %d\n",complexity);
        System.out.printf("Approximate Upper Theoretical count = %d\n",2*n-1);
    }
    
    public static long exponentiation(long x, int n)
    {
        count++;
        if (n == 1) return x;
        else if (n%2==0) return exponentiation(x, n/2) * exponentiation(x, n/2);            
        return exponentiation(x, n/2) * exponentiation(x, n/2) * x;
    }
    
}
