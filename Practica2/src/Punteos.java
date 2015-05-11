import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;


public class Punteos {
  public void Archivo(){
	  abrir();
  }
  public void abrir(){
	  
	  
	  File f=new File("Punteos.txt");
	  try{
		  Runtime.getRuntime().exec("rundll32url.dll,FileProtocolHandler"+f.getAbsolutePath());
	  }catch(Exception e){}
  }
}
