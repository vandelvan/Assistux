package assistux;
import javax.swing.JTextField;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;

public class Matematicas {
	String texto = "";

	Matematicas(String texto, int espacio){
		this.texto = texto;
	}
	
	//Metodo para realizar operaciones matematicas
			 JTextField matematicas(){
				ScriptEngineManager mgr = new ScriptEngineManager();
				ScriptEngine engine = mgr.getEngineByName("JavaScript");	//Libreria que hace toda la magia :')
				JTextField inpt = new JTextField();
				try {
				inpt.setText(String.valueOf(engine.eval(texto)));	//calcula y pone el resultado en el input
				inpt.setEditable(false);
				}
				catch(ScriptException e)
				{
					e.getMessage();
				}
				return inpt;
			} //Fin Matematicas
}
