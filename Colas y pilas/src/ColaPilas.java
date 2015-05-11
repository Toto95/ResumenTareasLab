
public class ColaPilas {
	
public static void main(String args []){
	 PilaBase base=new PilaBase();
     PilaBase aux=new PilaBase();
     
		System.out.println("COLA A BASE DE PILAS PILAS");

		base.push("uno");
		base.push("dos");
		base.push("tres");
		base.push("cuatro");
		base.push("cinco");
		
		
		aux.push(base.pop());
		aux.push(base.pop());
		aux.push(base.pop());
		aux.push(base.pop());
		aux.push(base.pop());
		while(aux.empty()==false){ 
			System.out.println(aux.pop()); 
		}
}

	}


