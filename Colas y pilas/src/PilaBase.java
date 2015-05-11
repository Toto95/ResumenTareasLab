import java.util.ArrayList;


public class PilaBase {
private ArrayList<Object> eo= new ArrayList();
	
	public void push(Object o){
		
	eo.add(o);
	
	}

	
	public Object pop(){
		

	       if(!(eo.isEmpty())){
               Object o = eo.get(eo.size()-1);
               eo.remove(eo.size()-1);
               return o;
       }else{
               return null;
       }
	       
	}

	public Object peek(){
		
		
		 if(!(eo.isEmpty())){
             return eo.get(eo.size()-1);
     }else{
             return null;
     }
		 
	}

	public boolean empty(){
		
		 return eo.isEmpty();
	}

}

