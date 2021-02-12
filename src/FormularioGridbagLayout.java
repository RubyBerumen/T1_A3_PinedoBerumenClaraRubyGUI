import javax.swing.*;
import java.awt.*;

class VentanaFormulario extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public VentanaFormulario() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Formulario");
		setSize(450,450);
		
		JLabel txt1 = new JLabel("From options");
		componente(txt1, 0, 0, 1, 1, 2);
		JLabel txt2 = new JLabel("Include the following:");
		componente(txt2, 0, 1, 1, 1, 2);
		JCheckBox check1 = new JCheckBox("A title for your form");
		componente(check1, 0, 2, 1, 1, 2);
		JTextField txtF1 = new JTextField("Subscribe to our mailing list");
		componente(txtF1, 0, 3, 1, 1, 2);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("only required fields");
		bg.add(radio1);
		componente(radio1, 0, 5, 1, 1, 2);
		JRadioButton radio2 = new JRadioButton("all fields");
		bg.add(radio2);
		componente(radio2, 0, 6, 1, 1, 2);
		
		JCheckBox check2 = new JCheckBox("interest group fields");
		componente(check2, 0, 8, 1, 1, 2);
		JCheckBox check3 = new JCheckBox("required field indicators");
		componente(check3, 0, 9, 1, 1, 2);
		
		JLabel txt3 = new JLabel("Set form width");
		componente(txt3, 0, 11, 1, 1, 2);
		JTextField txtF2 = new JTextField();
		componente(txtF2, 0, 12, 1, 1, 2);
		
		
		JLabel txt4 = new JLabel("Enhance your form");
		componente(txt4, 0, 14, 1, 1, 2);
		JCheckBox check4 = new JCheckBox("enable evil popup mode");
		componente(check4, 0, 15, 1, 1, 2);
		JCheckBox check5 = new JCheckBox("disable all");
		componente(check5, 0, 16, 1, 1, 2);
		JCheckBox check6 = new JCheckBox("include archive link");
		componente(check6, 0, 17, 1, 1, 2);
		JCheckBox check7 = new JCheckBox("include page link");
		componente(check7, 0, 18, 1, 1, 2);
		
	
		JLabel txt5 = new JLabel("Preview");
		componente(txt5, 2, 0, 1, 1, 2);
		JLabel txt6 = new JLabel("Email Address");
		componente(txt6, 2, 1, 1, 1, 2);
		JFormattedTextField txtF3 = new JFormattedTextField();
		componente(txtF3, 2, 2, 2, 1, 2);
		JLabel txt7 = new JLabel("First Name");
		componente(txt7, 2, 3, 1, 1, 2);
		JFormattedTextField txtF4 = new JFormattedTextField();
		componente(txtF4, 2, 4, 2, 1, 2);
		JLabel txt8 = new JLabel("Last Name");
		componente(txt8, 2, 5, 1, 1, 2);
		JFormattedTextField txtF5 = new JFormattedTextField();
		componente(txtF5, 2, 6, 2, 1, 2);
		
		Icon icon = new ImageIcon("./archivos/s1.jpg");
		JButton btn = new JButton(icon);
		componente(btn, 2, 7, 1, 1, 0);
		
		JLabel txt10 = new JLabel("     ");
		componente(txt10, 1, 1, 1, 1, 2);
		JLabel txt11 = new JLabel("                            ");
		componente(txt11, 3, 0, 1, 1, 2);
		
		JLabel txt9 = new JLabel("Copy/paste onto your site");
		componente(txt9, 2, 9, 1, 1, 2);
		
		JTextArea textField = new JTextArea();
        textField.setEditable(false);

        String str = "";
        for (int i = 0; i < 60; ++i)
            str += "Mucho texto\n";
        textField.setText(str);

        JScrollPane scroll = new JScrollPane(textField);
        componente(scroll, 2, 10, 2, 15, 1);
		
		
		
		//pack();
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
