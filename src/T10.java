import java.lang.String;

public class T10 {

	public static void main(String[] args) {
	
		
		String pvm = "11021966"; 
		String pv = pvm.substring(0,2); 
		String kk = pvm.substring(2,4); 
		String vv = pvm.substring(4,8);
		int pvv = Integer.parseInt (pv); 
		int kkv =  Integer.parseInt(kk); 
		int vvv =  Integer.parseInt(vv); 
		String k = "";
		if (pvv > 0 && pvv < 32 && kkv > 0 && kkv < 13 && vvv < 2019) 
		switch (kkv) {
		case 1: k = "January"; break; 
		case 2: k = "February"; break; 
		case 3: k = "March"; break; 
		case 4: k = "April"; break; 
		case 5: k = "May"; break; 
		case 6: k = "October"; break; 
		case 7: k = "July"; break; 
		case 8: k = "August"; break; 
		}
		System.out.println("Date: " + pvv + "-" + k + "-" + vvv);
}
}