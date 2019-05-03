package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Chistes {
	private int espacio = 0;
	
	public Chistes(int espacio) {
		this.espacio = espacio;
	}
	
	public void mostrarChiste() {
		
		Random rand = new Random();

		int nChistes = rand.nextInt(25);
		
		if(nChistes == 1) 
		{
			chiste1();
		}
		if(nChistes == 2) 
		{
			chiste2();
		}
		if(nChistes == 3) 
		{
			chiste3();
		}
		if(nChistes == 4) 
		{
			chiste4();
		}
		if(nChistes == 5) 
		{
			chiste5();
		}
		if(nChistes == 6) 
		{
			chiste6();
		}
		if(nChistes == 7) 
		{
			chiste7();
		}
		if(nChistes == 8) 
		{
			chiste8();
		}
		if(nChistes == 9) 
		{
			chiste9();
		}
		if(nChistes == 10) 
		{
			chiste10();
		}
		if(nChistes == 11) 
		{
			chiste11();
		}
		if(nChistes == 12) 
		{
			chiste12();
		}
		if(nChistes == 13) 
		{
			chiste13();
		}
		if(nChistes == 14) 
		{
			chiste14();
		}
		if(nChistes == 15) 
		{
			chiste15();
		}
		if(nChistes == 16) 
		{
			chiste16();
		}
		if(nChistes == 17) 
		{
			chiste17();
		}
		if(nChistes == 18) 
		{
			chiste18();
		}
		if(nChistes == 19) 
		{
			chiste19();
		}
		if(nChistes == 20) 
		{
			chiste20();
		}
		if(nChistes == 21) 
		{
			chiste21();
		}
		if(nChistes == 22) 
		{
			chiste22();
		}
		if(nChistes == 23) 
		{
			chiste23();
		}
		if(nChistes == 24) 
		{
			chiste24();
		}
	}
	
	public void chiste1() {
		JTextField inpt = new JTextField();
		inpt.setText("El sargento ordena: Fuego a discreci�n, y discreci�n muri� acribillado");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste2() {
		JTextField inpt = new JTextField();
		inpt.setText("Un ciego le pregunta a un cojo: �Qu� tal andas? Y el cojo le contesta: Pues ya ves.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste3() {
		JTextField inpt = new JTextField();
		inpt.setText("Era un cocinero tan feo, pero tan feo, que hac�a llorar a las cebollas.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste4() {
		JTextField inpt = new JTextField();
		inpt.setText("Tony muere al final de Endgame");	//no es un chiste
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste5() {
		JTextField inpt = new JTextField();
		inpt.setText("Como muri� el hombre que invent� la cama de piedra? - de un almohadazo!");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste6() {
		JTextField inpt = new JTextField();
		inpt.setText("Si te miras en un espejo encuentras un mejor chiste que los que yo cuento.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste7() {
		JTextField inpt = new JTextField();
		inpt.setText("Un judio le dice a otro: la marea sube. Comprala, comprala responde el otro");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste8() {
		JTextField inpt = new JTextField();
		inpt.setText("�Porque se cay� el mono del �rbol?, porque estaba muerto.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste9() {
		JTextField inpt = new JTextField();
		inpt.setText("Erase una vez un percebe muy feo, era tan feo que todos murieron, fin.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste10() {
		JTextField inpt = new JTextField();
		inpt.setText("�Que pasa si cruzas una jirafa con un humano?, no pasa nada, porque los dos son gen�ticamente incompatibles.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste11() {
		JTextField inpt = new JTextField();
		inpt.setText("�C�mo se llama el primo vegetariano de Bruce Lee? Pues, Broco Lee.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste12() {
		JTextField inpt = new JTextField();
		inpt.setText("�C�mo se llama el primo vegetariano de Bruce Lee? Pues, Broco Lee.");	//repetido
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste13() {
		JTextField inpt = new JTextField();
		inpt.setText("�C�mo se r�e un ojo? !Ojojojojojojo!.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste14() {
		JTextField inpt = new JTextField();
		inpt.setText("Los matem�ticos no orinan, hacen Pi Pi.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste15() {
		JTextField inpt = new JTextField();
		inpt.setText("Eyaculador precoz busca mujer para... bueno, ya da igual..");	//no da risa
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste16() {
		JTextField inpt = new JTextField();
		inpt.setText("�Qu� le dice un pez a otro? Nada");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste17() {
		JTextField inpt = new JTextField();
		inpt.setText("�De d�nde viene la lana virgen?... De las ovejas feas");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste18() {
		JTextField inpt = new JTextField();
		inpt.setText("- Eres un fan�tico de la computaci�n, �cierto?.\r\n" + 
				"- Si... mouse o menos.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste19() {
		JTextField inpt = new JTextField();
		inpt.setText("�Qu� se dijo una cereza al verse en un espejo?\r\n" + 
				"\r\n" + 
				"�Sere eza yo?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste20() {
		JTextField inpt = new JTextField();
		inpt.setText("�Cu�l es la f�rmula qu�mica del agua bendita?\r\n" + 
				"H-DIOS-O");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste21() {
		JTextField inpt = new JTextField();
		inpt.setText("�C�mo se despiden dos qu�micos?\r\n" + 
				"�cido un placer.1");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste22() {
		JTextField inpt = new JTextField();
		inpt.setText("Tus chistes de qu�mica son muy malos. Lo sodio.");	//10/10
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste23() {
		JTextField inpt = new JTextField();
		inpt.setText("Oye, tu estudias derecho? No, yo estudio sentado");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void chiste24() {
		JTextField inpt = new JTextField();
		inpt.setText("-Donde pone cervantes el detergente?"
					+ "En alg�n lugar de la mancha");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	
	public int getEspacio() {
		return espacio;
	}
		
		
}
