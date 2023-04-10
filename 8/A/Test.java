import java.io.*;
class Test
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fin = new FileInputStream("Test.java");
        int i = 0;
        while ((i = fin.read()) != -1) {
            System.out.print((char)i);
        }
        fin.close();
    }
}
