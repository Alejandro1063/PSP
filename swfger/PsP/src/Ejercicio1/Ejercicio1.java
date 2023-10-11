package Ejercicio1;


public class Ejercicio1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Prácticas de la vida");
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Calculadora");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\arodriguez1063\\OneDrive - Fundación Universitaria San Pablo CEU\\Imágenes\\calculadora.PNG"));
		btnNewButton.setBounds(173, 58, 151, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Block de notas");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\arodriguez1063\\OneDrive - Fundación Universitaria San Pablo CEU\\Imágenes\\mismo.PNG"));
		btnNewButton_1.setBounds(173, 159, 151, 57);
		frame.getContentPane().add(btnNewButton_1);
	}
}
