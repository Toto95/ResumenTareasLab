import java.util.Scanner;
public class Calculadora {

	public static void calculo() {
		// TODO Auto-generated method stub
       float a,b=0;
       System.out.println("Ingrese dos numeros y la primera letra de la operaci�n que desea realizar.");
       Scanner s=new Scanner(System.in);
       a=s.nextFloat();
       b=s.nextFloat();
       String t=s.next();
       char o=t.charAt(0);
       if(o=='s'){
    	   System.out.println("La suma es:"+(a+b));
       }
       if(o=='r'){
    	   System.out.println("La resta es:"+(a-b));
       }
       if(o=='m'){
    	   System.out.println("La multiplicaci�n es:"+a*b);
       }else{
    	   System.out.println("La Divisi�n es:"+(a/b));
       }
       
       
       
	}

}
