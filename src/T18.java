import java.io.*;

public class T18 {

	public static void main(String[] args) {
	
		System.out.println();
		File f1 = new File("C:\\Users\\a253-18\\Desktop\\teskt.txt");
		
		System.out.println("Tiedoston pituus metodilla length()");
		
		
		
		long pituus = f1.length();
		System.out.println(pituus);
		
		System.out.println("Avataan teidosto, joka on kansio");
		File f2 = new File("apu1");
		
		System.out.println("Katsotaan, onko normaali tiedosto isFile()-metodilla");
		boolean onkoTiedosto = f2.isFile();
		System.out.println(onkoTiedosto);
		
		File f_new = new File("C:\\Users\\a253-18\\Downloads\\jaavajaava\\Hevonen");
		boolean luoHakemisto = f_new.mkdir();
		System.out.println(luoHakemisto);
		
		System.out.println("Otetaan tiedostolistaus kansiosta");
		// f2 on alikansio apu1
		String filelist[] = new String[2];
		filelist = f2.list();



		String absPath = f2.getAbsolutePath();
		System.out.println("Tulostetaan tiedostolistaus");
		System.out.println("PATH: " + absPath);
		for(int k = 0; k <= filelist.length; k++) {
			System.out.println(filelist[k]);
		}
	}
}

