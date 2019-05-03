package assistux;

import java.util.Random;

import javax.swing.JTextField;

public class Chistes {
	
	public JTextField mostrarChiste() {
		JTextField inpt =  new JTextField();
		
		Random rand = new Random();

		int nChistes = rand.nextInt(25);
		
		if(nChistes == 1) 
		{
			inpt = chiste1();
		}
		if(nChistes == 2) 
		{
			inpt = chiste2();
		}
		if(nChistes == 3) 
		{
			inpt = chiste3();
		}
		if(nChistes == 4) 
		{
			inpt = chiste4();
		}
		if(nChistes == 5) 
		{
			inpt = chiste5();
		}
		if(nChistes == 6) 
		{
			inpt = chiste6();
		}
		if(nChistes == 7) 
		{
			inpt = chiste7();
		}
		if(nChistes == 8) 
		{
			inpt = chiste8();
		}
		if(nChistes == 9) 
		{
			inpt = chiste9();
		}
		if(nChistes == 10) 
		{
			inpt = chiste10();
		}
		if(nChistes == 11) 
		{
			inpt = chiste11();
		}
		if(nChistes == 12) 
		{
			inpt = chiste12();
		}
		if(nChistes == 13) 
		{
			inpt = chiste13();
		}
		if(nChistes == 14) 
		{
			inpt = chiste14();
		}
		if(nChistes == 15) 
		{
			inpt = chiste15();
		}
		if(nChistes == 16) 
		{
			inpt = chiste16();
		}
		if(nChistes == 17) 
		{
			inpt = chiste17();
		}
		if(nChistes == 18) 
		{
			inpt = chiste18();
		}
		if(nChistes == 19) 
		{
			inpt = chiste19();
		}
		if(nChistes == 20) 
		{
			inpt = chiste20();
		}
		if(nChistes == 21) 
		{
			inpt = chiste21();
		}
		if(nChistes == 22) 
		{
			inpt = chiste22();
		}
		if(nChistes == 23) 
		{
			inpt = chiste23();
		}
		if(nChistes == 24) 
		{
			inpt = chiste24();
		}
		return inpt;
	}
	
	public JTextField chiste1() {
		JTextField inpt = new JTextField();
		inpt.setText("El sargento ordena: Fuego a discreción, y discreción murió acribillado");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste2() {
		JTextField inpt = new JTextField();
		inpt.setText("Un ciego le pregunta a un cojo: ¿Qué tal andas? Y el cojo le contesta: Pues ya ves.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste3() {
		JTextField inpt = new JTextField();
		inpt.setText("Era un cocinero tan feo, pero tan feo, que hacía llorar a las cebollas.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste4() {
		JTextField inpt = new JTextField();
		inpt.setText("Tony muere al final de Endgame");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste5() {
		JTextField inpt = new JTextField();
		inpt.setText("Como murió el hombre que inventó la cama de piedra? - de un almohadazo!");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste6() {
		JTextField inpt = new JTextField();
		inpt.setText("Si te miras en un espejo encuentras un mejor chiste que los que yo cuento.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste7() {
		JTextField inpt = new JTextField();
		inpt.setText("Un judio le dice a otro: la marea sube. Comprala, comprala responde el otro");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste8() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Porque se cayó el mono del árbol?, porque estaba muerto.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste9() {
		JTextField inpt = new JTextField();
		inpt.setText("Erase una vez un percebe muy feo, era tan feo que todos murieron, fin.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste10() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Que pasa si cruzas una jirafa con un humano?, no pasa nada, porque los dos son genéticamente incompatibles.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste11() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Cómo se llama el primo vegetariano de Bruce Lee? Pues, Broco Lee.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste12() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Cómo se llama el primo vegetariano de Bruce Lee? Pues, Broco Lee.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste13() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Cómo se ríe un ojo? !Ojojojojojojo!.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste14() {
		JTextField inpt = new JTextField();
		inpt.setText("Los matemáticos no orinan, hacen Pi Pi.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste15() {
		JTextField inpt = new JTextField();
		inpt.setText("Eyaculador precoz busca mujer para... bueno, ya da igual..");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste16() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Qué le dice un pez a otro? Nada");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste17() {
		JTextField inpt = new JTextField();
		inpt.setText("¿De dónde viene la lana virgen?... De las ovejas feas");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste18() {
		JTextField inpt = new JTextField();
		inpt.setText("- Eres un fanático de la computación, ¿cierto?.\r\n" + 
				"- Si... mouse o menos.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste19() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Qué se dijo una cereza al verse en un espejo?\r\n" + 
				"\r\n" + 
				"¿Sere eza yo?");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste20() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Cuál es la fórmula química del agua bendita?\r\n" + 
				"H-DIOS-O");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste21() {
		JTextField inpt = new JTextField();
		inpt.setText("¿Cómo se despiden dos químicos?\r\n" + 
				"Ácido un placer.1");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste22() {
		JTextField inpt = new JTextField();
		inpt.setText("Tus chistes de química son muy malos. Lo sodio.");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste23() {
		JTextField inpt = new JTextField();
		inpt.setText("Oye, tu estudias derecho? No, yo estudio sentado");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
	public JTextField chiste24() {
		JTextField inpt = new JTextField();
		inpt.setText("-Donde pone cervantes el detergente?"
					+ "En algún lugar de la mancha");
		inpt.setEditable(false);	//crea el dialogo
		Main.contentPane.add(inpt);	//lo coloca
		return inpt;
	}
		
		
}
