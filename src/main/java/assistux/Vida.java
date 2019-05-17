package assistux;

import javax.swing.JTextField;

public class Vida {

private int espacio = 0;
	
	public Vida(int espacio) {
		this.espacio = espacio;
	}
	
	public void vida1() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("La vida es eso que pasa mientras haces otras cosas");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 300, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("John Lenon dijo una vez:");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	
	public int getEspacio() {
		return espacio;
	}
	
}
