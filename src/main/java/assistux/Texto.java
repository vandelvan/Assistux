package assistux;
import javax.swing.JTextField;

public class Texto {
	
	static int espacio=480;	//Toma el alto minimo disponible para colocar el texto sin sobreponerse
	
	
		/*Metodos*/
		
		//Este metodo compara el texto ingresado por el usuario y regresa un dialogo
		public static JTextField getInput(String texto){
			JTextField inpt = new JTextField();
			if(texto.equalsIgnoreCase("algo")) {	//Si el texto es "algo" (literalmente)
				inpt.setText("Que gracioso xd");	//Respuesta ironica
				inpt.setEditable(false);			//No es editable por el usuario
				 inpt.setBounds(10, espacio, 200, 20);	//espacio es definido anteriormente para colocar los outputs en un alto que no se sobreponga
				 espacio-=30;	//disminuye el alto para el siguiente dialogo
			}else {
				if(variacionesCorreo(texto)) {	//Va a la funcion que compara las variaciones para enviar un correo
					Correo c = new Correo(espacio);
					c.colocarBotonEnvio();
					espacio = c.getEspacio();
				}else {
					if(variacionesBusqueda(texto)) {
						Busqueda.buscar(texto);
						inpt.setText("Aqui tiene los resultados");
						inpt.setEditable(false);
						inpt.setBounds(10, espacio, 200, 20);
						espacio-=30;
					}else {
						if(variacionesEvento(texto)) {
							Calendario cal = new Calendario(espacio);
							cal.colocarBotonEvento();
							espacio = cal.getEspacio();
						}else {
							
							if(vChistes(texto)){
								Chistes c = new Chistes(espacio);
								c.mostrarChiste();
								espacio = c.getEspacio();
								
							}else {
								if(vDatos(texto)){
									Datos d = new Datos(espacio);
									d.getDato();
									espacio = d.getEspacio();
								}
								else {
									if(vAmor(texto)){
										Amor a = new Amor(espacio);
										a.MeAma();
										espacio = a.getEspacio();
										}
									else {
										if(vHola(texto)){
											Hola h = new Hola(espacio);
											h.saludo();
											espacio = h.getEspacio();
											}
										else {
											String txt = texto.replaceAll("\\D+","");	//le quita las letras a la cadena para verificar si tiene numeros
											if(!txt.equals("")){	// si tiene numeros
												Matematicas m = new Matematicas(texto, espacio);
												inpt = m.matematicas();	//se manda al metodo para las operaciones matematicas
												inpt.setBounds(10, espacio, 150, 20);
												espacio-=30;
											}else {
													inpt.setText("Vuelva a intentarlo :c");	//si no tiene numeros ni es "algo", no entiende y devuelve "vuelva a intentarlo"
													inpt.setEditable(false);
													inpt.setBounds(10, espacio, 150, 20);
													espacio-=30;
											}
										}
									}	
								}
							}
						}
					}
				} 
			}
			return inpt;	//regresa el dialogo para colocarse
		} // fin metodo getInput
		
		/*METODOS PARA LAS VARIACIONES DE PALABRAS*/
		//Variaciones de correo
		public static boolean variacionesCorreo(String texto) {
			String[] vCorreo = {"enviar", "mandar", "remitir", "expedir", "emitir",
								"envia", "manda", "remite", "expide", "emite"};	//Arreglo de Strings con variaciones para pedir un envio de correo
			for(int i=0; i < vCorreo.length; i++) {
				if(texto.equalsIgnoreCase(vCorreo[i]+" correo")	   ||
				   texto.equalsIgnoreCase(vCorreo[i]+" un correo") ||
				   texto.equalsIgnoreCase(vCorreo[i]+" email") 	   ||
				   texto.equalsIgnoreCase(vCorreo[i]+" un email")  ||
				   texto.equalsIgnoreCase(vCorreo[i]+" mail") 	   ||
				   texto.equalsIgnoreCase(vCorreo[i]+" un mail")  ) {
						return true;
				}
			}
			return false;
		}//Fin variaciones de correo
		
		//variaciones para busqueda
		public static boolean variacionesBusqueda(String texto) {
			String[] vBuscar = {"busca", "investiga", "busqueda", "indaga",
								"buscar", "investigar", "indagar"};
			String[] textoSeparado = texto.split(" ");	//separa el String por palabras
			for(int i=0; i < vBuscar.length; i++) {
			if(textoSeparado[0].equalsIgnoreCase(vBuscar[i]))
						return true;	//si tiene cualquiera de las opciones de busqueda regresa verdadero
			}
			return false;
		}//fin variaciones para busqueda
		
		//variaciones de calendario/evento
		public static boolean variacionesEvento(String texto) {
			String[] vEvento = {"crear", "hacer", "agendar", "reservar", "apartar", "programar", "realizar",
								"crea", "haz", "agenda", "reserva", "aparta", "programa", "realiza",
								"agendame", "hazme", "reservame", "programame", "realizame", "creame", "apartame"};
			for(int i = 0; i < vEvento.length; i++) {
				if(texto.equalsIgnoreCase(vEvento[i] + " evento")		||
					texto.equalsIgnoreCase(vEvento[i] + " un evento")	||
					texto.equalsIgnoreCase(vEvento[i] + " cita")		||
					texto.equalsIgnoreCase(vEvento[i] + " una cita")	)
						return true; //si tiene cualquiera de las opciones para crear un evento regresa verdadero
			}
			return false;
		}
		
		
		
