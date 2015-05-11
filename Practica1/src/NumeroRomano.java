import java.util.Scanner;
public class NumeroRomano {

	public static void equivalencia() {
		// TODO Auto-generated method stub
		
		int num=0;
		System.out.println("Ingrese un número");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
        String[] Unidades={" ","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] Decenas={" ","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] Centenas={" ","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] Millares={" ","M","MM","MMM"};
        if(num<10)
        	System.out.println(Unidades[num]);
        if(num>=10 && num<100)
        	System.out.println(Decenas[((num/10))]+Unidades[(num%10)]);
        if(num>=100 && num<1000)
        	System.out.println(Centenas[(num/100)]+Decenas[((num%100)/10)]+Unidades[(((num%100))%10)]);
        if(num>=1000)
        	System.out.println(Millares[(num/1000)]+Centenas[(((num%1000)/100))]+Decenas[(((num%1000)%100)/10)]+Unidades[((((num%1000)%100)%10))]);
	}

}
