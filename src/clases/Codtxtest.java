package clases;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * Esta clase va orientada a la letura dee txt y guardar txt de estudiantes pero se planea modificar
 * luego para que sirva tambien para los txt de profesores y materias
 * @author Ideapad 320
 *
 */
public class Codtxtest {
	 public void comprobarBd(File FicheroProducto){
	        try
	      {
	        
	        if(!FicheroProducto.exists()){
	            FicheroProducto.createNewFile();
	            System.out.println("Creacion de archivo txt completada");
	        }else{System.out.println("El archivo txt existe");}
	       }catch (IOException ex) 
	       {  
	          System.out.println(ex.getMessage());  
	       }
	     }
	 /**
	  * Esto se usara luego en la clase profesor
	  * @param usuario
	  * @param password
	  * @param id
	  * @param grado
	  * @param nombre
	  * @param apellido
	  * @param FicheroProducto
	  */
	   public void InsertarEstudiante(String usuario,String password,String id,String grado,String nombre, String apellido,float n1,float n2, float n3,float n4, File FicheroEstudiante){
	         try
	      {  

	          BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FicheroEstudiante,true), "utf-8"));  
	          Fescribe.write(usuario+";"+password+";"+id+";"+grado+";"+nombre+";"+apellido+";"+n1+";"+n2+";"+n3+";"+n4+"\r\n");  
	           System.out.println("El producto a sido insertado en la base de datos");            
	          Fescribe.close();
	          
	        }
	        catch (IOException ex) 
	       {    
	          System.out.println(ex.getMessage());  
	       }
	      } 
	   public void DetxtAestudiante(File FicheroEstudiante, ArrayList<Codestudiante> usuarios)
	     {
	        try
	        {
	         String linea = null;
	         BufferedReader leerFichero = new BufferedReader (new FileReader(FicheroEstudiante));    
	         while( (linea = leerFichero.readLine()) != null)
	         {
	            StringTokenizer mistokens = new StringTokenizer(linea, "|");
	            String  usuario =  mistokens.nextToken().trim();
	            String  password =  mistokens.nextToken().trim();
	            String  id =  mistokens.nextToken().trim();
	            String  grado =  mistokens.nextToken().trim();
	            String  nombre =  mistokens.nextToken().trim();
	            String  apellido =  mistokens.nextToken().trim();
	            String  n1 =  mistokens.nextToken().trim();
	            String  n2 =  mistokens.nextToken().trim();
	            String  n3 =  mistokens.nextToken().trim();
	            String  n4 =  mistokens.nextToken().trim();
	            
	            float opn1 =Float.parseFloat(n1);
	            float opn2 =Float.parseFloat(n2);
	            float opn3 =Float.parseFloat(n3);
	            float opn4 =Float.parseFloat(n4);
	            Codestudiante aux= new Codestudiante(nombre, apellido, id, grado, usuario, password,opn1,opn2,opn3,opn4);

	            usuarios.add(aux);
	            
	            }
	         leerFichero.close();
	       
	       }catch (Exception ex) 
	       {  
	          System.out.println(ex.getMessage());  
	       }
	      }     
	   public void ActualizarArraList(File FicheroEstudiante, ArrayList<Codestudiante> usuarios)
	   {
		  usuarios.clear();
	      DetxtAestudiante(FicheroEstudiante,usuarios); 
	   }
	   /**
	    * Esto se uso para probar que si funcionaba
	    * @param FicheroProducto
	    * @param usuarios
	    */
	   public void MostrarEstudiantes(File FicheroEstudiante, ArrayList<Codestudiante> usuarios){
	  System.out.println("___________________");     
	  for(Codestudiante n:usuarios){
	   System.out.println("Usuario:"+n.getUsuario()+"\n"+"Password:"+n.getPassword()+"\n"+"Id:"+n.getId()+"\n"+ "Grado:"+ n.getGrado()+"\n"+ "Nombre:"+ n.getNombre()+"\n"+ "Apellido:"+ n.getApellido()+"\n"+ "Apellido:"+ n.getN4());
	  }  
	  System.out.println();
	  }
}

