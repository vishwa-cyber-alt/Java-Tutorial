abstract class One
{
    abstract void print();
}
class emp extends One{
void print()
{
    String name="vishwa";
    int id=34;
    System.out.println(name);
    System.out.println(id);
}
}
class Base
{
    	public static void main(String args[]) 
{
    One o=new emp();
    o.print();
}
}
