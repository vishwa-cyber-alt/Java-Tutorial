class Main
  {
static void check(int n)
    {
try
  {
//int n=132;
    if(n%2==0)
    {
System.out.println("even");
    }
    else{
throw new Exception();}}
  catch(Exception e)
    {
    System.out.println("odd");
  }
  
  }
  public static void main(String args[])
  {
      check(13);
      check(22);
      check(98);
  }
}
