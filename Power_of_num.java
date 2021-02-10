
class Main
{
  public static void main (String[]args)
  {
    System.out.println (power(2,2));
  }




  public static int power (int x,int y)
  {
     return (y == 0)?1:x*power(x,y-1);
  }
}
