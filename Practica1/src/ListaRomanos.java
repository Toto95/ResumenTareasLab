import java.util.Scanner;
public class ListaRomanos {
	

	public static void listando() {
		String variablea;
		int num1;
		int num2;
		int num3;
		int num4;
		System.out.println("Ingrese cuatro números romanos");
		Scanner s=new Scanner(System.in);
		variablea=s.next();
		String variablea1=s.next();
		String variablea2=s.next();
		String variablea3=s.next();
		num1=RomanoANumero.conversor(variablea);
		num2=RomanoANumero.conversor(variablea1);
		num3=RomanoANumero.conversor(variablea2);
		num4=RomanoANumero.conversor(variablea3);
		
		if(num1>num2 && num1>num3 && num1>num4){
			System.out.println("El mayor es:");
		ALetras.convirtiendolos(num1);
		}else if(num2>num1 && num2>num3 && num2>num4){
			System.out.println("El mayor es:");
		 ALetras.convirtiendolos(num2);
		}else if(num3>num1 && num3>num2 && num3>num4){
			 System.out.println("El mayor es:");
		 ALetras.convirtiendolos(num3);
		}else{
			System.out.println("El mayor es:");
			ALetras.convirtiendolos(num4);
				
           	}
		if(num1<num2 && num1<num3 && num1<num4){
			System.out.println("El menor es:");
		ALetras.convirtiendolos(num1);
		}else if(num2<num1 && num2<num3 && num2<num4){
			System.out.println("El menor es:");
		 ALetras.convirtiendolos(num2);
		}else if(num3<num1 && num3<num2 && num3<num4){
			 System.out.println("El menor es:");
		 ALetras.convirtiendolos(num3);
		}else{
			System.out.println("El menor es:");
			ALetras.convirtiendolos(num4);
				
           	}
		
	}	

}