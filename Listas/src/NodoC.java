
public class NodoC {
	String nombre;
	NodoC siguiente;
	
	public NodoC(){
		this.nombre="";
		this.siguiente=null;
	}
	public NodoC(String nombre){
		this.nombre=nombre;
		this.siguiente=null;
	}
	public String getNombre(){
		return nombre;
	}
	public NodoC getNodoC(){
		return siguiente;
	}

}
