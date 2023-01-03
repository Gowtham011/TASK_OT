import java.util.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
  
public class Solution
{
	 private final static Logger LOGGER = 
             Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) {
	    HashMap<String,String>hm=new HashMap<>();
	    ArrayList<String>movies=new ArrayList<>();
	    ArrayList<String>songs=new ArrayList<>();
	    ArrayList<String>docs=new ArrayList<>();
		System.out.println("Enter File names");
		Scanner sc = new Scanner(System.in);
//		LOGGER.log(Level.INFO, "File names entered");
		String str[]=new String[5];
		
		for(int i=0;i<str.length;i++){
		    str[i]=sc.nextLine();
		}
        String fname="";
        String ss="";
        String ext="";
        for(int i=0;i<str.length;i++){
            fname=str[i];
            for(int j=0;j<fname.length();j++){
                ss=fname.split("\\.")[0];
                ext=fname.split("\\.")[1];
            }
            hm.put(ss,ext);
            
            // System.out.println(ss+"  "+ext);
        }
        LOGGER.log(Level.INFO, "Files are seperated on the basis of their TYPE");
		for(String i:hm.keySet()){
		    if((hm.get(i)).equals("mp4")){
		        movies.add(i+".mp4");
		        LOGGER.log(Level.INFO, "Files added to Movies Folder");
		    }
		    else if((hm.get(i)).equals("mp3")){
		        songs.add(i+".mp3");
		        LOGGER.log(Level.INFO, "Files added to Audios Folder");
		    }
		    else{
		        docs.add(i+"."+hm.get(i));
		        LOGGER.log(Level.INFO, "Files added to Documents Folder");
		    }
		}
		System.out.println("____________________________");
		System.out.println(movies);
		System.out.println("____________________________");
		System.out.println(songs);
		System.out.println("____________________________");
		System.out.println(docs);
		System.out.println("____________________________");
	}
}
