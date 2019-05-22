package assistux;

import java.util.Random;
import javax.swing.JTextField;

public class Asistentes {

	private int espacio = 0;
	
	public Asistentes(int espacio) {
		this.espacio = espacio;
	}
	
public void asist() {
		
		Random rand = new Random();

		int pAsis = rand.nextInt(5);
			
			
			if(pAsis == 0) 
			{
				tAsis0();
			}
			if(pAsis == 1) 
			{
				tAsis1();
			}
			if(pAsis == 2) 
			{
				tAsis2();
			}
			if(pAsis == 3) 
			{
				tAsis3();
			}
			if(pAsis == 4) 
			{
				tAsis4();
			}
			if(pAsis == 5) 
			{
				tAsis5();
			}
	}
	
	
public void tAsis0() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Pero soy Assistux");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 20);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Gracias por el cumplido");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 20);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void tAsis1() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Soy Assistux, tu asistente");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 20);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Vaya, te has cofundido");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 20);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void tAsis2() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Me llamo Assistux");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 20);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Permiteme volver a presentarme");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 20);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}
public void tAsis3() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Soy software libre");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 220, 20);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Disculpa, yo soy Assistux");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 20);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}
public void tAsis4() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Assistux?");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 20);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Puedes llamarme");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 210, 20);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void tAsis5() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Te has confundido, mi nombre es Assistux");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 270, 20);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("¡Hola!");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 20);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}
public int getEspacio() {
	return espacio;
}

}
