import java.lang.String;
import java.util.*;

public class T6 {

	public static int potenssi(int kanta, int ekspo) {
		if (ekspo == 0) {
			return 1;
		}
			int apu = 1, k;
			for (k = 1;k < ekspo; k++) {
				apu = apu * kanta;
				return apu;
			}
			return k;
		
	}
	public static void main(String[] args) {
	String luku = "23";
	int pituus = luku.length();
	int lukuna = 0;
	int k = 0;
	for (k = 0; k < pituus; k++) {
		lukuna = lukuna + (luku.charAt(k)-48)*potenssi(10,k);
		System.out.println(lukuna);
}
}
} 
//tulostaa 2 ja 5
