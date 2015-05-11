
public class ListaCircularDoble {
	CosaC  uno;
	CosaC dos;
	CosaC ultima;
	CosaC primera;
	ListaCircularDoble(){
		uno=null;
		dos=null;
	}

	public void insertar(String dato){
		CosaC nuevo= new CosaC(dato);
		if(uno==null){
			uno=nuevo;
			dos=nuevo;
			primera=nuevo;
		}else{
			dos.prox=nuevo;
			nuevo.ant=dos;
			dos=nuevo;
			
			}	
		}

	public void mostrar(){
		CosaC actual=uno;
		
	    ultima=dos;
		System.out.print(ultima.getDato()+"->");
		
		while(actual!=dos){
			
			System.out.print(actual.dato+"-><-");
			actual=actual.prox;
			
			
		}


		System.out.print(actual.dato+"->"+primera.getDato());
		
	}
            public static void main(String args[]){
            	ListaCircularDoble li=new ListaCircularDoble();
            	li.insertar("yo soy uno");
            	li.insertar("yo soy dos");
            	li.insertar("yo soy tres");
            	li.insertar("yo soy cuatro");
            	li.mostrar();
            	
            }
}
