import java.io.*;
class Copy
{
    public static void main(String args[])throws Exception
    {
        FileInputStream fin = new FileInputStream("Copy.java");
        FileOutputStream fout = new FileOutputStream("Other.txt");
        int i = 0;
        while ((i = fin.read()) != -1) {
            fout.write((byte)i);
        }
        System.out.println("File successfully copied!");
        fin.close();
        fout.close();
    }
}