import java.lang.String;
import java.util.*;

public class T8 {

	public static void main(String[] args) {
	
		 String pvm = "281299";
         String paiva = pvm.substring(0, 2);
         String kuukausi = pvm.substring(2, 4);
         String vuosi = pvm.substring(4,6);

         int paivaluku = Integer.parseInt(paiva);
         int kuukausiluku = Integer.parseInt(kuukausi);
         int vuosiluku = Integer.parseInt(vuosi);

         if (paivaluku > 0 && paivaluku < 32 && kuukausiluku > 0 && kuukausiluku < 13 && vuosiluku > 70 && vuosiluku <= 99)
         {
             System.out.println(paivaluku);
             System.out.println(kuukausiluku);
             System.out.println(vuosiluku);
             System.out.println(paivaluku + "." + kuukausiluku + "." + vuosiluku);

         }
		
}
}