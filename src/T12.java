import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class bits extends Frame implements ActionListener{
	TextField luku,n;
	Label a,b,c;
	Button nappi,lopeta;
	public bits() {
		Panel paneli1= new Panel();
		paneli1.setBackground(new Color(200,200,18));
		this.add(paneli1);
		paneli1.add(a=new Label("Anna numeroarvo!"));
		paneli1.add(luku = new TextField(3));
		paneli1.add(b = new Label ("Monesko bitti?"));
		paneli1.add(n = new TextField(2));
		paneli1.add(nappi = new Button ("Tila"));
		paneli1.add(c = new Label ("Lopeta"));
		paneli1.add(lopeta = new Button("Lopeta"));
		nappi.addActionListener(this);
		lopeta.addActionListener(this);
		show();
		resize(300,100);
	}
	public void actionPerformed (ActionEvent e) {
		if (e.getActionCommand()=="Tila");
		{
			String teksti = luku.getText();
			int nro = Integer.parseInt(teksti);
			String nn = n.getText();
			int paikka = Integer.parseInt(nn);
			String bitit = Integer.toBinaryString(nro);
			b.setText("Bitit: "+bitit);
			int paalla=(nro>>paikka)&1;
			c.setText("Tila: "+ paalla);
		}
		if (e.getActionCommand()== "Lopeta") {
			System.exit(0);
		}
	}
}
public class T12 {

	public static void main(String[] args) {
		new bits();

	}

}