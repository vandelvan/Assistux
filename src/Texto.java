import javax.swing.JTextField;

public class Texto {
	
	int espacio=480;
	
		/*Constructor*/
		Texto() {
		}
		
		/*Metodos*/
		
		//Este metodo compara el texto ingresado por el usuario y regresa un dialogo
		JTextField getInput(String texto) {
			JTextField inpt = new JTextField();
			if(texto.equalsIgnoreCase("algo")) {
				inpt.setText("Qué gracioso xd");
				inpt.setEditable(false);
				 inpt.setBounds(10, espacio, 200, 20);
				 espacio-=30;
			}else {
				String txt = texto.replaceAll("\\D+","");
				if(!txt.equals("")){
					inpt = matematicas(texto);
				}else {
						inpt.setText("Vuelva a intentarlo :c");
						inpt.setEditable(false);
						inpt.setBounds(10, espacio, 200, 20);
						espacio-=30;
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
					inpt = suma(texto);
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
						inpt = resta(texto);
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
								inpt = multi(texto);
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
									inpt = division(texto);
								}
							}
						}
					}
				}
			return inpt;
		} //Fin Matematicas
		
		/***********************
		 * 
		 * BLOQUE DE OPERACIONES
		 * 
		 ***********************/
		
		//Funcion que suma
		JTextField suma(String texto) {
			JTextField inpt = new JTextField();
			String s1 = "";
			String s2 = "";
			int res = 0;
			for(int i = 0; i < texto.length(); i++) {
				if(texto.charAt(i) == '0' ||
				   texto.charAt(i) == '1' ||
				   texto.charAt(i) == '2' ||
				   texto.charAt(i) == '3' ||
				   texto.charAt(i) == '4' ||
				   texto.charAt(i) == '5' ||
				   texto.charAt(i) == '6' ||
				   texto.charAt(i) == '7' ||
				   texto.charAt(i) == '8' ||
				   texto.charAt(i) == '9' &&
				   texto.charAt(i+1) == '+'
						) {
					s1 += texto.charAt(i);
				}
				if(texto.charAt(i) == '0' ||
				   texto.charAt(i) == '1' ||
				   texto.charAt(i) == '2' ||
				   texto.charAt(i) == '3' ||
				   texto.charAt(i) == '4' ||
				   texto.charAt(i) == '5' ||
				   texto.charAt(i) == '6' ||
				   texto.charAt(i) == '7' ||
				   texto.charAt(i) == '8' ||
				   texto.charAt(i) == '9' &&
				   texto.charAt(i-1) == '+'
						){
					s2+=texto.charAt(i);
				}
			}
			System.out.print(s1+" "+s2);
			res = (Integer.parseInt(s1)+Integer.parseInt(s2));
			inpt.setText(""+res);
			inpt.setEditable(false);
			inpt.setBounds(10, espacio, 200, 20);
			espacio-=30;
			return inpt;
		}//Fin funcion que suma
		
		//Funcion que resta
		JTextField resta(String texto) {
			JTextField inpt = new JTextField();
			String r1 = "";
			String r2 = "";
			int res = 0;
			for(int i = 0; i < texto.length(); i++) {
				if(texto.charAt(i) == '0' ||
				   texto.charAt(i) == '1' ||
				   texto.charAt(i) == '2' ||
				   texto.charAt(i) == '3' ||
				   texto.charAt(i) == '4' ||
				   texto.charAt(i) == '5' ||
				   texto.charAt(i) == '6' ||
				   texto.charAt(i) == '7' ||
				   texto.charAt(i) == '8' ||
				   texto.charAt(i) == '9' &&
				   texto.charAt(i+1) == '+'
						) {
					r1 += texto.charAt(i);
				}
				if(texto.charAt(i) == '0' ||
				   texto.charAt(i) == '1' ||
				   texto.charAt(i) == '2' ||
				   texto.charAt(i) == '3' ||
				   texto.charAt(i) == '4' ||
				   texto.charAt(i) == '5' ||
				   texto.charAt(i) == '6' ||
				   texto.charAt(i) == '7' ||
				   texto.charAt(i) == '8' ||
				   texto.charAt(i) == '9' &&
				   texto.charAt(i-1) == '+'
						){
					r2+=texto.charAt(i);
				}
			}
			res = (Integer.parseInt(r1)-Integer.parseInt(r2));
			inpt.setText(""+res);
			inpt.setEditable(false);
			inpt.setBounds(10, espacio, 200, 20);
			espacio-=30;
			return inpt;
		}//Fin funcion que resta
		
		//Funcion que multiplica
				JTextField multi(String texto) {
					JTextField inpt = new JTextField();
					String m1 = "";
					String m2 = "";
					int res = 0;
					for(int i = 0; i < texto.length(); i++) {
						if(texto.charAt(i) == '0' ||
						   texto.charAt(i) == '1' ||
						   texto.charAt(i) == '2' ||
						   texto.charAt(i) == '3' ||
						   texto.charAt(i) == '4' ||
						   texto.charAt(i) == '5' ||
						   texto.charAt(i) == '6' ||
						   texto.charAt(i) == '7' ||
						   texto.charAt(i) == '8' ||
						   texto.charAt(i) == '9' &&
						   texto.charAt(i+1) == '+'
								) {
							m1 += texto.charAt(i);
						}
						if(texto.charAt(i) == '0' ||
						   texto.charAt(i) == '1' ||
						   texto.charAt(i) == '2' ||
						   texto.charAt(i) == '3' ||
						   texto.charAt(i) == '4' ||
						   texto.charAt(i) == '5' ||
						   texto.charAt(i) == '6' ||
						   texto.charAt(i) == '7' ||
						   texto.charAt(i) == '8' ||
						   texto.charAt(i) == '9' &&
						   texto.charAt(i-1) == '+'
								){
							m2+=texto.charAt(i);
						}
					}
					res = (Integer.parseInt(m1)*Integer.parseInt(m2));
					inpt.setText(""+res);
					inpt.setEditable(false);
					inpt.setBounds(10, espacio, 200, 20);
					espacio-=30;
					return inpt;
				}//Fin funcion que multiplica
				
				//Funcion que divide
				JTextField division(String texto) {
					JTextField inpt = new JTextField();
					String d1 = "";
					String d2 = "";
					int res = 0;
					for(int i = 0; i < texto.length(); i++) {
						if(texto.charAt(i) == '0' ||
						   texto.charAt(i) == '1' ||
						   texto.charAt(i) == '2' ||
						   texto.charAt(i) == '3' ||
						   texto.charAt(i) == '4' ||
						   texto.charAt(i) == '5' ||
						   texto.charAt(i) == '6' ||
						   texto.charAt(i) == '7' ||
						   texto.charAt(i) == '8' ||
						   texto.charAt(i) == '9' &&
						   texto.charAt(i+1) == '+'
								) {
							d1 += texto.charAt(i);
						}
						if(texto.charAt(i) == '0' ||
						   texto.charAt(i) == '1' ||
						   texto.charAt(i) == '2' ||
						   texto.charAt(i) == '3' ||
						   texto.charAt(i) == '4' ||
						   texto.charAt(i) == '5' ||
						   texto.charAt(i) == '6' ||
						   texto.charAt(i) == '7' ||
						   texto.charAt(i) == '8' ||
						   texto.charAt(i) == '9' &&
						   texto.charAt(i-1) == '+'
								){
							d2+=texto.charAt(i);
						}
					}
					res = (Integer.parseInt(d1)/Integer.parseInt(d2));
					inpt.setText(""+res);
					inpt.setEditable(false);
					inpt.setBounds(10, espacio, 200, 20);
					espacio-=30;
					return inpt;
				}//Fin funcion que divide
}
