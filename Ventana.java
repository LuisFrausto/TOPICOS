package ASCII;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {
    
    private final JTextField txtFile;
    private final JTextArea text;
    private final JButton encryptJButton;
    private final JButton decryptJButton;
   

	Ventana(){
    	super("Testing cipher");
        BorderLayout layout = new BorderLayout(10, 20);
        setLayout(layout);
        JPanel fileJPanel = new JPanel();
    	fileJPanel.setLayout(new FlowLayout());
        JLabel lblFile = new JLabel( "CIFRADO:" );
        fileJPanel.add(lblFile);
        txtFile = new JTextField(20);
        fileJPanel.add(txtFile);
        add(fileJPanel, BorderLayout.NORTH);
        text = new JTextArea(20,10);
    	add(text, BorderLayout.CENTER);
        
        JPanel buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new BorderLayout());
        encryptJButton = new JButton("Encriptar");
    	buttonJPanel.add(encryptJButton, BorderLayout.NORTH);
    	decryptJButton = new JButton("Desencriptar"	);
    	buttonJPanel.add(decryptJButton, BorderLayout.CENTER);
    	
    
        add(buttonJPanel, BorderLayout.EAST);
        
    	
        txtFile.addActionListener(new txtAccion());
        btnEncriptar A = new btnEncriptar();
        btnDESncriptar B = new btnDESncriptar();
        
        encryptJButton.addActionListener(A);
        decryptJButton.addActionListener(B);
    }
    
    class txtAccion implements ActionListener{
    	
          public void actionPerformed(ActionEvent event)
          {
          	text.setText(event.getActionCommand());
          }
    }
    
    class btnEncriptar implements ActionListener{
    
        public void actionPerformed(ActionEvent A){
            Encriptar pri = new Encriptar();
            
            //1.-Leer el texto del textarea
            	String encript = text.getText();
            //2.-Encriptar el texto
            	String textoEncriptado = pri.encriptar(pri.chars(txtFile.getText()));
            //3.-Poner el texto en el text area
            	text.setText(textoEncriptado);
        }
    }		
    
    class btnDESncriptar implements ActionListener{
    
        public void actionPerformed(ActionEvent A){
    		Encriptar pri = new Encriptar();
            
            //1.-Leer el texto del textarea
            	String encript = text.getText();
            //2.-Encriptar el texto
            	String textoEncriptado = pri.desencriptar(pri.chars(txtFile.getText()));
            //3.-Poner el texto en el text area
            	text.setText(textoEncriptado);
        }
    }
    

   public static void main(String[] args)
   { 
      Ventana ventana = new Ventana(); 
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setSize(350, 100); 
      ventana.setVisible(true); 
   } 
}