/* Program to copy a src file to destination. 
The name of src file and dest file must be 
provided using command line arguments where 
args[0] is the name of source file and 
args[1] is name of destination file */

import java.io.*; 
class Command_line_copy 
{ 
	public static void main(String args[]) 
	throws FileNotFoundException,IOException 
	{ 
		/* If file doesnot exist FileInputStream throws 
		FileNotFoundException and read() write() throws 
		IOException if I/O error occurs */
		FileInputStream fis = new FileInputStream(args[0]); 

		/* assuming that the file exists and need not to be 
		checked */
		FileOutputStream fos = new FileOutputStream(args[1]); 

		int b; 
		while ((b=fis.read()) != -1) 
			fos.write(b); 

		/* read() will readonly next int so we used while 
		loop here in order to read upto end of file and 
		keep writing the read int into dest file */
		fis.close(); 
		fos.close(); 
	} 
} 
