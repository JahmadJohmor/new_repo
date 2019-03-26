import java.lang.String;
import java.util.*;

public class T9 {

	public static void main(String[] args) {
	
		String eka="      Helsinki";
		int k, s=0;
		for(k = 0; k < eka.length(); k++){
		    if(eka.charAt(k) !=' ') break;
	        else s++;
	        System.out.println("tyhjiä on alussa " + s);
	        String puhdas = eka.substring(s, eka.length());
	        System.out.println(puhdas);
}
}
}