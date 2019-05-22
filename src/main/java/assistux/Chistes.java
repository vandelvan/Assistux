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

		int nChistes = rand.nextInt(24);
		
		if(nChistes == 0) 
		{
			chiste0();
		}
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
		if(nChistes == 25) 
		{
			chiste25();
		}
	}
	
	
	public void chiste0() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Sus pantu-flash");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("¿Que se pone Flash cuando llega a casa?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	
	public void chiste1() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Y discrecion murio acribillado");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Fuego a discrecion");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("El sargento ordena:");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void chiste2() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Y el cojo le contesta: Pues ya ves.");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Que tal andas?");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Un ciego le pregunta a un cojo:?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void chiste3() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("que hacia llorar a las cebollas.");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("pero tan feo");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Era un cocinero tan feo");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void chiste4() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Leche concentrada.");	//no es un chiste
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Que hace una vaca meditando?");	//no es un chiste
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void chiste5() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("De un almohadazo!");
		inpt3.setEditable(false);
		inpt3.setBounds(10, espacio, 200, 20);
		espacio -=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("que invento la cama de piedra?");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 220, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Como murio el hombre");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void chiste6() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("que los que yo cuento.");
		inpt3.setEditable(false);
		inpt3.setBounds(10, espacio, 200, 20);
		espacio -=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("encuentras un mejor chiste");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Si te miras en un espejo");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
	}
	public void chiste7() {
		JTextField inpt4 = new JTextField();
		inpt4.setText("Responde el otro");
		inpt4.setEditable(false);	//crea el dialogo
		inpt4.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt3 = new JTextField();
		inpt3.setText("Comprala, comprala");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("La marea sube.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Un judio le dice a otro:");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
		Main.contentPane.add(inpt3);
		Main.contentPane.add(inpt4);
	}
	public void chiste8() {
		JTextField inpt1 = new JTextField();
		inpt1.setText("Porque estaba muerto.");
		inpt1.setEditable(false);	//crea el dialogo
		JTextField inpt = new JTextField();
		inpt1.setBounds(10, espacio, 200, 20);
		espacio-=30;
		inpt.setText("Porque se cayo el mono del arbol?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 220, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt1);	//lo coloca
	}
	public void chiste9() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("FIN.");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 40, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("era tan feo que todos murieron");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Erase una vez un percebe feo");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);	//lo coloca
		Main.contentPane.add(inpt3);	//lo coloca
	}
	public void chiste10() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("son geneticamente incompatibles.");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 240, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("no pasa nada");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt1 = new JTextField();
		inpt1.setText("una jirafa con un humano?");
		inpt1.setEditable(false);	//crea el dialogo
		inpt1.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Que pasa si cruzas");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt1);
		Main.contentPane.add(inpt2);	//lo coloca
		Main.contentPane.add(inpt3);	//lo coloca
	}
	public void chiste11() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("Pues, Broco Lee.");
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("vegetariano de Bruce Lee?");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Como se llama el primo");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);//lo coloca
		Main.contentPane.add(inpt3);
	}
	public void chiste12() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("por que es el hombre de acero.");	//
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("Pues oxidado");	//
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Como sacas a Superman del agua?");	//
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 250, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);	//lo coloca
		Main.contentPane.add(inpt3);	//lo coloca
	}
	public void chiste13() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("!Ojojojojojojo!.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;JTextField inpt = new JTextField();
		inpt.setText("Como se rie un ojo?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);	//lo coloca
	}
	public void chiste14() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Hacen Pi Pi.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Los matematicos no orinan.");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);//lo coloca
	}
	public void chiste15() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("QUARK");	//Ya da risa.
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Como le hace un pato subatomico?");	//Ya da risa.
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 220, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);//lo coloca
	}
	public void chiste16() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Nada.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 100, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Que le dice un pez a otro?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);//lo coloca
	}
	public void chiste17() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("De las ovejas feas");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("De donde viene la lana virgen?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void chiste18() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("- Si... mouse o menos.");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("-Eres un fanatico de la computacion?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 250, 20);
		espacio-=30;
		Main.contentPane.add(inpt2);	//lo coloca
		Main.contentPane.add(inpt);
	}
	public void chiste19() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("-Sere eza yo?");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("-Que se dijo una cereza al verse en un espejo?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 280, 20);
		espacio-=30;
		Main.contentPane.add(inpt);
		Main.contentPane.add(inpt2);	//lo coloca
		
	}
	public void chiste20() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("H-DIOS-O");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Cual es la formula quimica del agua bendita?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 280, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void chiste21() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Acido un placer");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Como se despiden dos quimicos?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 220, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void chiste22() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("Lo sodio.");	//10/10
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Tus chistes de quimica son muy malos.");	//10/10
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 250, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void chiste23() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("-No, yo estudio sentado");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("-Oye, tu estudias derecho?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void chiste24() {
		JTextField inpt2 = new JTextField();
		inpt2.setText("En algun lugar de la mancha");
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("-Donde pone cervantes el detergente?");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 240, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);
	}
	public void chiste25() {
		JTextField inpt3 = new JTextField();
		inpt3.setText("No mijo, es demasiado larga");	//
		inpt3.setEditable(false);	//crea el dialogo
		inpt3.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt2 = new JTextField();
		inpt2.setText("¿Puedo ir a una fiesta de 15 anios?");	//
		inpt2.setEditable(false);	//crea el dialogo
		inpt2.setBounds(10, espacio, 200, 20);
		espacio-=30;
		JTextField inpt = new JTextField();
		inpt.setText("Mama, mama");	//
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 250, 20);
		espacio-=30;
		Main.contentPane.add(inpt);	//lo coloca
		Main.contentPane.add(inpt2);	//lo coloca
		Main.contentPane.add(inpt3);	//lo coloca
	}
	
	public int getEspacio() {
		return espacio;
	}
		
		
}
