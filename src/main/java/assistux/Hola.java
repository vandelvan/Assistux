package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Hola {
	
private int espacio = 0;
	
	public Hola(int espacio) {
		this.espacio = espacio;
	}
	
public void saludo() {
		
		Random rand = new Random();

		int rSaludo = rand.nextInt(8);
		
		if(rSaludo == 0) 
		{
			saludo0();
		}
		if(rSaludo == 1) 
		{
			saludo1();
		}

		if(rSaludo == 2) 
		{
			saludo2();
			
		}
		if(rSaludo == 3) 
		{
			saludo3();
		}
		if(rSaludo == 4) 
		{
			saludo4();
		}
		if(rSaludo == 5) 
		{
			saludo5();
		}
		if(rSaludo == 6) 
		{
			saludo6();
		}
		if(rSaludo == 7) 
		{
			saludo7();
		}
		if(rSaludo == 8) 
		{
			saludo8();
		}
		
		
		
	
}

public void saludo0() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("De ayudarte en lo que necesites.");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Hola, estoy feliz");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void saludo1() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Assistux");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Hey que tal, soy yo.");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void saludo2() {
	JTextField inpt = new JTextField();
	inpt.setText("Hola, mis creadores me llaman Asistux.");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 250, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo 
}

public void saludo3() {
	JTextField inpt3 = new JTextField();
	inpt3.setText("Que puedo hacer por ti?");
	inpt3.setEditable(false);	//crea el dialogo
	inpt3.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt2 = new JTextField();
	inpt2.setText("Tu asistente");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Hey, hola, soy yo.");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void saludo4() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Estoy para servirte");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Hoola.");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void saludo5() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Haha, es broma, hola.");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Error 404 var 'saludo' not found");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void saludo6() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("te la estas pasando bien ahi fuera.");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Que tal? Espero que ");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void saludo7() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Es mi primer dia en este trabajo sabes?");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Hooooooooola");
	inpt.setEditable(false);	//crea el dialogo
	inpt.setBounds(10, espacio, 200, 30);
	espacio-=30;
	Main.contentPane.add(inpt);	//lo coloca
	Main.contentPane.add(inpt2);
}

public void saludo8() {
	JTextField inpt2 = new JTextField();
	inpt2.setText("Soy Assistux.");
	inpt2.setEditable(false);	//crea el dialogo
	inpt2.setBounds(10, espacio, 200, 30);
	espacio-=30;
	JTextField inpt = new JTextField();
	inpt.setText("Encantado de conocerte.");
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
