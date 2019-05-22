package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Cancion {

	private int espacio = 0;
	
	public Cancion(int espacio) {
		this.espacio = espacio;
	}
	
	public void cualCancion(){
		
		Random rand = new Random();

		int rCancion = rand.nextInt(9);
		
		
		if(rCancion == 0) 
		{
			cancion0();
		}
		
		if(rCancion == 1) 
		{
			cancion1();
		}
		
		if(rCancion == 2) 
		{
			cancion2();
		}
		
		if(rCancion == 3) 
		{
			cancion3();
		}
		
		if(rCancion == 4) 
		{
			cancion4();
		}

		if(rCancion == 5) 
		{
			cancion5();
		}
		
		if(rCancion == 6) 
		{
			cancion6();
		}
		
		if(rCancion == 7) 
		{
			cancion7();
		}
		
		if(rCancion == 8) 
		{
			cancion8();
		}
		
		if(rCancion == 9) 
		{
			cancion9();
		}
		
	}
	
	public void cancion0() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Podrias escuchar 'Bitch Lasagna'");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Te gustan el rap?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	
	public void cancion1() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Me han dicho que es mejor que Ariana Chica");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 272, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Te recomiendo a Ariana Grande");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Te agrada el pop?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	
	public void cancion2() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Te podria agradar 'I Can't Get Enough'");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 250, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Si te agrada el pop");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	
	public void cancion3() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Es bastante buena");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Me han dicho que 'Idol' es buena");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Si te agrada el Kpop?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	
	public void cancion4() {
		espacio-=30;
		JTextField inpt3 = new JTextField();
		inpt3.setText("my favorite things de John Coltrane");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Deberias escuchar");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Te gusta el jazz?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	
	public void cancion5() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Es la mejor cancion del mundo");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("D E S P A C I T O");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("He escuchado que.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	
	public void cancion6() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("A mi me agrada 'Another one bites the dust'");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 275, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Te gusta el rock?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	
	public void cancion7() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("que 'I don't care' es bastante buena.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Pues he escuchado");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	
	public void cancion8() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("siempre me pone de buenas hehe");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("El OST de guardianes de la galaxia");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 220, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	
	public void cancion9() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("escuchar Beethoven");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Pues siempre puedes");
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
