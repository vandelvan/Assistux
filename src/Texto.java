import javax.swing.JTextField;

public class Texto {
	
	int espacio=500;
	
		/*Constructor*/
		Texto() {
		}
		
		/*Metodos*/
		
		//Este metodo compara el texto ingresado por el usuario y regresa un dialogo
		JTextField getInput(String texto) {
			JTextField inpt = new JTextField();
			if(texto.equalsIgnoreCase("algo") == true) {
				inpt.setText("Qué gracioso xd");
				inpt.setEditable(false);
				 inpt.setBounds(0, espacio, 66, 15);
				 espacio-=20;
			}else {
				String txt = texto.replaceAll("\\D+","");
				if(txt!=""){
					inpt = matematicas(texto);
					}else {
						inpt.setText("Vuelva a intentarlo :c");
						inpt.setEditable(false);
						inpt.setBounds(0, espacio, 200, 15);
						espacio-=20;
					}
				}
			return inpt;
		} // fin metodo getInput
		
		//Metodo para realizar operaciones matematicas
		JTextField matematicas(String texto){
			JTextField inpt = new JTextField();
			if(texto.indexOf("+")!=-1) {
				if(texto.indexOf("0")!=-1||
				   texto.indexOf("1")!=-1||
				   texto.indexOf("2")!=-1||
				   texto.indexOf("3")!=-1||
				   texto.indexOf("4")!=-1||
				   texto.indexOf("5")!=-1||
				   texto.indexOf("6")!=-1||
				   texto.indexOf("7")!=-1||
				   texto.indexOf("8")!=-1||
				   texto.indexOf("9")!=-1) {
					System.out.print("mas");
				}
			}else {
				if(texto.indexOf("-")!=-1) {
					if(texto.indexOf("0")!=-1||
					   texto.indexOf("1")!=-1||
					   texto.indexOf("2")!=-1||
					   texto.indexOf("3")!=-1||
					   texto.indexOf("4")!=-1||
					   texto.indexOf("5")!=-1||
					   texto.indexOf("6")!=-1||
					   texto.indexOf("7")!=-1||
					   texto.indexOf("8")!=-1||
					   texto.indexOf("9")!=-1) {
						System.out.print("menos");
					}
				}else {
						if(texto.indexOf("*")!=-1) {
							if(texto.indexOf("0")!=-1||
							   texto.indexOf("1")!=-1||
							   texto.indexOf("2")!=-1||
							   texto.indexOf("3")!=-1||
							   texto.indexOf("4")!=-1||
							   texto.indexOf("5")!=-1||
							   texto.indexOf("6")!=-1||
							   texto.indexOf("7")!=-1||
							   texto.indexOf("8")!=-1||
							   texto.indexOf("9")!=-1) {
								System.out.print("por");
							}
						}else {
							if(texto.indexOf("/")!=-1) {
								if(texto.indexOf("0")!=-1||
								   texto.indexOf("1")!=-1||
								   texto.indexOf("2")!=-1||
								   texto.indexOf("3")!=-1||
								   texto.indexOf("4")!=-1||
								   texto.indexOf("5")!=-1||
								   texto.indexOf("6")!=-1||
								   texto.indexOf("7")!=-1||
								   texto.indexOf("8")!=-1||
								   texto.indexOf("9")!=-1) {
									System.out.print("division");
								}
							}
						}
					}
				}
			return inpt;
		}
}
