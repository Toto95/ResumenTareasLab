import java.util.Scanner;

public class Abecedario {

	public static void acertijo() {
		
		// TODO Auto-generated method stub
		String var;
		System.out.println("Ingrese su letra preferida");
		Scanner s=new Scanner(System.in);
		String comparada=null;
		var=s.next();
		while(comparada!=var){
			System.out.println("Ingrese una letra");
		comparada=s.next();
		if(comparada.compareTo(var)>0)
			System.out.println("Está antes");
		if(comparada.compareTo(var)<0)
			System.out.println("Está despues");
		if(comparada.compareTo(var)==0)
			                break;
			 
		}
		System.out.println("Gano");
		 
		
		}
		 }

	


