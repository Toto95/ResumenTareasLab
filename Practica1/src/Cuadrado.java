import java.util.Scanner;
public class Cuadrado {

	public static void imprimir() {
		// TODO Auto-generated method stub
      int num=0;
      System.out.println("Ingrese el tamaño");
      Scanner s=new Scanner(System.in);
      num=s.nextInt();
      for(int i=1;i<=num;i++){
    	  for(int j=1;j<=num;j++){
        	  if(j==1||j==num||i==1||i==num){
        		  System.out.print("* ");
        	  }else{
        		  System.out.print("  ");
        	  }
    	  
    	   }
      
    	  System.out.print("\n");
    	  }
         
     }
}
