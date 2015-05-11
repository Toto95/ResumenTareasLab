import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Elija la opción que desea realizar:");
		System.out.println("1 Imprimir un rombo. \n2 Calcular su nota.\n3 Cambiar el formato de la hora.\n4 Cálcular un area.\n5 Ingresar Fechas.\n6 Calculadora.\n7 Tabla de multiplicar.\n8 Número aleatorio en letras.\n9 Arabigo a Romano.\n10 Piramide de números.\n11 Lista de romanos.\n12 Cadena de texto en asteriscos.\n13 Juego del abecedario.\n14 Dibujar un cuadrado.\n15 Cantidad de números primos.\n16 Salir.");
		Scanner s=new Scanner(System.in);
		int opcion=0;
		
		while(opcion!=16){
			System.out.println("Elija la opción que desea realizar");
			opcion=s.nextInt();
          switch(opcion){
          case 1: Rombo.rombo();
                  break;
          case 2: Notas.calcular();
                  break;
          case 3: FormatoHoras.hora();
                  break;
          case 4: Areas.figuras();
                  break;
          case 5: Fechas.meses();
                  break;
          case 6: Calculadora.calculo();
                  break;
          case 7: Tablas.primaria();
                  break;
          case 8: NumerosLetras.convertir();
                  break;
          case 9: NumeroRomano.equivalencia();
                  break;
          case 10:PiramideInversaNumeros.numeroInvertidos();
                  break;
          case 11: ListaRomanos.listando();
                  break;
          case 12:CadenaAsteriscos.password();
                  break;
          case 13: Abecedario.acertijo();
                  break;
          case 14:Cuadrado.imprimir();
                  break;
          case 15: Primos.conversor();
                  break;
          case 16: break;
          }
		} 
	}

}
