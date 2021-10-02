package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
        for (int [] i : matrise) {
        for (int j : i) {
        	System.out.print(j + " ");
        }
        System.out.println();
        }
//		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String s = "";
		for (int i = 0; i < matrise.length; i++) {
		for (int j = 0; j < matrise[i].length; j++) {
			int m = matrise [i][j];
			String app = Integer.toString(m);
			
			if (j == (matrise[i].length - 1))
			s += app + " " + "\n";
			
			else 
			s+= app + " ";
		}
		}
		return s;
		
//		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyint = new int[matrise.length][];
		for(int i = 0; i < matrise.length; i++){
			
		  nyint[i] = new int[matrise[i].length];
		  for (int j = 0; j < matrise[i].length; j++) {
		    nyint[i][j] = matrise[i][j]*tall;
		   
		  }
		}
		return nyint;
//		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean sjekk = true;
		 for (int i = 0; i < a.length -1; i++) {
			 for (int j = 0; j < a[i].length; j++) {
				 if (a[i][j] != b[i][j])
					 sjekk = false;
			 }
		 }
           return sjekk;
		
//		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		for (int i = 0; i< matrise.length; i++) {
			for (int j = 0; j < i; j++) {
				
				int temp = matrise[i][j];
				matrise [i][j] = matrise [j][i];
				matrise [j][i] = temp;
			}
		}
              return matrise;
	
//		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		if (a[0].length != b.length)
			return null;
		
        int [][] multi = new int [a.length][b[0].length];
			   
           for(int i = 0; i < a.length; i++){
		    for (int j = 0; j < b[0].length; j++) {
			 for (int k = 0; k < a[0].length; k++) {
					  
			    multi [i][j] += a [i][k] * b[k][j];
		 }
	   }
     }	
    
		return multi;
//		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
