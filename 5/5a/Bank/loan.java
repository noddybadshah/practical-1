import java.util.*;
class Bank
{
  int cid, pa, lt;
  Scanner in= new Scanner(System.in);
  void read()
 {
   System.out.print("Enter customer ID: ");
   cid = in.nextInt();
   System.out.print("Enter principal amount: ");
   pa = in.nextInt();
   System.out.print("Enter loan type: ");
   lt = in.nextInt();
 }
 void display()
 {
   System.out.println("\nCustomer ID = " + cid);
   System.out.println("Principal amount = " + pa);
   System.out.println("Loan type = " + lt);
 }
}

class SI extends Bank
{
 void cal()
 {
   if(lt==1)
   {
     double s= pa * 7 * 10 / 100;
     System.out.println("Simple interest for car loan = " + s);
   }
   else
   {
     double s=pa * 7 * 15 / 100;
     System.out.println("Simple interest for personal loan = " + s);
   }
 }
}

class loan
{
 public static void main(String arg[])
 {
  SI obj = new SI();
  obj.read();
  obj.display();
  obj.cal();
 }
}