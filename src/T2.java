import java.lang.String;
import java.util.*;

public class T2 {

	public static void main(String[] args) {
	
		String eka = "Helsinki";
		System.out.println(eka);
		eka = eka.toUpperCase();
		System.out.println(eka);
		char teksti[] = {'a','b','c'};
		System.out.println(teksti);
		
		for(int k = 0; k<3;k++)
			teksti[k]=(char)((int)teksti[k] -32);
			
			System.out.println(teksti);
		
	}
	}


