package psp_prueba;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class psp_calculadora_notepad {

	private JFrame frame;

	public void ejecutarNote(String ruta) {
		
		 ProcessBuilder pb;
        try {
                pb = new ProcessBuilder(ruta);
                pb.start();
        } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
}
	public void ejecutarCalculadora(String ruta) {
		
		 ProcessBuilder pb;
       try {
               pb = new ProcessBuilder(ruta);
               pb.start();
       } catch (Exception e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
       }
}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					psp_calculadora_notepad window = new psp_calculadora_notepad();
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
	public psp_calculadora_notepad() {
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
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			    String rutaNote=
			            "C:\\WINDOWS\\System32\\calc.exe";
			    Actividad_1 lp = new Actividad_1();
			    lp.ejecutar(rutaNote);
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Block de notas");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\arodriguez1063\\OneDrive - Fundación Universitaria San Pablo CEU\\Imágenes\\mismo.PNG"));
		btnNewButton_1.setBounds(173, 159, 151, 57);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
							    
			    String rutaNote=
			            "C:\\WINDOWS\\System32\\notepad.exe";
			    Actividad_1 lp = new Actividad_1();
			    lp.ejecutar(rutaNote);
			    
				
			}
		});
	}
}
