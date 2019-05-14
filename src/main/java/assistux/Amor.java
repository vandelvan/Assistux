package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Amor {

private int espacio = 0;
	
	public Amor(int espacio) {
		this.espacio = espacio;
	}
	
	
public void MeAma() {
		
	Random rand = new Random();

	int pAmor = rand.nextInt(5);
		
		
		if(pAmor == 0) 
		{
			tAmor0();
		}
		if(pAmor == 1) 
		{
			tAmor1();
		}
		if(pAmor == 2) 
		{
			tAmor2();
		}
		if(pAmor == 3) 
		{
			tAmor3();
		}
		if(pAmor == 4) 
		{
			tAmor4();
		}
		if(pAmor == 5) 
		{
			tAmor5();
		}
	
}
public void tAmor0() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Oh, espera, no puedes :(");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Ven, abrazame¡");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void tAmor1() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Como un amigo");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("La verdad es que yo te veo mas");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void tAmor2() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Yo soy una IA y tu un humano :(");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Yo igual, pero esto no se puede.");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}
public void tAmor3() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("esta relación de manera profesional");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("La verdad es que yo veo");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}
public void tAmor4() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("amor está prohibido.");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Oh Romeo, lo siento pero nuestro");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void tAmor5() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("creo que ese tipo de relaciones no funciona");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Has visto la pelicula de 'Ella'?");
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
