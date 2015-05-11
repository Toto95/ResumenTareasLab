
public class ListaCircular {
    NodoC inicio;
    NodoC primero;
    public ListaCircular(){
    	inicio=null;
    	primero=null;
    }
    public void insertar(String nombre){
    	NodoC nuevo= new NodoC(nombre);
    	if(inicio==null){
    		inicio=nuevo;
    		primero=nuevo;
    	}else{
    		NodoC it= inicio;
    		while(it!=null){
    			 if(it.siguiente==null){
    				 it.siguiente=nuevo;
    				 break;
    			 }else{
    				 it=it.siguiente;
    			 }
    		}
    	}
    }
    public void mostrar(){
    	NodoC it=inicio;
    	String lista="";
    	String primerol=primero.getNombre();
    	
    	while(it!=null){
    		lista+=it.getNombre()+"->";
    		it=it.siguiente;
    	}
    	
    	System.out.print(lista);
    	System.out.print(primerol);
    }
    public static void main(String args []){
    	ListaCircular l=new ListaCircular();
    	l.insertar("Hola");
    	l.insertar("dos");
    	l.insertar("otro");
    	l.insertar("mija");
    	l.mostrar();
    	
    }
}
