import java.util.Arrays;

public class oppg_2 {
	
	
	static int[][] tabell =   {
			{1, 2, 3},
			{4, 7, 6},
			{10, 4, 6}
			
};


	public static void main(String[] args) {
		
	skrivUtv1(tabell);	
	
	
	System.out.println(tilStreng(tabell));

	}
	
	public static void skrivUtv1(int[][] matrise) {
		
		
		for(int i = 0; i < matrise.length; i++) {
			
			for(int j = 0; j < matrise[i].length; j++)
				System.out.print(matrise[i][j] + " ");
	}
	}
		
		public static String tilStreng(int[][] matrise) {
			
			return Arrays.deepToString(matrise);
			
		}

}

