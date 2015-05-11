import java.util.Scanner;
public class Tablas {

	public static void primaria(){
		// TODO Auto-generated method stub
      int numero=0;
      System.out.println("ingrese un número entre 0 y 10");
      Scanner s=new Scanner(System.in);
      numero=s.nextInt();
	  for(int i=0;i<10;i++){
		  System.out.println(numero+"X"+(10-i)+"="+(numero*(10-i)));
	  }
	}

}
