package assistux;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JScrollPane;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JScrollPane contentPane;
	private JTextField txtInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/icon/assistux.png"))); //Se asigna el icono
		setBackground(UIManager.getColor("ScrollBar.trackHighlightForeground"));
		setTitle("Assistux");	//se pone el titulo del frame
		setResizable(false);	//no se puede redimensionar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 300, 330, 600);	//tamaño y ubicacion
		contentPane = new JScrollPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtInput = new JTextField(10);	//se crea el input
		txtInput.setText("");
		TextPrompt placeholder = new TextPrompt("Escribe algo...", txtInput);	//se asigna el "placeholder" para darle una pista al usuario
	    placeholder.changeAlpha(0.75f);
	    placeholder.changeStyle(Font.ITALIC);
		txtInput.setBounds(19, 520, 211, 29);	//se coloca el input
		contentPane.add(txtInput);
		txtInput.setColumns(10);

		JButton btnOk = new JButton("OK");
		btnOk.setBackground(Color.WHITE);
		btnOk.addActionListener(new ActionListener() {	//Al dar clic a "ok"..
			public void actionPerformed(ActionEvent e) {
				String texto = txtInput.getText();	//toma el string ingresado por el usuario
				texto = texto.trim();//trim recorta espacios al inicio y final
				JTextField inpt = Texto.getInput(texto);	//lo manda a la funcion getInput de la clase Texto para analizarlo
				contentPane.add(inpt);	//se coloca la respuesta obtenida por la funcion
				JTextField uinpt = Texto.printUserInput(texto); //imprime el texto del usuario
				contentPane.add(uinpt);
				txtInput.setText(""); //resetea el input
			}
		});
		btnOk.setBounds(240, 520, 53, 29);
		contentPane.add(btnOk);
		
		//Dimension tamanioPane = contentPane.getSize();
		//Point p = new Point(
		  // 0,
		   //tamanioPane.height);
		//contentPane.getViewport().setViewPosition(p);
		Texto.bienvenida();
	}
}
