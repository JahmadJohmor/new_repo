import java.io.*;
import java.util.Vector;
import java.util.Date;

public class T15 {

	public static void main(String[] args) {
	
		boolean accepted;
        String email = "testiemail@raseko.fi";
        if (email.length() <= 6) {
            accepted = false;
            System.out.println("vajaa");
            System.exit(0);
        }
        int isAt = 0;

            for (int k = 0; k < email.length(); k++) {
                if (email.charAt(k) == '@') {
                    isAt = 1;
                    break;
                }
            }
        if(isAt==0) {
                accepted = false;
                System.out.println("Ei miukua");
                System.exit(0);
        }

        int isPoint=0;
            for(int k=0; k < email.length(); k++) {
                if(email.charAt(k)=='.') {
                    isPoint=1; break;
                }
            }
        if(isPoint==0) {
                accepted = false;
                System.out.println("ei pistettä");
                System.exit(0);
        }
            Vector heads = new Vector();
            heads.addElement("com");
            heads.addElement("net");
        heads.addElement("org");
        heads.addElement("edu");
        heads.addElement("fi");
        heads.addElement("de");
        heads.addElement("se");
        heads.addElement("no");

        int point= email.lastIndexOf((int)'.');
        String country = email.substring(point +1, email.length());
        int isHead=0;
        if(country.length()==2 || country.length()==3)
            isHead=1;


        if(isHead==0) {
            accepted= false;
            System.out.println("maatunnus väärin");
        }
        int isOfficialhead=0;
        if(heads.contains(country))
            isOfficialhead=1;
        if(isOfficialhead==0) {
            accepted=false;
            System.out.println("maatunnus ei virallinen");
            System.exit(0);
        }
        int miuku= email.indexOf((int)'@');
        String front = email.substring(0, miuku);
        int isLeftChar=666;

        if(front.length()>0) {
            isLeftChar=1;
        }
        if(isLeftChar==0) {
            accepted=false;
            System.out.println("ei  merkkejä @ vasemmalla puolella");
            System.exit(0);
        }
        String back = email.substring(miuku+1, (int)email.lastIndexOf((int)'.'));
        int isRightChar=0;
        if(back.length()>0) {
            isRightChar=1;
        }
        if(isRightChar==0) {
            accepted=false;
            System.out.println("ei merkkejä @ oikealla puolella");
            System.exit(0);
        }
        System.out.println("Läpi");
}
}

