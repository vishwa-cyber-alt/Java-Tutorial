import java.util.Scanner;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        a=sc.nextInt();
         System.out.print("enter b:");
        b=sc.nextInt();
        c=a+b;
        System.out.print(c);
    }
}
