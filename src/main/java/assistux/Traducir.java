package assistux;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

	public class Traducir {
	    public static void traduce(String texto) {	//metodo que realiza la busqueda
	    	String[] vTraducir = {"traduce", "traslada", "interpreta"};	//vuelve a declarar el arreglo de strings con las variaciones de busqueda
	    	String[] textoSeparado = texto.split(" ");
	    	for(int i=0; i < vTraducir.length; i++) {
	    		if(textoSeparado[0].equalsIgnoreCase(vTraducir[i]))	
	    			textoSeparado[0] = "";	//si encuentra la primer palabra clave, la quita de la busqueda
	    	}
			texto = String.join(" ", textoSeparado);	//acomoda la busqueda sin las palabras clave
	    	String traducir = texto.replace(" ","+");	//separa las palabras con + en vez de espacios
	        String url = "https://translate.google.com/?translate&sl=auto&tl=es&text="+traducir;	//Arma la busqueda

	        if(Desktop.isDesktopSupported()){	//PARA ABRIR EL EXPLORADOR EN SISTEMAS WINDOWS
	            Desktop desktop = Desktop.getDesktop();
	            try {
	                desktop.browse(new URI(url));
	            } catch (IOException e) {
	                e.printStackTrace();
	            }catch (URISyntaxException e) {
	                e.printStackTrace();
	            }
	        }else{	//PARA ABRIR EL EXPLORADOR EN SISTEMAS UNIX
	            Runtime runtime = Runtime.getRuntime();
	            try {
	                runtime.exec("xdg-open " + url);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}