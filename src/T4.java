import java.lang.String;
import java.util.*;

public class T4 {

	public static void main(String[] args) {
	
		int a = 5;
	    int b = 6;
	    int c = a & b;
	    int d = a | b;

	    System.out.println("a on " + a);
	    System.out.println("b on " + b);
	    System.out.println("c on " + c);
	    System.out.println("d on " + d);

	    c = c >>2;
	    b = b<<1;
	    System.out.println("c on " + c);
	    System.out.println("b on " + b);
	    int e = a^2;

	    System.out.println("e on " + e);

	    int aa = 5;
	    int bb = 12;
	    aa=~aa;
	    bb=~bb;

	    System.out.println("aa on " +aa);
	    System.out.println("bb on " +bb);
		
	}
	}


