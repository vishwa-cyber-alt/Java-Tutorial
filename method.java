public class One{
void print()
{
System.out.print("welcome");
}
void sub(int a,int b)
{
int c=a-b;
System.out.print("sub="+c);
}
public static void main(String args[])
{
One caller=new One();
caller.print();
caller.print();
caller.sub(60,54);
}
}








