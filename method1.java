class Main
{
  void fullname()
  {
    String firstname="vishwa";
    String lastname="v";
    System.out.print("Your Name is "+firstname+" "+lastname);
  }
  public static void main(String args[])
  {
    Main caller=new Main();
    caller.fullname();
  }
}
