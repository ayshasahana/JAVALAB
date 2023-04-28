import java.util.Scanner;

class InvalidUserException extends Exception
{
public InvalidUserException(String msg)
{
super(msg);
}
}

class Exceptions
{
public static void main(String args[])
{
String usr,pwd;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Username: ");
usr = sc.nextLine();
System.out.println("Enter the Password: ");
pwd = sc.nextLine();
		
try
{
if (usr.length()<8)
throw new InvalidUserException("Invalid Username. Username must be of alteast 8 charaters");
else if (!pwd.equals("123aysha"))
throw new InvalidUserException("Invalid Password. Try again!");
else
System.out.println("Login Successful");
}
catch(InvalidUserException e)
{
e.printStackTrace();
}
}
}
