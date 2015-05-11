import java.util.Scanner;

public class Rombo {

	  public static  void rombo(){
		int tamaño,car,i=0;
		System.out.println("ingrese el tamaño");
		Scanner s= new Scanner(System.in);
	    tamaño=s.nextInt();
	    for(i=1;i<=tamaño;i++){
	    	for(int j=tamaño-i;j>0;j--){
	    		System.out.print(" ");
	    		
	    		}
	    	car=2*(i-1)+1;
    		for(int b=car;b>0;b--){
    			System.out.print("*");
	    	}
	    	System.out.println(" ");
	    	//parte baja del rombo
	    }
	    for(int w=1;w<tamaño;w++){
	    	for(int b=1;b<=w;b++)
	    	System.out.print(" ");
	    	int ast=2*(tamaño-w)-1;
	    	for(int d=ast;d>0;d--)
	    		System.out.print("*");
	    	System.out.println(" ");
	    }
           
	}
}

