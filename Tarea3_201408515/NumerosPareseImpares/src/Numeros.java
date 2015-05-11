import java.util.Scanner;
public class Numeros {
	
	public static void main(String args[]){
		System.out.println("Ingrese un número");
		Scanner e= new Scanner(System.in);
		
			int num1=e.nextInt();
		
	if(num1%2==0){
		System.out.println("El número es par");
	}else
		System.out.println("El número es impar");
	
	}

}
