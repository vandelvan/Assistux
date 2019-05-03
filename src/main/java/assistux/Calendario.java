package assistux;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.CalendarScopes;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;
import com.google.api.services.calendar.model.EventReminder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Calendario {
	private int espacio = 0;
	private JTextField nombreEvento;
	private JTextField fechaInicio;
	private JTextField fechaFin;
	private JTextField horaInicio;
	private JTextField horaFin;
	
    private static final String APPLICATION_NAME = "Assistux";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(CalendarScopes.CALENDAR);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";
    
    public Calendario(int espacio) {
    	this.espacio = espacio;
    }
    
    /*Funcion que inicia el envio del correo*/
	public void iniciarEvento() {
		JTextField inpt = new JTextField();
		inpt.setText("Por favor, llene los siguientes campos:");
		inpt.setEditable(false);	//crea el dialogo
		inpt.setBounds(10, espacio, 250, 20);
		espacio -= 30;
		Main.contentPane.add(inpt);	//lo coloca
	}
	public void armarEventoNombre() {
		JTextField inpt = new JTextField();
		inpt.setText("Nombre evento");	//crea el dialogo
		inpt.setBounds(10, espacio, 200, 20);
		espacio -= 30;
		Main.contentPane.add(inpt);
		nombreEvento = inpt;
	}
	public void armarEventoFechaInicio() {
		JTextField inpt = new JTextField();
		inpt.setText("YYYY-MM-dd");	//crea el dialogo
		inpt.setBounds(10, espacio, 100, 20);
		JTextField inpt2 = new JTextField();
		inpt2.setText("HH:mm");	//crea el dialogo
		inpt2.setBounds(160, espacio, 100, 20);
		espacio -= 30;
		Main.contentPane.add(inpt);
		Main.contentPane.add(inpt2);
		fechaInicio = inpt;
		horaInicio = inpt2;
	}
	public void armarEventoFechaFin() {
		JTextField inpt = new JTextField();
		inpt.setText("YYYY-MM-dd");	//crea el dialogo
		inpt.setBounds(10, espacio, 100, 20);
		JTextField inpt2 = new JTextField();
		inpt2.setText("HH:mm");	//crea el dialogo
		inpt2.setBounds(160, espacio, 100, 20);
		espacio -= 30;
		Main.contentPane.add(inpt);
		Main.contentPane.add(inpt2);
		fechaFin = inpt;
		horaFin = inpt2;
	}
	
	public void colocarBotonEvento() {
		final JButton btnEnviar = new JButton("Crear");
		btnEnviar.setBackground(Color.WHITE);
		btnEnviar.addActionListener(new ActionListener() {	//Al dar clic a "enviar"..
			public void actionPerformed(ActionEvent e) {
				if(!nombreEvento.getText().equals("")						 &&	//Verifica los campos para enviar el evento
				   !fechaInicio.getText().equals("YYYY-MM-dd")				 &&
				   !fechaFin.getText().equals("YYYY-MM-dd")					 &&
				   !horaInicio.getText().equals("HH:mm")					 &&
				   !horaFin.getText().equals("HH:mm")					     &&
				   !fechaInicio.getText().equals("")						 &&
				   !fechaFin.getText().equals("")							 &&
				   !horaInicio.getText().equals("")							 &&
				   !horaFin.getText().equals("")							 ){
					btnEnviar.setEnabled(false);
					nombreEvento.setEditable(false);
					fechaInicio.setEditable(false);
					fechaFin.setEditable(false);
					horaInicio.setEditable(false);
					horaFin.setEditable(false);
					try {
						nuevoEvento();
					} catch (IOException | GeneralSecurityException | ParseException e1) {
						e1.printStackTrace();
					}
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
		armarEventoFechaFin();	//coloca los campos
		armarEventoFechaInicio();	//a llenar
		armarEventoNombre();		//para crear el evento
		iniciarEvento();
		Main.contentPane.add(btnEnviar);
		btnEnviar.setVisible(true);
	}

    /**
     * Creates an authorized Credential object.
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = Calendario.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    public void nuevoEvento() throws IOException, GeneralSecurityException, ParseException {
        // Build a new authorized API client service.
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        Calendar service = new Calendar.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        
        Event event = new Event()
        	    .setSummary(nombreEvento.getText())
        	    .setDescription("Evento creado con el asistente digital de codigo libre Assistux: "
        	    			  + "https://github.com/vandelvan/Assistux");


        	Date fInicio = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(fechaInicio.getText()+"T"+horaInicio.getText()+":00Z");
        	DateTime startDateTime = new DateTime(fInicio);
        	EventDateTime start = new EventDateTime()
        	    .setDateTime(startDateTime)
        	    .setTimeZone("America/Los_Angeles");
        	event.setStart(start);

        	//2019-05-01T23:41:45Z ejemplo ISO 8601
        	Date fFin = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(fechaFin.getText()+"T"+horaFin.getText()+":00Z");
        	DateTime endDateTime = new DateTime(fFin);
        	EventDateTime end = new EventDateTime()
        	    .setDateTime(endDateTime)
        	    .setTimeZone("America/Los_Angeles");
        	event.setEnd(end);

        	String[] recurrence = new String[] {"RRULE:FREQ=DAILY;COUNT=2"};
        	event.setRecurrence(Arrays.asList(recurrence));

        	EventReminder[] reminderOverrides = new EventReminder[] {
        	    new EventReminder().setMethod("email").setMinutes(24 * 60),
        	    new EventReminder().setMethod("popup").setMinutes(10),
        	};
        	Event.Reminders reminders = new Event.Reminders()
        	    .setUseDefault(false)
        	    .setOverrides(Arrays.asList(reminderOverrides));
        	event.setReminders(reminders);

        	String calendarId = "primary";
        	event = service.events().insert(calendarId, event).execute();
        	System.out.printf("Event created: %s\n", event.getHtmlLink());
    }
    public int getEspacio() {
		return espacio;
	}
}