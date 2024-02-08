class Main
{
  void fullname()
  {
    String firstname="vishwa";
    String lastname="v";
    System.out.print("Your Name is "+firstname+" "+lastname);
  }
  void info(int age,int date)
  {
    System.out.print("\n your age is "+age);
    System.out.print("\n birth date is "+date);
  }
  public static void main(String args[])
  {
    Main caller=new Main();
    caller.fullname();
    caller.info(21,14);

  }
}
