import java.io.*;


class command_line1 
{   
   public static void main(String[] args) 
   {
      
      if (args.length == 0) 
	  {
          System.out.println("Usage:   java 1command_line <file-names>");
          return;
      }
      
      for (int i = 0; i < args.length; i++) {
         System.out.print(args[i] + ":  ");
         countLines(args[i]);
      }
      
   }  
   
  
   private static void countLines(String fileName) {
      
      try(BufferedReader in = new BufferedReader( new FileReader(fileName) )) {
        
         int lineCount = 0;
		String line = in.readLine();  		 
         while (line != null) {
             lineCount++;               
             line = in.readLine();     
         }
         System.out.println(lineCount + " lines");

      }
      catch (FileNotFoundException e) {
          System.out.println("Error.  Can't open file.");
      }
      catch (Exception e) {
         System.out.println("Error.   Problem with reading from file.");
      }
   
   }  
   

} 