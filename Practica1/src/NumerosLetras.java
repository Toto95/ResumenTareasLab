import java.util.Scanner;
import java.util.Random;
public class NumerosLetras {

	public static void convertir() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese limite inferior y limite superior");
          int li,lf=0;
           String[] Unidades={ "Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};
           String[] Dieci={ "Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Dieciocho","Diecinueve"};
           String[] Decenas={ "Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa","Cien"};
           String[] Veintenas={ "Veintiuno","Veintidos","Veintitres","Veinticuatro","Veinticinco","Veintiseis","Veintisiete","Veintiocho","Veintinueve"};
           Scanner s=new Scanner(System.in);
           li=s.nextInt();
           lf=s.nextInt();
           int num=(int)(Math.random()*(lf-li)+li);
           if(num>0 && num<10){
        	   System.out.println(Unidades[num-1]);
           }
           if(num>10 && num<20 ){
        	   System.out.println(Dieci[num-11]);
        	   
           }
           if(num>20 && num<30){
        	   System.out.println(Veintenas[num-21]);
           }
           if(num>=30 ){
        	   System.out.println(Decenas[(num/10)-1]+" "+"y"+" "+Unidades[(num%10)-1]);
        	   
          
           }
           
	}

}
