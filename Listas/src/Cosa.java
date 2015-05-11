
public class Cosa {
 String dato;
 Cosa prox;
 Cosa ant;
 public Cosa(){
	 this.dato="";
	 this.prox=null;
	 this.ant=null;
 }
 Cosa(String dato) {
	 
	 this.dato=dato;
	 this.ant=null;
	 this.prox=null;
}
 public String getDato(){
	 return dato;
 }
 public Cosa getCosa1(){
	 return ant;
 }
 public Cosa getCosa2(){
	 return prox;
 }
}
