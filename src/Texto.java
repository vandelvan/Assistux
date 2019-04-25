import javax.swing.JTextField;

public class Texto {
	
	int espacio=480;	//Toma el alto minimo disponible para colocar el texto sin sobreponerse
	
		/*Constructor*/
		Texto() {
		}
		
		/*Metodos*/
		
		//Este metodo compara el texto ingresado por el usuario y regresa un dialogo
		JTextField getInput(String texto) {
			JTextField inpt = new JTextField();
			if(texto.equalsIgnoreCase("algo")) {	//Si el texto es "algo" (literalmente)
				inpt.setText("Qué gracioso xd");	//Respuesta ironica
				inpt.setEditable(false);			//No es editable por el usuario
				 inpt.setBounds(10, espacio, 200, 20);	//espacio es definido anteriormente para colocar los outputs en un alto que no se sobreponga
				 espacio-=30;	//disminuye el alto para el siguiente dialogo
			}else {
				String txt = texto.replaceAll("\\D+","");	//le quita las letras a la cadena para verificar si tiene numeros
				if(!txt.equals("")){	// si tiene numeros
					Matematicas m = new Matematicas(texto, espacio);
					inpt = m.matematicas();	//se manda al metodo para las operaciones matematicas
					espacio = m.getEspacio();
				}else {
						inpt.setText("Vuelva a intentarlo :c");	//si no tiene numeros ni es "algo", no entiende y devuelve "vuelva a intentarlo"
						inpt.setEditable(false);
						inpt.setBounds(10, espacio, 200, 20);
						espacio-=30;
					}
				}
			return inpt;	//regresa el dialogo para colocarse
		} // fin metodo getInput
}
