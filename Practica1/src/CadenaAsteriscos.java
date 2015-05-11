import java.util.*;
public class CadenaAsteriscos {

	public static void password() {
		System.out.println("Ingrese la palabra");
		Scanner s=new Scanner(System.in);
		String palabra=s.next();
		for(int i=palabra.length();i>0;i--)
			System.out.print("*");
           System.out.println(" "+palabra);
	}
       
}
