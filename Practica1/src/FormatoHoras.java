import java.util.Scanner;
public class FormatoHoras {
     
	public static void hora() {
		// TODO Auto-generated method stub
       int h=0;
       int m=0;
       System.out.println("Ingrese la hora de la forma 00:00");
       Scanner s=new Scanner(System.in);
       String cadena=s.next();
       String hor=cadena.substring(0,2);
       String min=cadena.substring(3);
       h=Integer.parseInt(hor);
       m=Integer.parseInt(min);
       
      if(h>=13){
    	  System.out.println(h-12+":"+m+" "+"P.M.");
      }else{
    	  System.out.println(h+":"+m+" "+"A.M.");
      }
	}

}
