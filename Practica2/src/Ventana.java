import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class Ventana extends JFrame{
	
	String cantidad;
	int opcion=0;
	
	
	public Ventana() throws InterruptedException{
		      
	       
		// panel de pregunta
					cantidad=JOptionPane.showInputDialog("Con cuantos discos desea jugar  (3-8)");
				   opcion=Integer.parseInt(cantidad);
		
				   int movimientos=0;	
				   
	 	   
		//creando botones
		JButton boton1= new JButton("Torre 1");
		boton1.setBounds(100, 625, 400, 25);
		JButton dt1at2=new JButton("Mover a torre 2");
		dt1at2.setBounds(100, 650, 200, 25);
		JButton dt1at3=new JButton("Mover a torre 3");
		dt1at3.setBounds(300, 650, 200, 25);
		JButton boton2= new JButton("Torre 2");
		boton2.setBounds(510,625,400,25);
		JButton dt2at1= new JButton("Mover a torre 1");
		dt2at1.setBounds(510, 650, 200, 25);
		JButton dt2at3= new JButton("Mover a torre 3");
		dt2at3.setBounds(710, 650, 200, 25);
		JButton boton3= new JButton("Torre 3");
		boton3.setBounds(920,625,400,25);
		JButton dt3at1= new JButton("Mover a torre 1");
		dt3at1.setBounds(920, 650, 200, 25);
		JButton dt3at2=new JButton("Mover a torre 2");
		dt3at2.setBounds(1120, 650, 200, 25);
		JButton boton4=new JButton("Reglas");
		boton4.setBounds(0,0,150,25);
		JButton boton5=new JButton("Punteos");
		boton5.setBounds(0, 30, 150, 25);
		JButton boton6=new JButton("Ejemplo");
		boton6.setBounds(0, 60, 150, 25);
		JButton boton7=new JButton("Instrucciones");
		boton7.setBounds(0, 90, 150, 25);
		
	    
 //ventana principal
	    
	    JPanel panel=(JPanel)this.getContentPane();
	   
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(Color.ORANGE);
		
		setSize(1350,710); setTitle("Torres de Hanoi"); setVisible(true); 

		Operaciones check=new Operaciones();
		
		String tt=null;
		
		
		
	    //creando los label
		
		Icon image1=new ImageIcon("cuadro1.jpg");
		Icon image2=new ImageIcon("cuadro2.jpg");
		Icon image3=new ImageIcon("cuadro3.jpg");
		Icon image4=new ImageIcon("cuadro4.jpg");
		Icon image5=new ImageIcon("cuadro5.jpg");
		Icon image6=new ImageIcon("cuadro6.jpg");
		Icon image7=new ImageIcon("cuadro7.jpg");
		Icon image8=new ImageIcon("cuadro8.jpg");
		JLabel eti1=new JLabel(image1);
		eti1.setBounds(102, 475, 400, 200);
		JLabel eti2=new JLabel(image2);
		eti2.setBounds(104,400,400,200);
		JLabel eti3=new JLabel(image3);
		eti3.setBounds(106, 325, 400, 200);
		JLabel eti4=new JLabel(image4);
		eti4.setBounds(108,250,400,200);
		JLabel eti5=new JLabel(image5);
		eti5.setBounds(110, 175, 400, 200);
		JLabel eti6=new JLabel(image6);
		eti6.setBounds(112, 100, 400, 200);
		JLabel eti7=new JLabel(image7);
		eti7.setBounds(114, 25, 400, 200);
		JLabel eti8=new JLabel(image8);
		eti8.setBounds(116, -50, 400, 200);
		PilaTorres a=new PilaTorres();
		PilaTorres e1=new PilaTorres();
		PilaTorres i=new PilaTorres();
		
		// creando los arrays
		int[] torre1=new int[opcion];
		int[] torre2=new int[opcion];
		int[] torre3=new int[opcion];
		for(int y=0;y<opcion;y++){
			torre1[y]=1;
			torre2[y]=0;
			torre3[y]=0;
			
		}
		
		
		
		
		
		
		if(opcion==3){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			repaint();
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			
		}else if(opcion==4){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			repaint();
			
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
		}else if(opcion==5){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			panel.add(eti5);
			repaint();
			
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
			a.push(eti5);
			
			
		}else if(opcion==6){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			panel.add(eti5);
			panel.add(eti6);
			repaint();
			
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
			a.push(eti5);
			a.push(eti6);
		}else if(opcion==7){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			panel.add(eti5);
			panel.add(eti6);
			panel.add(eti7);
		    repaint();
		   
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
			a.push(eti5);
			a.push(eti6);
			a.push(eti7);
		}else if(opcion==8){
			panel.add(eti1);
			panel.add(eti2);
			panel.add(eti3);
			panel.add(eti4);
			panel.add(eti5);
			panel.add(eti6);
			panel.add(eti7);
			panel.add(eti8);
			repaint();
			
			a.push(eti1);
			a.push(eti2);
			a.push(eti3);
			a.push(eti4);
			a.push(eti5);
			a.push(eti6);
			a.push(eti7);
			a.push(eti8);
		}
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		panel.add(boton5);
		panel.add(boton6);
		panel.add(dt1at2);
		panel.add(dt1at3);
		panel.add(dt2at1);
		panel.add(dt2at3);
		panel.add(dt3at2);
		panel.add(dt3at1);
		panel.add(boton7);
		repaint();
		JLabel tiempo=new JLabel();
		
		
		//accion del boton ejemplo
		boton6.addActionListener(new ActionListener(){
            @SuppressWarnings("unused")
			@Override
            public void actionPerformed(ActionEvent e){
            	
            	
               Ejemplo nuevo=new Ejemplo();
               nuevo.correr();
               
				
			
            }
		}
        );
		//accion del boton Instrucciones
		boton4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Instruc instruc=new Instruc();
				
			}
			
		});
		
		
		//accion del boton torre1 mover a torre 2
				dt1at2.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						check.dt1at2(a, e1, torre1, torre2,opcion);
						check.aumentar2();
						
						check.mostrarArrays(torre1, torre2, torre3, opcion);
						check.movimientos(movimientos);
						check.comprobar(opcion,tt);
					}
					
				});
		// accion del boton torre1 mover a torre 3
				dt1at3.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						check.dt1at3(a, i, torre1, torre3);
						check.aumentar3();
				        
						check.movimientos(movimientos);
						check.mostrarArrays(torre1, torre2, torre3, opcion);
						check.comprobar(opcion, tt);
					}
					
				});
				
				// accion del boton torre2 mover a torre 1
				dt2at1.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						check.dt2at1(e1, a, torre2, torre1,opcion);
						check.decrementar2();
						check.mostrarArrays(torre1, torre2, torre3, opcion);
						check.movimientos(movimientos);
						check.comprobar(opcion, tt);
					}
					
				});
				
				
				// accion del boton torre2 mover a torre 1
				dt2at3.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						check.dt2at3(e1, i, torre2, torre3,opcion);
						check.aumentar3();
						check.decrementar2();
						check.mostrarArrays(torre1, torre2, torre3, opcion);
						check.movimientos(movimientos);
						
						check.comprobar(opcion, tt);
					}
					
				});
				
				// accion del boton dt3at1
				dt3at1.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						check.dt3at1(i, a, torre3, torre1,opcion);
					
						check.movimientos(movimientos);
						check.decrementar3();
						check.mostrarArrays(torre1, torre2, torre3, opcion);
						check.comprobar(opcion, tt);
					}
					
				});
				// accion del boton dt3at2
				dt3at2.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						check.dt3at2(i, e1, torre3, torre2,opcion);
						check.aumentar2();
						check.decrementar3();
					   
						check.movimientos(movimientos);
						check.comprobar(opcion,tt);
						check.mostrarArrays(torre1, torre2, torre3, opcion);
					}
					
				});
				
				// accion del boton Punteos
				boton5.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						Punteos p= new Punteos();
						p.Archivo();
							
						
					}
									});
				
				// accion del boton Punteos
				boton7.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						
						Instrucciones in=new Instrucciones();
						
							
						
					}
					
				});
				
		//cronometro
		int ss = 0,h=0,m=0;
		
		
	     while(true){
			 if(ss==59){
				 ss=0;
				 m++;
			 }if(m==59){
				 m=0;
			 h++;
			 }
			 ss++;
			String h1=Integer.toString(h);
			String m1=Integer.toString(m);
			String s1=Integer.toString(ss);
			tiempo.setText(h1+":"+m1+":"+s1);
			panel.add(tiempo);
			Thread.sleep(1000);
			String m2=h1+":"+m1+":"+s1;
			tiempo.setBounds(1200,0,150,50);
		  
		   
		 }
		                 
		}
	
	

	public static void main(String[] args) throws InterruptedException{
		Ventana ventana=new Ventana();
		
	}



		
	}


