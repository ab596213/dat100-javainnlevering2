package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for (int i : tabell) {
			System.out.print(i + ", ");
		}
		
		System.out.println("]");
		
//		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}
	

	// b)
	public static String tilStreng(int[] tabell) {

		 String s = "";
		 s += "[";
		 for (int i = 0; i < tabell.length; i++){
		 int j = tabell[i];
		 String app = Integer.toString(j);
		
		 if (i < (tabell.length-1))
		 s += app + ",";
		 
		 else
		 s += app;
		 
		}
		 
		s += "]";
		return s;
		
	//	throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}
	

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];

		}
		return sum;
	
	
	
//while lokke:	
	
//			int i = 0;
//			int sum = 0;
//		    while (i < tabell.length) {
//			   sum += tabell[i];
//			   i++;
//
//		   }
//		   return sum;
//
//		
//
	
	
//utvidet for lokke:
		
//		
//		    int sum = 0;
//		    for (int i : tabell) {
//			   sum += i;
//
//		   }
//		   return sum;
	
	
//		throw new UnsupportedOperationException("summer ikke implementert");
	}
	

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		for (int i = 0; i < tabell.length; i++){
          if (tabell[i] == tall){
            finnes = true;
		  }
		  else {}
		}
       return finnes;     
//		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int ellers = -1;
		for (int i = 0; i < tabell.length; i++){
		//  for (int i : tabell){
          if (tabell[i] == tall) {
            ellers = i;
		  }
		  else {}
		}
		return ellers;
		
//		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	
	// f)
	public static int[] reverser(int[] tabell) {
		
		int [] nytab = new int [tabell.length];
	 	 for (int i = 0; i < tabell.length; i++){

	 	 	nytab[i] = tabell[tabell.length-1-i];
		 }
	 	return nytab;
//	throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	
	// g)
	public static boolean erSortert(int[] tabell) {
		 int i = 1;
		 while (i < tabell.length){
		    if (tabell [i] < tabell[i-1]){
				 return false;
			 }
			i++;
		}
		return true;
		
//		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int lengde = tabell1.length+tabell2.length;
        int [] samlettab = new int [lengde];
        int pos = 0;
           for (int element : tabell1) {
        	   samlettab[pos] = element;
        	   pos++;
           }
		    for (int element : tabell2) {
		    	samlettab[pos] = element;
		    	pos++;
		    }
           
		    return samlettab;
//		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}

