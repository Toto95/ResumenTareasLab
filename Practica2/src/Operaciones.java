import javax.swing.JLabel;
import javax.swing.JOptionPane;
          
public class Operaciones {
       
       String tiempo;
	
	 int clave=0;
	
	

	         
	// contadores
	int contadorTorre2=0;
	int contadorTorre3=0;
	int movimientos=0;
	public void aumentar2(){
		contadorTorre2++;
		
	}
	public void decrementar2(){
		contadorTorre2--;
	}
	public void aumentar3(){
		contadorTorre3++;
	}
	
	public void decrementar3(){
		contadorTorre3--;
	}
	public String ejecutar(){
	while(contadorTorre2!=clave && contadorTorre3!=clave){
		int ss = 0,h=0,m=0;
			    
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
			return tiempo=h1+":"+m1+":"+s1;
	}
	return tiempo;
	
	}
	
	
	public void movimientos(int m){
		m++;
	}

	
	
	     
	  
	
	public int[] niveles={475,400,325,250,175,100,25,-50};
	
	
	 
	   
	   public void mostrarArrays(int[] g,int[] b5,int[] w,int opcion){
		   for(int t=0;t<opcion;t++){
			   System.out.print(g[t]);
			   
			/*   System.out.println(" ");
		   System.out.print(b5[t]);
		   System.out.println(" ");
		   System.out.print(w[t]);*/
	   }
		   System.out.println(" ");
		   for(int t=0;t<opcion;t++){
			   System.out.print(b5[t]);
		   }
		   
		   System.out.println(" ");
		   for(int t=0;t<opcion;t++){
			   System.out.print(w[t]);
		   }
		   System.out.println(" ");
		   System.out.println("Otro ciclo");
		   System.out.println(opcion);
		   
	   }
	   public void dt1at2(PilaTorres a,PilaTorres b,int[] a1,int[] b1,int p){
		   JLabel c=a.peek();
		   b.push(a.pop());
		   int i=0;
		   while(b1[i]!=0){
			   i++;
		   }
		   int e=0;
		   while(a1[e]!=1){
			   ++e;
		   }
		 c.setLocation(510,niveles[i]);
		
		movimientos++;
		 a1[e]=0;
		 b1[i]=1;
						
	   }

        
public void dt1at3(PilaTorres a,PilaTorres b,int[] a1,int[] b1){
	   JLabel c=a.peek();
	   b.push(a.pop());
	   int i=0;
	   while(b1[i]!=0){
		   i++;
	   }
	  movimientos++;
	  int e=0;
	   while(a1[e]!=1){
		   ++e;
	   }
	   c.setLocation(920, niveles[i]);
	   a1[e]=0;
	   b1[i]=1;
	   
	   
}
public void dt2at1(PilaTorres a,PilaTorres b,int[] a1,int[] b1,int tamaño){
	   JLabel c=a.peek();
	   b.push(a.pop());
	   int r=0;
	   int j=tamaño-1;
	   while(b1[j]!=0){
		   j--;
		   r++;
	   }
	   c.setLocation(510,niveles[r]);
		 movimientos++;
	   int i=0;
	   while(b1[i]!=0){
		   i++;
	   }
	   int e=0;
	   while(a1[e]!=1){
		   ++e;
	   }
	   a1[e]=0;
	   b1[r]=1;
	   
	   
	   c.setLocation(100, niveles[r]);
	  
	   
     }
	  
public void dt2at3(PilaTorres a,PilaTorres b,int[] a1,int[] b1,int tamaño){
	   JLabel c=a.peek();
	   b.push(a.pop());
	   int i=0;
	  
	   while(b1[i]!=0){
		   i++;
		   
	   }
	   int e=0;
	   while(a1[e]!=1){
		   ++e;
	   }
	  
		c.setLocation(920, niveles[i]);
	   a1[e]=0;
	   b1[i]=1;
	   movimientos++;
  }
	   public void dt3at1(PilaTorres a,PilaTorres b,int[]a1,int[] b1,int tamaño){
		   JLabel c=a.peek();
		   b.push(a.pop());
		   int o=0;
		   int i=tamaño-1;
		   while(b1[i]!=0){
			   i--;
			   o++;
		   }
		   int e=0;
		   while(a1[e]!=1){
			   ++e;
		   }
			
		   movimientos++;
		   c.setLocation(100, niveles[o]);
		   a1[e]=0;
		   b1[i]=1;
	   }
	   
	   public void dt3at2(PilaTorres a,PilaTorres b,int[]a1,int[] b1,int tamaño){
		   JLabel c=a.peek();
		   b.push(a.pop());
		   int i=0;
			  
		   while(b1[i]!=0){
			   i++;
			   
		   }
		   int e=0;
		   while(a1[e]!=1){
			   ++e;
		   }
		  
			c.setLocation(510, niveles[i]);
		   a1[e]=0;
		   b1[i]=1;
		   movimientos++;
	   }
	  
	   
	   public void comprobar(int opcion,String t){
			if(contadorTorre3==opcion || contadorTorre2==opcion){
			    String l=JOptionPane.showInputDialog("<<<<<<<<<<<<Felicidades Ganaste>>>>>>>>>>>>"+"\n Utilizaste"+" "+movimientos+" "+"movimientos"+"\n   Ingresa tu nombre");
			    EscribirArchivo e=new EscribirArchivo();
			    e.escribir(l, movimientos,tiempo,opcion);
			}
		}
	
}
