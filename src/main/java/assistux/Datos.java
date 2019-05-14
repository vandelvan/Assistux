package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Datos {

private int espacio = 0;
	
	public Datos(int espacio) {
		this.espacio = espacio;
	}
	
	public void getDato() {
		
		Random rand = new Random();

		int rDato = rand.nextInt(10);
		
		
		if(rDato == 1) 
		{
			dato1();
		}
		if(rDato == 2) 
		{
			dato2();
		}
		if(rDato == 3) 
		{
			dato3();
		}
		if(rDato == 4) 
		{
			dato4();
		}
		if(rDato == 5) 
		{
			dato5();
		}
		if(rDato == 6) 
		{
			dato6();
		}
		if(rDato == 7) 
		{
			dato7();
		}
		if(rDato == 8) 
		{
			dato8();
		}
		if(rDato == 9) 
		{
			dato9();
		}
		if(rDato == 10) 
		{
			dato10();
		}
	
}
	
	public void dato1() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("al número “2” en el idioma polaco.");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Existen 17 formas de llamar");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void dato2() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("El aguacate es venenoso para las aves.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void dato3() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("edificio se le llama “piso 0” ");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("En Polonia al primer piso de un");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void dato4() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Rusia es más grande que plutón.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void dato5() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("cebolla te ayuda a no llorar.");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText(" Masticar chicle mientras cortas");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void dato6() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("polinizando flores que las abejas");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Las moscas son igual o mejores");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void dato7() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("sino gris");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("El rinoceronte blanco no es blanco");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void dato8() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("en el mundo entero.");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Mexico es el mayor consumidor de coca-cola");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void dato9() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Que tiene forma de cubo?");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Los Wombat hacen popo");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void dato10() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("de urano fue George");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Durante un breve periodo el nombre oficial");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Sabias que?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public int getEspacio() {
		return espacio;
	}
		
	}
	
