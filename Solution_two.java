import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
  

      
  
public class Solution_two{
	 private final static Logger LOGGER = 
             Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void moveFile(String src, String dest ) {
        Path result = null;
        try {
           result = Files.move(Paths.get(src), Paths.get(dest));
        } catch (IOException e) {
           System.out.println("Exception while moving file: " + e.getMessage());
        }
        if(result != null) {
        	LOGGER.log(Level.INFO, "File successfully moved");
        }else{
        	LOGGER.log(Level.INFO, "File movement process failed");
        }
     }
  
   public static void main(String[] args) throws IOException {
	  ArrayList <String>li=new ArrayList<String>();
	  String loc="C:\\Users\\gowthamd\\Desktop\\Task";
	  File f=new File(loc);
	  String name=f.getName();
      Stream<Path> path = Files.walk(Paths.get(loc));
      
      System.out.println("List of PDF files:");
      path = path.filter(var -> var.toString().endsWith(".pdf"));
      path.forEach(System.out::println);   
      
      path = Files.walk(Paths.get(loc));
      System.out.println("List of PNG files:");
      path = path.filter(var -> var.toString().endsWith(".png"));
      path.forEach(System.out::println);    
      path = Files.walk(Paths.get(loc));
      System.out.println("List of text files:");
      path = path.filter(var -> var.toString().endsWith(".txt"));
      path.forEach(System.out::println);      
      path = Files.walk(Paths.get(loc));
      System.out.println("List of word files:");
      path = path.filter(var -> var.toString().endsWith(".docx"));
      path.forEach(System.out::println);      
    }
}