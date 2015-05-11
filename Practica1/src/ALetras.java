
public class ALetras {
	public static void convirtiendolos(int convirtiendo){
		String[] Unidades={" ","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez"};
		String[] Oncensa={"Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Dieciocho","Diecinueve"};
		String[] Decenas={" ","Diez","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
		if(convirtiendo>0 && convirtiendo<=10){
			 System.out.println(Unidades[convirtiendo]);
			
		}
		else if(convirtiendo>10 && convirtiendo<20){
			System.out.println(Oncensa[convirtiendo-11]);
		}else if(convirtiendo>=20 && convirtiendo<100 && convirtiendo%10==0){
			System.out.println(Decenas[convirtiendo/10]);
			
		}else if(convirtiendo>=20 && convirtiendo<100) {
		
			 System.out.println(Decenas[convirtiendo/10] +" "+"y"+" "+ Unidades[convirtiendo%10]);
		}
	}

}
