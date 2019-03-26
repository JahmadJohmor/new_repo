import java.lang.String;
import java.util.*;

public class T7 {

	public static void main(String[] args) {
	
		int k;
		int parillisia = 0, parittomia = 0;
		
		for(k = 0; k<20; k++) {
			int luku = (int) (20 * Math.random());
					switch (luku % 2) {
					case 0: parillisia++;
					break;
					case 1: parittomia++;
					break;
		}
		}
		System.out.println(parillisia);
		System.out.println(parittomia);
		
}
}