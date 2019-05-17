package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Vida {

private int espacio = 0;
	
	public Vida(int espacio) {
		this.espacio = espacio;
	}
	
	public void rVida(){
		
		Random rand = new Random();

		int rVida = rand.nextInt(2);
		
		if(rVida == 1) 
		{
			peli0();
		}
		if(rVida == 0) 
		{
			peli0();
		}
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
	public void peli0() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("No se nada sobre la vida realmente.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Pues yo al ser solo una maquina");
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
