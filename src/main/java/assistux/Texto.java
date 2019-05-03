package assistux;
import javax.swing.JTextField;

public class Texto {
	
	static int espacio=480;	//Toma el alto minimo disponible para colocar el texto sin sobreponerse
	
	
		/*Metodos*/
		
		//Este metodo compara el texto ingresado por el usuario y regresa un dialogo
		public static JTextField getInput(String texto){
			JTextField inpt = new JTextField();
			if(texto.equalsIgnoreCase("algo")) {	//Si el texto es "algo" (literalmente)
				inpt.setText("Qué gracioso xd");	//Respuesta ironica
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
								"crea", "haz", "agenda", "reserva", "aparta", "programa", "realiza"};
			for(int i = 0; i < vEvento.length; i++) {
				if(texto.equalsIgnoreCase(vEvento[i] + " evento")		||
					texto.equalsIgnoreCase(vEvento[i] + " un evento")	||
					texto.equalsIgnoreCase(vEvento[i] + " cita")		||
					texto.equalsIgnoreCase(vEvento[i] + " una cita")	)
						return true; //si tiene cualquiera de las opciones para crear un evento regresa verdadero
			}
			return false;
		}
		
		//Metodo para imprimir el input del usuario
		public static JTextField printUserInput(String texto) {
			JTextField uinpt = new JTextField();
			uinpt.setText(texto);
			uinpt.setEditable(false);
			int ub = ubicacion(texto);	//cambia el tamaño del dialogo dependiendo de lo largo que sea el input
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
}
