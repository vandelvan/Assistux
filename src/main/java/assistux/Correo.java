package assistux;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class Correo {
	int espacio = 0;
	JTextField para;
	JTextField asunto;
	JTextField mensaje;
	
	public Correo(int espacio) {
		this.espacio = espacio;
	}
	/*Funcion que inicia el envio del correo*/
	public void iniciarCorreo() {
		JTextField inpt = new JTextField();
		inpt.setText("Por favor, llene los siguientes campos:");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 250, 20);
		espacio -= 30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void armarCorreoPara() {
		JTextField inpt = new JTextField();
		inpt.setText("Correos separados por ,");	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio -= 30;
		Main.contentPane.add(inpt);
		para = inpt;
	}
	public void armarCorreoAsunto() {
		JTextField inpt = new JTextField();
		inpt.setText("Asunto...");	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio -= 30;
		Main.contentPane.add(inpt);
		asunto = inpt;
	}
	public void armarCorreoMensaje() {
		JTextField inpt = new JTextField();
		inpt.setText("Mensaje...");	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio -= 30;
		Main.contentPane.add(inpt);
		mensaje = inpt;
	}
	
	public void colocarBotonEnvio() {
		final JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.WHITE);
		btnEnviar.addActionListener(new ActionListener() {	//Al dar clic a "enviar"..
			public void actionPerformed(ActionEvent e) {
				if(!para.getText().equals("Correos separados por ,") &&
				   !para.getText().equals("")						 &&	//Verifica los campos para enviar el correo
				   !asunto.getText().equals("")						 &&
				   !mensaje.getText().equals("")					 ){
					btnEnviar.setEnabled(false);
					para.setEditable(false);
					asunto.setEditable(false);
					mensaje.setEditable(false);
					enviar();
				}else {
					JTextField inpt = new JTextField();
					inpt.setText("Llene todos los campos");	//crea el dialogo
					inpt.setBounds(10, espacio-30, 200, 20);
					espacio -= 30;
					Main.contentPane.add(inpt);
				}
			}
		});
		btnEnviar.setBounds(240, espacio-5, 80, 20);
		espacio -= 30;
		armarCorreoMensaje();	//coloca los campos
		armarCorreoAsunto();	//a llenar
		armarCorreoPara();		//para mandar el correo
		iniciarCorreo();
		Main.contentPane.add(btnEnviar);
		btnEnviar.setVisible(true);
	}
	
	public int getEspacio() {
		return espacio;
	}

	/*METODO PARA ENVIAR CORREOS POR TLS CON EL SERVICIO DE GMAIL*/
    public void enviar() {
    	
    	/*CUALQUIER CUENTA DE GOOGLE USADA DEBE TENER HABILITADO EN OPCIONES DE SEGUIRDAD "Acceso de aplicaciones poco seguras"*/
    	
    	final String username = "user";	//Usuario de Google para enviar correos
    	final String password = "pass";	//Contraseña de Google para enviar correos
        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");				//Configuracion del Host de Gmail
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        
        Session session = Session.getInstance(prop,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);		//Verifica la cuenta de Google
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("assistuxx@gmail.com"));	//Remitente
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(para.getText())	//Coloca los correos separados con comas
            );
            message.setSubject(asunto.getText());
            message.setText(mensaje.getText() 
            				+ "\n\n\n"
            				+ "Este correo fue enviado por el asistente digital de codigo libre Assistux:\n"	//auto-promocion xd
            				+ "https://github.com/vandelvan/Assistux");

            Transport.send(message);

            JTextField inpt = new JTextField();
			inpt.setText("Correo enviado ;)");	//crea el dialogo
			inpt.setBounds(10, espacio-30, 150, 20);
			espacio -= 30;
			Main.contentPane.add(inpt);	//notifica al usuario

        } catch (MessagingException e) {
            e.printStackTrace();
            JTextField inpt = new JTextField();
			inpt.setText("Hubo un error :C");	//crea el dialogo
			inpt.setBounds(10, espacio-30, 150, 20);
			espacio -= 30;
			Main.contentPane.add(inpt);	//notifica al usuario
        }
    }

}