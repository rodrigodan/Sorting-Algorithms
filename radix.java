
import java.util.Scanner;
 
class radix
{
	 static void sort( int[] vetor)
	    {
	        int i, m = vetor[0];
	        int aux = 1; 
	        int n = vetor.length;
	        int[] b = new int[10];
	        
	        for (i = 1; i < n; i++)
	            if (vetor[i] > m)
	                m = vetor[i];
	        
	        while (m / aux > 0)
	        {
	            int[] balde = new int[10];
	 
	            for (i = 0; i < n; i++)
	                balde[(vetor[i] / aux) % 10]++;
	            for (i = 1; i < 10; i++)
	                balde[i] += balde[i - 1];
	            for (i = n - 1; i >= 0; i--)
	                b[--balde[(vetor[i] / aux) % 10]] = vetor[i];
	            for (i = 0; i < n; i++)
	                vetor[i] = b[i];
	            aux *= 10;        
	        }
	    }    
    
    public static void main(String[] args) 
    {

        
        int n;
     
        int vetor[] = {2,8,10,1,3,6,4};
        
    	System.out.println("Desordenado:\n");
		for(int i = 0 ; i < 7; i++){
			System.out.println(vetor[i]);
		}
		
		
		
		sort(vetor);
		System.out.println("\nordenado:\n");
		for(int i = 0 ; i < 7; i++){
			System.out.println(vetor[i]);
		}
                           
    }    
}