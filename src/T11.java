import java.lang.String;
import java.util.*;

public class T11 {

	public static void main(String[] args) {
	
		int Lukumaara=0;
		int Annettu_luku = 3455;

		do {
		    Annettu_luku=Annettu_luku/10;
		    Lukumaara= Lukumaara +1;
	    } while(Annettu_luku !=0);
		System.out.println("antamassasi luvussa on "+ Lukumaara + " nroa");
		
		
		
}
}