		public static boolean vChistes(String texto) {
			String[] vChistes = {"cuenta", "cuentame", "dime", "dame", "chiste", "contar", "cuenta",
								 "decime", "escribe", "escribeme"};
				for(int i = 0; i < vChistes.length; i++) {
						if(texto.equalsIgnoreCase(vChistes[i] + " un chiste")		||
							texto.equalsIgnoreCase(vChistes[i] + " chiste")			||
							texto.equalsIgnoreCase(vChistes[i] + " una broma")		||
							texto.equalsIgnoreCase(vChistes[i] + " otra broma")		||
							texto.equalsIgnoreCase(vChistes[i] + " otro chiste")	||
							texto.equalsIgnoreCase(vChistes[i] + " algo gracioso")	)
			return true; //si tiene cualquiera de las opciones para contar un chiste regresa verdadero
}
return false;
			
			
		}

		public static boolean vAmor(String texto) {
			String[] vAmor = {"te", "me"};
				for(int i = 0; i < vAmor.length; i++) {
						if(texto.equalsIgnoreCase(vAmor[i] + " amo")		||
							texto.equalsIgnoreCase(vAmor[i] + " amas")		||
							texto.equalsIgnoreCase(vAmor[i] + " amas?"))
			return true; //si tiene cualquiera de las opciones para contar un chiste regresa verdadero
}
return false;
		}
		
		public static boolean vDatos(String texto) {
			String[] vDatos = {"dime", "dame", "cuentame", "dato", "un dato","dime un"};
			for(int i = 0; i < vDatos.length; i++) {
				if(texto.equalsIgnoreCase(vDatos[i] + " un dato")		||
					texto.equalsIgnoreCase(vDatos[i] + " un dato curioso")	||
					texto.equalsIgnoreCase(vDatos[i] + " curioso")		||
					texto.equalsIgnoreCase(vDatos[i] + " curiosidad")		||
					texto.equalsIgnoreCase(vDatos[i] + " una curiosidad")		||
					texto.equalsIgnoreCase(vDatos[i] + " dato"))
						return true; //si tiene cualquiera de las opciones para crear un evento regresa verdadero
			}
			return false;
		}
		
		public static boolean vHola(String texto) {
			String[] vHola = {"Hey", "Hola", "que"};
			for(int i = 0; i < vHola.length; i++) {
				if(texto.equalsIgnoreCase(vHola[i] + " assistux")		||
					texto.equalsIgnoreCase(vHola[i])					||
					texto.equalsIgnoreCase(vHola[i] + " onda"))
						return true; //si tiene cualquiera de las opciones para crear un evento regresa verdadero
			}
			return false;
		}
		
		public static void bienvenida() {
			
			
			JTextField inpt= new JTextField();
			inpt.setText("Y entretenerte!");		
			inpt.setBounds(10, espacio, 200, 20);
			inpt.setEditable(false);
			espacio -= 30;
			Main.contentPane.add(inpt);
			
			JTextField inpt0 = new JTextField();
			inpt0.setText("Agendar eventos");		
			inpt0.setBounds(10, espacio, 200, 20);
			inpt0.setEditable(false);
			espacio -= 30;
			Main.contentPane.add(inpt0);
			
			JTextField inpt1 = new JTextField();
			inpt1.setText("Realizar operaciones matematicas");		
			inpt1.setBounds(10, espacio, 210, 20);
			inpt1.setEditable(false);
			espacio -= 30;
			Main.contentPane.add(inpt1);
			
			JTextField inpt2 = new JTextField();
			inpt2.setText("Enviar correos");	
			inpt2.setBounds(10, espacio, 200, 20);
			inpt2.setEditable(false);
			espacio -= 30;
			Main.contentPane.add(inpt2);
			
			JTextField inpt3 = new JTextField();
			inpt3.setText("Puedo realizar multiples tareas:");	
			inpt3.setBounds(10, espacio, 200, 20);
			inpt3.setEditable(false);
			espacio -= 30;
			Main.contentPane.add(inpt3);
			
			JTextField inpt4 = new JTextField();
			inpt4.setText("Sere tu asistente");	
			inpt4.setBounds(10, espacio, 200, 20);
			inpt4.setEditable(false);
			espacio -= 30;
			Main.contentPane.add(inpt4);
			
			JTextField inpt5 = new JTextField();
			inpt5.setText("Soy Assistux");	
			inpt5.setBounds(10, espacio, 200, 20);
			inpt5.setEditable(false);
			espacio -= 30;
			Main.contentPane.add(inpt5);
			
			JTextField inpt6 = new JTextField();
			inpt6.setText("Bienvenido usuario!");
			inpt6.setBounds(10, espacio, 200, 20);
			inpt6.setEditable(false);
			espacio -= 30;
			Main.contentPane.add(inpt6);
		}
		
		//Metodo para imprimir el input del usuario
		public static JTextField printUserInput(String texto) {
			JTextField uinpt = new JTextField();
			uinpt.setText(texto);
			uinpt.setEditable(false);
			int ub = ubicacion(texto);	//cambia el tamaÃ±o del dialogo dependiendo de lo largo que sea el input
			int an = ancho(texto);
			uinpt.setBounds(ub, espacio, an, 20);
			espacio-=30;
			return uinpt;
		}// fin metodo printUserInput
		
		/*METODOS PARA ASIGNAR EL ESPACIO DEL DIALOGO*/
		public static int ubicacion(String texto) {
			int ubicacion = 300;
			ubicacion -= 6*texto.length();
			return ubicacion;
		}
		
		public static int ancho(String texto) {
			int ancho = 20;
			ancho += 6*texto.length();
			return ancho;
		}
		
		public static void vez() {	//funcion que verifica si el tamaño en pantalla se ha excedido por los dialogos
			if(espacio < 0) {
				espacio = 480;	//reinicia el espacio
				Main.frame.dispose();	//cierra el frame
				Main.main(null);	//reinicia el frame
				Main.primerVez = false;	//pone primerVez en falso para que no mueste el mensaje de bienvenida otra vez
			}
		}
}
