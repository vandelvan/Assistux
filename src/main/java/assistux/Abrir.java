package assistux;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Abrir {
    public static void abrir(String texto) {
    	String[] vAbrir = {"abre", "abrir"};	//vuelve a declarar el arreglo de strings con las variaciones de abrir
    	String[] textoSeparado = texto.split(" ");
    	for(int i=0; i < vAbrir.length; i++) {
    		if(textoSeparado[0].equalsIgnoreCase(vAbrir[i]))	
    			textoSeparado[0] = "";	//si encuentra la primer palabra clave, la quita de la busqueda
    	}
		texto = String.join(" ", textoSeparado);	//acomoda la URL sin las palabras clave
		texto = texto.trim();
		String[] sitio = texto.split("\\.");	//separa la url por .
		String[] extensiones = {"com", "mx", "io", "udg", "org", "net", "co", "us"};	//lista de extensiones
		for(int i = 0; i < extensiones.length; i++)
			if(sitio[1].equalsIgnoreCase(extensiones[i])) {	//si encuentra una extension
		        String url = "http://"+texto;	//Arma la URL
		
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
}