package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Juegos {

	private int espacio = 0;
	
	public Juegos(int espacio) {
		this.espacio = espacio;
	}
	
	public void steam(){
		
		Random rand = new Random();

		int steamBot = rand.nextInt(10);
		
		if(steamBot == 0) 
		{
			juego0();
		}
		
		if(steamBot == 1) 
		{
			juego1();
		}
		if(steamBot == 2) 
		{
			juego2();
		}
		if(steamBot == 3) 
		{
			juego3();
		}
		if(steamBot == 4) 
		{
			juego4();
		}
		if(steamBot == 5) 
		{
			juego5();
		}
		if(steamBot == 6) 
		{
			juego6();
		}
		if(steamBot == 7 ) 
		{
			juego7();
		}
		if(steamBot == 8) 
		{
			juego8();
		}
		if(steamBot == 9) 
		{
			juego9();
		}
		if(steamBot == 10) 
		{
			juego10();
		}
		
	}

	public void juego0() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Es gratis");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("The sims");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego1() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Es gratis y muy bueno");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Pues team fortress 2");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego2() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Para perder amistades");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Muy bueno!...");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Mario kart es bueno");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void juego3() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("En lo personal admiro mucho a GLaDOS");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 270, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Los juegos de Portal son muy buenos");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 270, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego4() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Es tranquilo pero muy entretenido");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Life is strange");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego5() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Y acaba de ser su 10 aniversario");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Minecraft nunca falla en sorprenderme");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 250, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego6() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Dale una oportunidad");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("La saga Bioshock es preciosa");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego7() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Pero lo puedo soportar por jugarlos");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 270, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Los dos Outlast nunca me dejan dormir");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 270, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego8() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("entretenido si lo juegas con amigos");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 250, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Heroes and General es muy");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego9() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Half Life es hermoso");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Juega un clasico, o mejor dos.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void juego10() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Juega Fortnite entonces");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("No te parece?");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Que tal el juego de la Oca?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	
	public int getEspacio() {
		return espacio;
	}
	
}
