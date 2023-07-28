class Main
  {
public static void main(String args[])
    {
try
  {
//int n=132;
int a[]={12,32,44,43,57,90};
for(int i=0;i<a.length;i++)
{
    if(a[i]%2==0)
    {
System.out.println("even");
    }
    else
    {
throw new Exception();
        
    }
    
}}
  catch(Exception e)
    {
    System.out.println("odd");
  }
  
  }}
  
