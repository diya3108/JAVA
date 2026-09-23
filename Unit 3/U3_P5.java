import java.io.*;

public class U3_P5
{
   static void readFile() throws IOException
   {
    FileReader file = new FileReader("diya_notes.txt");
    BufferedReader br = new BufferedReader(file);
    System.out.println(br.readLine());
   }
    
    public static void main(String[] args)
    {
        try
        {
            readFile();
        }
        catch(IOException e)
        {
            System.out.println("Caller handled file error for Diya: " + e.getMessage());
        }
    }
}