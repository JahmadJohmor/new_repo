import java.lang.String;
import java.util.*;

public class T14 {

	public static void main(String[] args) {
	
		int sekunnit= 334455;
	    int tunnit = sekunnit / 3600;
	        int minuutit= (sekunnit % 3600) / 60;
	        int loppusekunnit = sekunnit % 60;

	        System.out.println(tunnit);
	        System.out.println(minuutit);
	        System.out.println(loppusekunnit);
}
}
