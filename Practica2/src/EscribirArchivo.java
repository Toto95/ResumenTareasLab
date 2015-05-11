import java.io.*;


public class EscribirArchivo {
      public void escribir(String nombre,int punteo, String tiempo,int opcion){
    	  File f;
    	  f=new File("Punteos.txt");
    	  try{
    		  FileWriter w=new FileWriter(f,true);
    		  BufferedWriter cw=new BufferedWriter(w);
    		  PrintWriter c=new PrintWriter(cw);
    		  c.write("Nombre"+"          "+"Movimientos realizados"+"          "+"Tiempo" +"               "   +"No. Discos"+"\r\n");
    		  c.write(nombre+"                  "+punteo+"                       "+tiempo+"             "+opcion+"\r\n");
    		  c.append(" ");
    		  c.close();
    		  cw.close();
    	  }catch(IOException e){};
      }
      
}
