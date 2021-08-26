package gui;


import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextPane;
import java.awt.Toolkit;
import java.util.Date;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;

		public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(663, 277));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 444, 215);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		JLabel lbllu = new JLabel("LU");
		lbllu.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbllu.setBounds(21, 11, 46, 14);
		tabInformation.add(lbllu);
		
		JLabel lblapellido = new JLabel("Apellido");
		lblapellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblapellido.setBounds(21, 45, 46, 14);
		tabInformation.add(lblapellido);
		
		JLabel lblnombre = new JLabel("Nombre");
		lblnombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblnombre.setBounds(21, 79, 46, 14);
		tabInformation.add(lblnombre);
		
		JLabel lblemail = new JLabel("E-mail");
		lblemail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblemail.setBounds(21, 113, 46, 14);
		tabInformation.add(lblemail);
		
		JLabel lblgithuburl = new JLabel("Github URL");
		lblgithuburl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblgithuburl.setBounds(21, 147, 62, 14);
		tabInformation.add(lblgithuburl);
		
		JTextPane lu = new JTextPane();
		lu.setText(String.valueOf(studentData.getId()));
		lu.setBounds(96, 11, 319, 25);
		tabInformation.add(lu);
		
		JTextPane apellido = new JTextPane();
		apellido.setText(studentData.getLastName());
		apellido.setBounds(96, 45, 319, 25);
		tabInformation.add(apellido);
		
		JTextPane nombre = new JTextPane();
		nombre.setText(studentData.getFirstName());
		nombre.setBounds(96, 79, 319, 25);
		tabInformation.add(nombre);
		
		JTextPane email = new JTextPane();
		email.setText(studentData.getMail());
		email.setBounds(96, 113, 319, 25);
		tabInformation.add(email);
		
		JTextPane githuburl = new JTextPane();
		githuburl.setText(studentData.getGithubURL());
		githuburl.setBounds(96, 147, 319, 25);
		tabInformation.add(githuburl);
		contentPane.add(tabbedPane);
		
		JLabel foto = new JLabel("");
		foto.setBounds(473, 29, 158, 189);
		
		ImageIcon ico =new ImageIcon(this.getClass().getResource(studentData.getPathPhoto()));
		ImageIcon img =new ImageIcon(ico.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH));
		
		foto.setIcon(img);
		contentPane.add(foto);
		
		JLabel fecha = new JLabel("New label");	
		fecha.setText("Esta ventana fue generada el: "+String.valueOf(new Date()));
		fecha.setBounds(5, 223, 444, 14);
		contentPane.add(fecha);
	}
}
