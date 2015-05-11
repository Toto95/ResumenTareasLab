
public class CosaC {
	
		 String dato;
	     CosaC prox;
		 CosaC ant;

		
		 public CosaC(){
			 this.dato="";
			 this.prox=null;
			 this.ant=null;
		 }
		 CosaC(String dato) {
			 
			 this.dato=dato;
			 this.ant=null;
			 this.prox=null;
		}
		 public String getDato(){
			 return dato;
		 }
		 public CosaC getCosa1(){
			 return ant;
		 }
		 public CosaC getCosa2(){
			 return prox;
		 }
		}

