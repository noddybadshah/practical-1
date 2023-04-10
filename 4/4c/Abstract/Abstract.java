import java.util.*;
abstract class figure
{
  int dim1, dim2;
  double area1;
  figure(int a, int b)
  {dim1=a; dim2=b;}
  abstract void area();
}

class triangle extends figure
{
  triangle(int a, int b)
  {super(a, b);}
  void area()
  {area1=0.5*dim1*dim2;}
  void show()
  {System.out.println("Area of triangle = " + area1);}
}

class rectangle extends figure
{
  rectangle(int m, int n)
  {super(m, n);}
  void area()
  {area1=dim1*dim2;}
  void show()
  {System.out.println("Area of rectangle = " + area1);}
}

class Abstract
{
  public static void main(String arg[])
  {
    triangle t=new triangle(5, 10);
    t.area(); 
    t.show();
    rectangle r=new rectangle(5, 10);
    r.area(); 
    r.show();
  }
}