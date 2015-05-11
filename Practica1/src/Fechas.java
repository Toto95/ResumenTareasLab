import java.util.Scanner;
public class Fechas {

	public static void meses() {
		int di,ai,mi,df,af,mf,dt,mt,at=0;
		
		System.out.println("Ingrese la fecha inicial de la forma \ndía\nmes\naño");
		Scanner s=new Scanner(System.in);
		di=s.nextInt();
		mi=s.nextInt();
		ai=s.nextInt();
		System.out.println("Ingrese la fecha final de la forma \ndía\nmes\naño ");
		df=s.nextInt();
		mf=s.nextInt();
		af=s.nextInt();
		if(di<df)
			 dt=df-di;
		else{
			dt=di-df;
		}
		if(mi<mf)
			mt=(mf-mi)*30;
		else{
			mt=(mi-mf)*30;
		}
		if(ai<af)
			at=(af-ai)*360;
		else{
			at=(ai-af)*360;
		}
		System.out.println("Días entre fechas="+(at+dt+mt));	
		

	}

}
