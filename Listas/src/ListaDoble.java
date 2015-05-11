
public class ListaDoble {
Cosa  uno;
Cosa dos;
ListaDoble(){
	uno=null;
	dos=null;
}

public void insertar(String dato){
	Cosa nuevo= new Cosa(dato);
	if(uno==null){
		uno=nuevo;
		dos=nuevo;
	}else{
		dos.prox=nuevo;
		nuevo.ant=dos;
		dos=nuevo;
		
		}	
	}

public void mostrar(){
	Cosa actual=uno;
	
	
	while(actual!=dos){
		System.out.print(actual.dato+"-><-");
		actual=actual.prox;
	}
	System.out.println(actual.dato);
	
}
public static void main(String args []){
	ListaDoble lista=new ListaDoble();
	lista.insertar("hola");
	lista.insertar("mundo");
	lista.insertar("JJJJJJJJJJJ");
	lista.insertar("jejejje");
	lista.insertar("Uno");
	lista.insertar("Sapo");
	lista.mostrar();
	lista.mostrar();
	lista.insertar("Toto");
	lista.mostrar();
	
}
}


