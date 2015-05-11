import java.util.Scanner;
import java.math.*;
public class Areas {

	public static void figuras() {
		// TODO Auto-generated method stub
		
       System.out.println("Ingrese sus parametros");
       Scanner s=new Scanner(System.in);
       String caracteres=s.next();
       String letra=caracteres.substring(0,1);
       String numero=caracteres.substring(2);
       char p=letra.charAt(0);
       double x=Double.parseDouble(numero);
       if(p=='C'){
    	   double ac=3.1416*x*x;
    	   double pc=2*3.1416*x;
    	   System.out.println("El area es:"+ac+"\n"+"El perimetro es:"+pc+"\n"+"El radio es:"+x);
       }
       if(p=='U'){
    	   double acu=x*x;
    	   double pcu=4*x;
    	   System.out.println("El area es:"+acu+"\n"+"El perimetro es:"+pcu);
       }
       if(p=='T'){
    	   double pt=3*x;
    	   double ht=Math.sqrt(Math.pow(x, 2)-Math.pow(x/2, 2));
    	   double at=0.5*x*ht;
    	   System.out.println("El area es:"+at+"\n"+"El perimetro es:"+pt+"\n"+"La altura es:"+ht);
       }
      
    	   
       
	}

}
