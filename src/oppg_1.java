import java.util.Arrays;

public class oppg_1 {

	public static void main(String[] args) {
		
		
		int tab1[] = {42, 67, 89};
		
		int tab2[] = {3, 5, 12};
		
		skrivUt(tab1);
		
		finnesTall(tab1, 2);
		
		System.out.println(tilStreng(tab1));

		
		
		System.out.println(erSortert(tab1));
		
		
		
		System.out.println(tilStreng(tab1));
		
		
		
		System.out.println(summer(tab1));
		System.out.println(summerWhile(tab1));
		System.out.println(summerUtvidet(tab1));
		
		System.out.println(finnesTall(tab1, 2));
		
		System.out.println(posisjonTall(tab1, 67));
		
		System.out.println(erSortert(tab1));
		
		System.out.println(tab1.length);
		
		
		
		skrivUt(reverser(tab1));
		
		System.out.println(tab1.length);
		
		skrivUt(settSammen(tab1, tab2));
		
		
		
	}
		

	

	
	
	
	
	
	
	
	public static void skrivUt(int[] tab) {
		
		for(int i = 0; i<tab.length; i++) {
			System.out.print(tab[i]+ " ");
			
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	
		
		
	
	
	public static String tilStreng(int[] tabell) {
		
		return Arrays.toString(tabell);
	}
	
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int i = 0; i<tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
		
	}
	
	public static int summerWhile(int[] tabell) {
		int sum = 0;
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
			
			
		}
	
	public static int summerUtvidet(int [] tabell) {
		int sum = 0;
		for (int verdi : tabell) {
			sum += verdi;
		}
		return sum;
	}
	
	
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = true;
		
		for(int i = 0; i<tabell.length; i++) {
			if(tall != tabell[i]) {
				finnes = false;
			}
			
		}
		return finnes;
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		int x = -1;
		for(int i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				x = i;
			}
			
		}
		return x;
	}
	
	public static int[] reverser(int[] tabell) {
		
		int[] reversTabell = {};
		for(int i = tabell.length-1; i >= 0; i--) {
			System.out.print(tabell[i]+", ");
		}
		return reversTabell;
	}
	
	public static boolean erSortert(int[] tabell) {
		
		if(tabell == null) {
	        
	        return false;
	    }
	    else if(tabell.length == 0) {
	        return true;
	    }
	    
	    for (int i = 0; i < tabell.length-1; i++) {
	        if(tabell[i] > tabell[i+1]) {
	            return false;
	        }           
	    }
	    
	    return true;
		
		
	}
	
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int[] merge = new int[tabell1.length+tabell2.length];
		int c=0;
		for(int i = 0; i < tabell1.length;i++) {
			merge[i]=tabell1[i];
			c++;
			
		}
		for(int j = 0; j < tabell2.length; j++) {
			merge[c++]=tabell2[j];
		}
		
		return merge;
		
	}
}
