import java.util.*;
interface  Student
{
int score=96;
void displayScore();
}
interface Sports
{
int score=45;
void displaySportsScore();
}

class Result implements Student,Sports
{
public void displayScore()
{
System.out.println("Academic Score:"+Student.score);
}
public void displaySportsScore()
{
System.out.println("Sports Score:"+Sports.score);
}
}
class SportsStudent
{
public static void main(String[]args)
{
System.out.println("ACADAMIC AND SPORTS SCORE");
System.out.println("--------------------------");
Result r=new Result();
r.displayScore();
r.displaySportsScore();
}
}
