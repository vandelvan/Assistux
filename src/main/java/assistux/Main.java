package assistux;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	static JPanel contentPane;
	public static JTextField txtInput;
	static boolean primerVez = true;
	static Main frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main(){
		JRootPane root= getRootPane();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/icon/assistux.png"))); //Se asigna el icono
		setBackground(UIManager.getColor("ScrollBar.trackHighlightForeground"));
		setTitle("Assistux");	//se pone el titulo del frame
		setResizable(false);	//no se puede redimensionar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int posX = (int) (screenSize.getWidth()*.01);
		int posY = (int) (screenSize.getHeight()*.2);	//posiciona el JFrame dependiendo del tamaño de la pantalla
		setBounds(posX, posY, 330, 600);	//tamaño y ubicacion
		try {
		    final Image backgroundImage = ImageIO.read(Main.class.getResource("/icon/Fondo.png"));//coloca el fondo del programa
		    contentPane = new JPanel(new BorderLayout()) {
				private static final long serialVersionUID = 1L;

				@Override 
		        public void paintComponent(Graphics g) {
		            g.drawImage(backgroundImage, 0, 0, null);
		        }
		    };
		} catch (IOException e) {
		    throw new RuntimeException(e);
		}
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		crearPane(root);
		Texto.bienvenida();
	}
	static void crearPane(JRootPane root) {
		txtInput = new JTextField(10) {
			private static final long serialVersionUID = 1L;

			public void addNotify() {
	            super.addNotify();
	            requestFocus();	//da enfoque al input para escribir al iniciar el frame
	        }
	    };	//se crea el input
		txtInput.setText("");
		TextPrompt placeholder = new TextPrompt("Escribe algo...", txtInput);	//se asigna el "placeholder" para darle una pista al usuario
	    placeholder.changeAlpha(0.75f);
	    placeholder.changeStyle(Font.ITALIC);
		txtInput.setBounds(19, 520, 211, 29);	//se coloca el input
		contentPane.add(txtInput);
		txtInput.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.setBackground(Color.WHITE);
		root.setDefaultButton(btnOk);
		btnOk.addActionListener(new ActionListener() {	//Al dar clic a "ok"..
			public void actionPerformed(ActionEvent e) {
				String texto = txtInput.getText();	//toma el string ingresado por el usuario
				texto = texto.trim();//trim recorta espacios al inicio y final
				JTextField inpt = Texto.getInput(texto);	//lo manda a la funcion getInput de la clase Texto para analizarlo
				contentPane.add(inpt);	//se coloca la respuesta obtenida por la funcion
				JTextField uinpt = Texto.printUserInput(texto); //imprime el texto del usuario
				contentPane.add(uinpt);
				txtInput.setText(""); //resetea el input
				txtInput.requestFocus();	//da enfoque al input para escribir
				Texto.vez(texto);
			}
		});
		btnOk.setBounds(240, 520, 53, 29);
		contentPane.add(btnOk);
	}
}
