package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Seires {
	
	private int espacio = 0;
	
	public Seires(int espacio) {
		this.espacio = espacio;
	}
	
	public void rSerie(){
		
		Random rand = new Random();

		int rSerie = rand.nextInt(10);
		
		if(rSerie == 1) 
		{
			serie1();
		}
		if(rSerie == 2) 
		{
			serie2();
		}
		if(rSerie == 3) 
		{
			serie3();
		}
		if(rSerie == 4) 
		{
			serie4();
		}
		if(rSerie == 5) 
		{
			serie5();
		}
		if(rSerie == 6) 
		{
			serie6();
		}
		if(rSerie == 7) 
		{
			serie7();
		}
		if(rSerie == 8) 
		{
			serie8();
		}
		if(rSerie == 9) 
		{
			serie9();
		}
		if(rSerie == 10) 
		{
			serie10();
		}
		
		
	}
	
	
	public void serie1() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Creo que se llama 'Game of Thrones'");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 250, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Casi nadie la conoce.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("He oido de esta serie.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void serie2() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("En paz descanse");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("'DAREDEVIL'");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Siempre puedes ver la cancelada");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void serie3() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Watchmen, deberías verla.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Pronto se estrenara");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void serie4() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Rick and Morty");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Si es de mas 200 deberías ver");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Cuanto es tu IQ?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void serie5() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("'Black Mirror' así que debe ser buena");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Mi prima salio en un episodio de");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 250, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void serie6() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("'Gotham' creo que se llamaba");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Hace poco vi una muy buena");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void serie7() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("me encanta 'Doctor Who'");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Pues en lo personal a mi,");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void serie8() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("'The office', esta buena.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("He estado viendo");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void serie9() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("'The big bang theory'");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Bazinga¡");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 30);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void serie10() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Esa serie nunca se vuelve vieja");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 30);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Siempre tuve algo con 'bob esponja'");
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
