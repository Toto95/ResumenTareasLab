
import java.util.Scanner;
public class PiramideInversaNumeros {

	public static void numeroInvertidos() {
		int tama�o=0;
		System.out.println("Ingrese el tama�o");
		Scanner s=new Scanner(System.in);
		tama�o=s.nextInt();
		for(int i=1;i<=tama�o;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			int car=tama�o+1-i;
			for(int h=car;h>0;h--)
				System.out.print(tama�o-(tama�o-i)+" ");
			System.out.println(" ");

		}
		}

}