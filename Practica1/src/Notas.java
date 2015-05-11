import java.util.Scanner;
public class Notas {
	public static void calcular(){
		int nota=0;
		int sum=0;
		System.out.println("Ingrese sus notas");
		for(int i=0;i<6;i++){
		Scanner s=new Scanner(System.in);
		nota=s.nextInt();
		sum=sum+nota;
		}
		int prom=sum/6;
		if(prom>=0 && prom<59)
			System.out.println("Su nota es E");
		else if(prom>=60 && prom<69)
			System.out.println("Su nota es D");
		else if(prom>=70 && prom<79)
			System.out.println("Su nota es C");
		else if(prom>=80 && prom<89)
			System.out.println("Su nota es B");
		else if(prom>=90 && prom<=100)
			System.out.println("Su nota es A");
		
	}

}
