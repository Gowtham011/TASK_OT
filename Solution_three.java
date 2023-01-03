import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
import java.util.stream.Stream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
  
public class Solution_three {
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

	public static void main(String[] args) {
	 
	  Solution_three sc=new Solution_three();
	  System.out.println("Documents");
	  System.out.println("-----------------");
	  File folder=new File("C:\\Users\\gowthamd\\Desktop\\Task");
	  sc.getFileType(folder,"txt");
	  moveFile("C:\\Users\\gowthamd\\Desktop\\Task","C:\\Users\\gowthamd\\Desktop\\Task two");
	  System.out.println("Images");
	  System.out.println("-----------------");
	  sc.getFileType(folder,"png");
	  moveFile("C:\\Users\\gowthamd\\Desktop\\Task","C:\\Users\\gowthamd\\Desktop\\Task two");
	  System.out.println("-----------------");
	  System.out.println("-----------------");
	  sc.getFileType(folder,"mp4");
	  moveFile("C:\\Users\\gowthamd\\Desktop\\Task","C:\\Users\\gowthamd\\Desktop\\Task two");
	  System.out.println("-----------------");
	}
	 
	public  void getFileType(File folder,String filterExt)
	{
	  MyExtFilter extFilter=new MyExtFilter(filterExt);
	  if(!folder.isDirectory())
	  {
	   System.out.println("Not a folder");
	  }
	  else
	  {

	   String[] list = folder.list(extFilter);
	 
	   if (list.length == 0) {
	    System.out.println("0 files found!!");
	    return;
	   }
	 
	   for (int i = 0; i < list.length; i++) {
	    System.out.println("File Name :"+list[i]);
	   }
	  }
	}
	 
	  public class MyExtFilter implements FilenameFilter {
	 
	   private String ext;
	 
	   public MyExtFilter(String ext) {
	    this.ext = ext;
	   }
	 
	   public boolean accept(File dir, String name) {
	    return (name.endsWith(ext));
	   }
	  }
	}


