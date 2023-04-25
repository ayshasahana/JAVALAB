import java.util.Scanner;
public class Matrix{
public static void main(String args[])
{

int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("1st row of matrix:");
int a=sc.nextInt();
System.out.println("2nd column of matrix:");
int b=sc.nextInt();


int[][] mat1=new int[a][b];
int[][] mat2=new int[a][b];
int[][] summat=new int[a][b];
System.out.println("enter the first matrix:");

for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
mat1[i][j]=sc.nextInt();
}
}
 
System.out.println("enter the second matrix:");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
mat2[i][j]=sc.nextInt();
}
}

//for addition
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
summat[i][j]=mat1[i][j]+mat2[i][j];
}
}

System.out.println("sum of two matrix:");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.print(summat[i][j]+"\t");
}
System.out.println();

}
}
}


