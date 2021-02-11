import javax.swing.*;
import java.awt.*;

class VentanaFormulario extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public VentanaFormulario() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Formulario");
		
		
		
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public void componente(JComponent c, int gx, int gy, int gw, int gh, int fill) {
		
		gbc.gridx = gx;
		gbc.gridy = gy;
		gbc.gridheight = gh;
		gbc.gridwidth = gw;
		gbc.fill = fill;
		gbl.setConstraints(c, gbc);
		add(c);
		
	}
	
}


public class FormularioGridbagLayout {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaFormulario();
            }
    });
	 
		
		

	}

}
