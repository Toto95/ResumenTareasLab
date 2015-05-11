import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Instrucciones extends JFrame {
	public Instrucciones(){
	JButton boton=new JButton("Regresar");
	boton.setBackground(Color.RED);
	boton.setBounds(1100, 500, 150, 75);
	JPanel panel=(JPanel)this.getContentPane();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.setBackground(Color.ORANGE);
	setSize(1350,710);
	setVisible(true);
	setTitle("Instrucciones");
	setLayout(null);
	ImageIcon imagen=new ImageIcon("PrincipalExplicada.jpg");
	JLabel etiqueta=new JLabel(imagen);
	etiqueta.setBounds(0, 0, 1360, 700);
	panel.add(etiqueta);
	panel.add(boton);
	repaint();
	boton.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setVisible(false);
		}
		
	});
	
}


}
