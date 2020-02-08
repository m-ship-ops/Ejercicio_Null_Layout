
import javax.swing.*;
import java.awt.*;

class formularioRegistro extends JFrame{
	
	public formularioRegistro(){
		getContentPane().setLayout(null); 	//layout nulo
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Formulario Registro");
		setSize(300,300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblEt1 = new JLabel(); //creacion 
		lblEt1.setText("The Classic Form incluides all"
				+ " visible fields for this list ");	//Configuracion
		lblEt1.setBounds(5, 5, 350, 30);
		add(lblEt1); //agregacion
		
		JLabel lblEt2 = new JLabel(); //creacion 
		lblEt2.setText("Form options ");	//Configuracion
		lblEt2.setBounds(5, 30, 80, 30);
		add(lblEt2); //agregacion
		
		JLabel lblItf = new JLabel();
		lblItf.setText("Incluide the following: ");
		lblItf.setBounds(5, 30, 200, 100);
		add(lblItf);
		
		JCheckBox checkboxEt4 = new JCheckBox("a title for your form");
		checkboxEt4.setBounds(5, 35, 300, 150);
		add(checkboxEt4);
		
		JLabel lblcajaBacia = new JLabel(); //creacion 
		lblcajaBacia.setText(" ");	//Configuracion
		lblcajaBacia.setBounds(5, 30, 150, 100);
		add(lblcajaBacia);
		JTextField cajaBacia = new JTextField(10); //creacion
		cajaBacia.setBounds(5, 40, 150, 220);
		add(cajaBacia); //agregacion 
		
		
		ButtonGroup bg = new ButtonGroup();
		JTextField cajaOrf = new JTextField(10); 
		add(cajaOrf);
		JRadioButton radioOrf = new JRadioButton("only required fields");
		radioOrf.setBounds(5, 50, 300, 150);
		bg.add(radioOrf);
		add(radioOrf);
		JRadioButton radioAf = new JRadioButton("all fields");
		radioAf.setBounds(5, 60, 300, 150);
		bg.add(radioAf);
		add(radioAf);
		JLabel lblerfitfb = new JLabel(); //creacion 
		lblerfitfb.setText("(edit required fields in the form builder ");	//Configuracion
		lblerfitfb.setBounds(10, 70, 300, 130);
		add(lblerfitfb); //agregacion
		
		JCheckBox checkboxIgf = new JCheckBox("interest group fields");
		checkboxIgf.setBounds(5, 90, 300, 150);
		add(checkboxIgf);
		
		JCheckBox checkboxrfi = new JCheckBox("required field indications");
		checkboxrfi.setBounds(5, 100, 300, 150);
		add(checkboxrfi);
		
		JLabel lblSfw = new JLabel(); //creacion 
		lblSfw.setText("Set form width ");	//Configuracion
		lblSfw.setBounds(5, 110, 300, 150);
		add(lblSfw);
		
		JTextField cajaSfw = new JTextField(10); //creacion
		cajaSfw.setBounds(5, 120, 300, 90);
		add(cajaSfw); //agregacion 
		
		JLabel lblEyf = new JLabel();
		lblEyf.setText("Enhance your form ");
		lblEyf.setBounds(5, 130, 300, 100);
		add(lblEyf);
		
		JCheckBox checkboxEepm = new JCheckBox("enable evil popup mode");
		checkboxEepm.setBounds(5, 140, 300, 100);
		add(checkboxEepm);
		JCheckBox checkboxDajs = new JCheckBox("disable all JavaScript");
		checkboxDajs.setBounds(5, 150, 300, 100);
		add(checkboxDajs);
		JCheckBox checkboxIal = new JCheckBox("include archive link");
		checkboxIal.setBounds(5, 160, 300, 100);
		add(checkboxIal);
		JCheckBox checkboxImrl = new JCheckBox("include MonkeyRewards link");
		checkboxImrl.setBounds(5, 150, 300, 100);
		add(checkboxImrl);
		
		JLabel lblPreview = new JLabel(); //creacion 
		lblEt2.setText("Preview ");	//Configuracion
		lblEt2.setBounds(400, 30, 80, 30);
		add(lblEt2); //agregacion
		
		
		JLabel lblEmailAddress = new JLabel(); //creacion 
		lblEmailAddress.setText("Email Address ");	//Configuracion
		lblEmailAddress.setBounds(400, 70, 300, 100);
		add(lblEmailAddress);
		
		JTextField cajaEmailAddress = new JTextField(10); //creacion
		cajaEmailAddress.setBounds(400, 80, 300, 100);
		add(cajaEmailAddress); //agregacion 
		
		JLabel lblFirstName = new JLabel(); //creacion 
		lblFirstName.setText("First Name ");	//Configuracion
		lblFirstName.setBounds(400, 100, 300, 100);
		add(lblFirstName);
		
		JTextField cajaFirstName = new JTextField(10); //creacion
		cajaFirstName.setBounds(400, 110, 300, 100);
		add(cajaFirstName); //agregacion 
		
		JLabel lblLastName = new JLabel(); //creacion 
		lblLastName.setText("Last Name ");	//Configuracion
		lblLastName.setBounds(400, 130, 300, 100);
		add(lblLastName);
		
		JTextField cajaLastName = new JTextField(10); //creacion
		cajaLastName.setBounds(400, 140, 300, 100);
		add(cajaLastName); //agregacion 
		
		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.setBounds(400, 170, 280, 100);
		add(btnSubscribe);
		
		JLabel lblCopyPasteOntoYourSite = new JLabel(); //creacion 
		lblCopyPasteOntoYourSite.setText("Copy/paste onto your site ");	//Configuracion
		lblCopyPasteOntoYourSite.setBounds(400, 180, 300, 100);
		add(lblCopyPasteOntoYourSite);
		
		JTextField cajaCp = new JTextField(10); //creacion
		cajaCp.setBounds(400, 190, 300, 100);
		add(cajaCp); //agregacion 
		
		
	}//metodo formulario registro
	
}//class formulario registro


public class Prueba {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new formularioRegistro();
				
			}// metodo override
		});   //swingUtilities	
		

	}//

}//
