import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; 
public class Solution_three {
//	public static void moveFile(String src, String dest ) {
//        Path result = null;
//        try {
//           result = Files.move(Paths.get(src), Paths.get(dest));
//        } catch (IOException e) {
//           System.out.println("Exception while moving file: " + e.getMessage());
//        }
//        if(result != null) {
//           System.out.println("File moved successfully.");
//        }else{
//           System.out.println("File movement failed.");
//        }
//     }

	public static void main(String[] args) {
	 
	  Solution_three sc=new Solution_three();
	  System.out.println("Documents");
	  System.out.println("-----------------");
	  File folder=new File("C:\\Users\\gowthamd\\Desktop\\Task");
	  sc.getFileType(folder,"txt");
	  System.out.println("Images");
	  System.out.println("-----------------");
	  sc.getFileType(folder,"png");
	  System.out.println("-----------------");
	  System.out.println("-----------------");
	  sc.getFileType(folder,"mp4");
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


