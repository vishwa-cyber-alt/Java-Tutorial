import java.util.Scanner;
class Login
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter password:");
String a=sc.nextLine();
System.out.print("Enter COnfirm  password:");
String b=sc.nextLine();
if(a.equals(b))
{
    System.out.println("login success");
    
    System.out.println("Welcome "+a);
}
else{System.out.println("try again");
}
}
}
