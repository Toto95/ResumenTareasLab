
import java.util.Scanner;
public class PiramideInversaNumeros {

	public static void numeroInvertidos() {
		int tamaño=0;
		System.out.println("Ingrese el tamaño");
		Scanner s=new Scanner(System.in);
		tamaño=s.nextInt();
		for(int i=1;i<=tamaño;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			int car=tamaño+1-i;
			for(int h=car;h>0;h--)
				System.out.print(tamaño-(tamaño-i)+" ");
			System.out.println(" ");

		}
		}

}