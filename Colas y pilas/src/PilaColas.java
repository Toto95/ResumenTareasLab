	import java.util.ArrayList;
import java.util.ArrayList;
public class PilaColas {


	
			
	private ArrayList<Object> pila=new ArrayList();
	public void offer(Object o ){
		pila.add(o);
	}
	     public Object poll(){
		 if(!(pila.isEmpty())){
			 Object o= pila.get(0);
			 pila.remove(0);
			 Object e= pila.get(0);
			 return e;
		 }else{
			 return null;
		 }
	}
	     public Object peek(){
	    	 if(!(pila.isEmpty())){
	    		 return pila.get(0);
	    		 
	    	 }else{
	    		 return null;
	    	 }
	     }
	     public ArrayList<Object> auxiliar=new ArrayList();
	 	public void recibe(Object e){
	 		auxiliar.add(e);
	 	}
	 	public Object poll2(){
	 		if(!(auxiliar.isEmpty())){
	 			Object e = auxiliar.get(0);
	 			auxiliar.remove(0);
	 			
	 			return e;
	 		}else{
	 			return null;
	 		}
	 	}
	 	public Object peek2(){
	 		if(!(auxiliar.isEmpty())){
	 			return auxiliar.get(0);
	 			
	 		}else{
	 			return null;
	 		}
	 	}
	 	
	 	public static void main(String args []){
	 		PilaColas colaPila=new PilaColas();
	 		colaPila.offer("Uno");
	 		colaPila.offer("Dos");
	 		colaPila.offer("Tres");
	 		colaPila.offer("Cuatro");
	 		while(colaPila.peek2()!=null){
	 			System.out.println(colaPila.peek2());
	 		}
	 	}
	}




