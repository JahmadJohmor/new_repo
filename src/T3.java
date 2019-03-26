import java.lang.String;
import java.util.*;

public class T3 {

	public static void main(String[] args) {
	
		String email = "kk@kkkk.fi";
		int k;
		int on = -1;
		char merkki = '@';
		for (k = 0; k<email.length();k++) {
		if (merkki == email.charAt(k)){
		on = k;
		break;
		}
		}
		if (on == -1) 
		System.out.println("Ei löytynyt");
		
		else 
			System.out.println("Löytyi kohdasta " + k);
		
	}
	}


