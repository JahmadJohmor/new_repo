import java.lang.String;
import java.util.*;

public class T16 {

	public static void main(String[] args) {
	
		String eka = "Hepo";
		String toka = "Kisu";
		int tulos = eka.compareTo(toka);
		System.out.println(tulos);
		
		boolean onko = eka.contentEquals(toka);
		System.out.println(onko);
	}
}

