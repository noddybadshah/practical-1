import java.io.*;

class StudentData
{
    public static void main(String args[])throws IOException
    {
    String name;
    int rno;
    double per;
    FileWriter fw=new FileWriter("StudentID.txt", true); 
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("Enter Student Roll number: "); 
    rno=Integer.parseInt(br.readLine());
    System.out.print("Enter Student name: ");
    name=br.readLine();
    System.out.print("Enter Student Percentage: "); 
    per=Double.parseDouble(br.readLine());
    
    fw.write("\nRoll Number = "+rno);
    fw.write("\r\n");
    fw.write("\nName = "+name);
    fw.write("\r\n");
    fw.write("\nPercentage = "+per);
    fw.write("\r\n");
    System.out.println("\nData entered in file sucessfully!!!");
    br.close();
    fw.close();
    }
}