import javax.swing.JTextField;

public class Texto {
	
		/*Constructor*/
		Texto() {
		}
		
		/*Metodos*/
		JTextField getInput(String texto) {
			JTextField inpt = new JTextField();
			if(texto.equalsIgnoreCase("algo") == true) {
				inpt.setText("JAJAJAXD");
				 inpt.setBounds(0, 500, 66, 15);
			}
			else {
				inpt.setText("Vuelva a intentarlo :c");
				 inpt.setBounds(0, 484, 200, 15);
			}
			return inpt;
		}
}
