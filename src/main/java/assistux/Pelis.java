package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Pelis {

	private int espacio = 0;
		
		public Pelis(int espacio) {
			this.espacio = espacio;
		}
	
		public void cualPeli(){
			
			Random rand = new Random();

			int rPeli = rand.nextInt(9);
			
//			int rPeli = 7;
			
			if(rPeli == 0) 
			{
				peli0();
			}
			
			if(rPeli == 1) 
			{
				peli1();
			}
			
			if(rPeli == 2) 
			{
				peli2();
			}
			
			if(rPeli == 3) 
			{
				peli3();
			}
			
			if(rPeli == 4) 
			{
				peli4();
			}

			if(rPeli == 5) 
			{
				peli5();
			}
			
			if(rPeli == 6) 
			{
				peli6();
			}
			
			if(rPeli == 7) 
			{
				peli7();
			}
			
			if(rPeli == 8) 
			{
				peli8();
			}
			
			if(rPeli == 9) 
			{
				peli9();
			}
			
		}
		
		public void peli0() {
			JTextField inpt2 = new JTextField();
			inpt2.setText("Te puedo recomendar 'Ella'");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 200, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta el romance?");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 200, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
		}
		
		public void peli1() {
			JTextField inpt2 = new JTextField();
			inpt2.setText("Te puedo recomendar 'Los otros'");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 200, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta el terror?");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 200, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
		}
		
		public void peli2() {
			JTextField inpt3 = new JTextField();
			inpt3.setText("Entonces deberías ver 'It follows'");
			inpt3.setEditable(false);	//crea el dialogo
			inpt3.setBounds(10, espacio, 220, 30);
			espacio-=30;
			JTextField inpt2 = new JTextField();
			inpt2.setText("No?");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 200, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta dormir?");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 200, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
			Main.contentPane.add(inpt3);
		}
		
		public void peli3() {
			JTextField inpt2 = new JTextField();
			inpt2.setText("Siempre puedes ver 'el cienpies humano'");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 280, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta el vomitar?");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 200, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
		}
		
		public void peli4() {
			JTextField inpt2 = new JTextField();
			inpt2.setText("Te puedo recomendar 'Alien 2'");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 210, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta la acción?");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 200, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
		}
		public void peli5() {
			JTextField inpt2 = new JTextField();
			inpt2.setText("Te puedo recomendar 'Ghost in the Shell'");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 250, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta la ciencia ficcion?");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 230, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
		}
		public void peli6() {
			JTextField inpt2 = new JTextField();
			inpt2.setText("Te puedo recomendar 'Ace ventura'");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 210, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta la comedia?");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 200, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
		}
		public void peli7() {
			JTextField inpt2 = new JTextField();
			inpt2.setText("Mi favorita del raton es 'El rey leon'");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 200, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta Disney?");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 200, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
		}
		public void peli8() {
			JTextField inpt3 = new JTextField();
			inpt3.setText("'La princesa mononoke'");
			inpt3.setEditable(false);	//crea el dialogo
			inpt3.setBounds(10, espacio, 210, 30);
			espacio-=30;
			JTextField inpt2 = new JTextField();
			inpt2.setText("Entonces no te puedes perder");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 210, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gusta Studio Ghibli");
			inpt.setEditable(false);	//crea el dialogo
			inpt.setBounds(10, espacio, 200, 30);
			espacio-=30;
			Main.contentPane.add(inpt);	//lo coloca
			Main.contentPane.add(inpt2);
			Main.contentPane.add(inpt3);
		}
		public void peli9() {
			JTextField inpt2 = new JTextField();
			inpt2.setText("A mi me encanta 'la naranja mecanica'");
			inpt2.setEditable(false);	//crea el dialogo
			inpt2.setBounds(10, espacio, 220, 30);
			espacio-=30;
			JTextField inpt = new JTextField();
			inpt.setText("Te gustan los dramas?");
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
