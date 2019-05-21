package assistux;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Busqueda {
    public static void buscar(String texto) {	//metodo que realiza la busqueda
    	String[] vBuscar = {"busca", "investiga", "busqueda", "indaga",
				"buscar", "investigar", "indagar"};	//vuelve a declarar el arreglo de strings con las variaciones de busqueda
    	String[] textoSeparado = texto.split(" ");
    	String ur= "http://www.google.com/search?q=";
    	for(int i=0; i < vBuscar.length; i++) {
    		if(textoSeparado[0].equalsIgnoreCase(vBuscar[i]))	
    			textoSeparado[0] = "";	//si encuentra la primer palabra clave, la quita de la busqueda
    		if(textoSeparado.length > 2)
    			if(textoSeparado[2].equalsIgnoreCase("youtube") ||
    			   textoSeparado[1].equalsIgnoreCase("youtube")	) {
							ur =  "https://www.youtube.com/results?search_query=";
	    					textoSeparado[0] = "";
	    					textoSeparado[1] = "";	//quita cualquier palabra clave de la busqueda
	    					textoSeparado[2] = "";
    	    			}
    			else {
    					if(textoSeparado[0].equalsIgnoreCase(vBuscar[i])	   && 
							textoSeparado[1].equalsIgnoreCase("en") 	   	   && 
							textoSeparado[2].equalsIgnoreCase("google")		   ||
							textoSeparado[2].equalsIgnoreCase("internet")){
	    						textoSeparado[0] = "";
	    						textoSeparado[1] = "";	//quita cualquier palabra clave de la busqueda
	    						textoSeparado[2] = "";
    					}
    				}
    		}
		texto = String.join(" ", textoSeparado);	//acomoda la busqueda sin las palabras clave
		texto = texto.trim();
    	String busqueda = texto.replace(" ","+");	//separa las palabras con + en vez de espacios
        String url = ur+busqueda;	//Arma la busqueda

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