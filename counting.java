
public class counting {
	public static void sort(int[] a){
			int g = maior(a);
			g++;
	        int tamanho = a.length;
	         
	        int auxiliar[] = new int[g];
	         
	        
	        for(int i = 0; i < g; i++){
	            auxiliar[i] = 0;
	        }
	         
	        for(int i = 0; i < tamanho; i++){
	        	int aux = a[i];
	            auxiliar[aux]++;
	        }
	 
	        int soma = 0;                
	        for(int i = 1; i < g; i++){
	            int aux = auxiliar[i];
	            auxiliar[i] = soma;
	            soma += aux;
	        }       
	        int vetorOrdenado[] = new int[tamanho];
	        for(int i = 0; i < tamanho; i++){
	            vetorOrdenado[auxiliar[a[i]]] = a[i];
	            int aux = 0;
	            aux = a[i];
	            auxiliar[aux]++;
	        }
	         
	        for (int i = 0; i < tamanho; i++){
	            a[i] = vetorOrdenado[i];
	        }
	    }
	
		
	public static int maior(int vetor[]){
	
		int greater = vetor[0];
		for(int i = 1; i < 7; i++){
			if(greater < vetor[i]){
				greater = vetor[i];
			}
		}
		return greater;
		
		
	}
	
	public static void main(String args[]){
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
