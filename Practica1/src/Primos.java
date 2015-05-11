import java.util.Scanner;
public class Primos {

	static boolean esPrimo(int num){
		for(int j=2;j<num;j++)
			if(num%j==0)
				return false;
		return true;
		
	}
	public static void conversor() {
		int num=0;
		int contador=0;
		int i=0;
		System.out.println("ingrese un número");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(i=1;i<num;i++){
			if(esPrimo(num-i))
				contador++;
		}
		System.out.println("La cantidad de números primos entre 1 y"+" "+num+" "+"es de:");
		System.out.println(contador-1);
	}
	}


