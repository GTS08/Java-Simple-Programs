import java.io.*;

public class Set2Askisi3
{
    public static void main(String args[])
    {
        try
       {
           File x = new File("src.txt");
           FileInputStream fis = null;
           fis = new FileInputStream(x);
       }
       catch(FileNotFoundException e)
       {
            System.out.println("File does not exist.");
       }
        
       try
       {
           File src = new File("src.txt");
           File newfile = new File("newfile.txt");
           
           FileReader fr = new FileReader("src.txt");
           FileWriter fw = new FileWriter("newfile.txt");
           
           int ch;
           int counter = 0;
           
           while ((ch = fr.read()) != -1)
           {
               if((char)ch == '\n')
               {
                   fw.write('\r');
                   fw.write('\n');
                   fw.write('\r');
                   fw.write('\n');
               }
               else if((char)ch == ' ')
               {
                   char x = '$';
                   fw.write((int)x);
                   counter++;
               }
               else
               {
                   fw.write(ch);
               }
           }
           
           System.out.println("Before closing files: ");
           System.out.println("src.txt: " + src.length());
           System.out.println("newfile.txt: " + newfile.length());
           
           fr.close();
           fw.close();
           
           System.out.println("After closing files: ");
           System.out.println("src.txt: " + src.length());
           System.out.println("newfile.txt: " + newfile.length());
           System.out.println("Spaces converted to $: " + counter);
       }
       catch(IOException e)
       {
           System.out.println(e.toString());
       }
    }
}