import javax.swing.JTextField;

public class Texto {
	
	int espacio=500;
	
		/*Constructor*/
		Texto() {
		}
		
		/*Metodos*/
		JTextField getInput(String texto) {
			JTextField inpt = new JTextField();
			if(texto.equalsIgnoreCase("algo") == true) {
				inpt.setText("JAJAJAXD");
				 inpt.setBounds(0, espacio, 66, 15);
				 espacio-=20;
			}
			else {
				inpt.setText("Vuelva a intentarlo :c");
				 inpt.setBounds(0, espacio, 200, 15);
				 espacio-=20;
			}
			return inpt;
		}
}
