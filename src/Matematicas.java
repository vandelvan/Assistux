import javax.swing.JTextField;

public class Matematicas {
	String texto = "";
	int espacio = 0;

	Matematicas(String texto, int espacio){
		this.texto = texto;
		this.espacio = espacio;
	}
	
	//Metodo para realizar operaciones matematicas
			 JTextField matematicas(){
				JTextField inpt = new JTextField();
				if(texto.indexOf("+")!=-1) {	//Si encuentra un "+"
					if(texto.indexOf("0")!=-1||	/******************************************************/
					   texto.indexOf("1")!=-1||	/***********************SI*****************************/
					   texto.indexOf("2")!=-1||	/***************ENCUENTRA******************************/
					   texto.indexOf("3")!=-1||	/***************CUALQUIER******************************/
					   texto.indexOf("4")!=-1||	/********************NUMERO****************************/
					   texto.indexOf("5")!=-1||	/******************************************************/
					   texto.indexOf("6")!=-1||	/******************************************************/
					   texto.indexOf("7")!=-1||	/******************************************************/
					   texto.indexOf("8")!=-1||	/******************************************************/
					   texto.indexOf("9")!=-1) {
						inpt = suma(texto);		//va a la funcion "suma"
					}
				}else {							//si no encuentra un +, realiza el mismo procedimiento con los demas operadores
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
								}else {
									inpt.setText("Vuelva a intentarlo :c");	//si no tiene numeros ni es "algo", no entiende y devuelve "vuelva a intentarlo"
									inpt.setEditable(false);
									inpt.setBounds(10, espacio, 200, 20);
									espacio-=30;
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
				int pt1 = 0; //divide las partes de la operación
				for(int i = 0; i < texto.length(); i++) {	//busca en todo el string
					if(texto.charAt(i) >= '0' &&	// si encuentra un numero antes del operador
					   texto.charAt(i) <= '9' ){
						s1 += texto.charAt(i);	//lo suma al primer string
					}else {
						pt1 = i;
						break;
					}
				}
				for(int i = pt1; i < texto.length(); i++) { //recorre la segunda parte
					if(texto.charAt(i) >= '0' &&	// si encuentra un numero despues del operador
					   texto.charAt(i) <= '9' ){
							s2+=texto.charAt(i);	//lo suma al segundo string
						}
				}
				res = (Integer.parseInt(s1)+Integer.parseInt(s2));	//calcula su resultado
				inpt.setText(""+res);
				inpt.setEditable(false);	//crea el dialogo
				inpt.setBounds(10, espacio, 200, 20);
				espacio-=30;
				return inpt;	//lo regresa
			}//Fin funcion que suma
			
			//Funcion que resta
			JTextField resta(String texto) {
				JTextField inpt = new JTextField();
				String r1 = "";
				String r2 = "";
				int res = 0;
				int pt1 = 0;
				for(int i = 0; i < texto.length(); i++) {
					if(texto.charAt(i) >= '0' &&
					   texto.charAt(i) <= '9' ){
						r1 += texto.charAt(i);
					}else {
						pt1 = i;
						break;
					}
				}
				for(int i = pt1; i < texto.length(); i++) {
					if(texto.charAt(i) >= '0' &&
					   texto.charAt(i) <= '9' ){
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
						int pt1 = 0;
						for(int i = 0; i < texto.length(); i++) {
							if(texto.charAt(i) >= '0' &&
							   texto.charAt(i) <= '9' ){
								m1 += texto.charAt(i);
							}else {
								pt1 = i;
								break;
							}
						}
						for(int i = pt1; i < texto.length(); i++) {
							if(texto.charAt(i) >= '0' &&
							   texto.charAt(i) <= '9' ){
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
						int pt1 = 0;
						for(int i = 0; i < texto.length(); i++) {
							if(texto.charAt(i) >= '0' &&
							   texto.charAt(i) <= '9' ){
								d1 += texto.charAt(i);
							}else {
								pt1 = i;
								break;
							}
						}
						for(int i = pt1; i < texto.length(); i++) {
							if(texto.charAt(i) >= '0' &&
							   texto.charAt(i) <= '9' ){
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
				/*REGRESA EL ESPACIO*/
				int getEspacio() {
					return espacio;
				}
}
