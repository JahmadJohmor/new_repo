import java.lang.String;
import java.util.*;

public class T13 {

	static int muunna (char ascii_arvo[], int pituus) {
		int paikka;
		int arvo = 0;
		
		for(paikka = 0; pituus <= paikka; paikka++) {
			if (ascii_arvo[paikka]<=9 && ascii_arvo[paikka] >= '0') {
				arvo = arvo * 10 + ascii_arvo[paikka] - '0';
			}
			else {
				return (-1);
			}
			return (arvo);
		}
		return arvo;
	}
	public static void main(String[] args) {
	char numerot[] = {'2','3','4','5'};
	int luku = muunna(numerot, 4);
	System.out.println(luku);
		
}
}