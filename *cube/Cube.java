import java.util.Scanner;
class Cube
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int num = sc.nextInt();
for(int i=1;i<=num;i++)
{
System.out.println("cube of " +i+ " is : " + (i*i*i));
}
}
}