import java.util.*;
class Student
{
int roll;
String name;
int mth;
int chem;
int phy;
int eng;
int res;
int back;

Scanner in = new Scanner(System.in);

public void getInfo()
{
System.out.println("enter the name and roll no. :");
name = in.next();
roll = in.nextInt();

System.out.println("enter the marks  for each subject (maximum marks 100)");
mth = in.nextInt();
chem = in.nextInt();
phy = in.nextInt();
eng = in.nextInt();

System.out.println("Enter the no. of the backlogs   ");
back = in.nextInt();


}


public void per()
{
int add= mth+chem+phy+eng;
res=add/4;

System.out.println("the result of the student is ="+res+"%");
}
public void reco()
{
if (mth>=40 && chem>=40 && phy>=40 && eng>=40 && back==0 && res>=60)
{
System.out.println (name+" is recommended to the company");


}
else
{
System.out.println (name+" is not recommended to the company");
}
}
}

public class Main
{
public static void main (String[]args)
{
Scanner in = new Scanner(System.in);

System.out.println("enter the number of Student in database");
int n = in.nextInt();

ArrayList<Student> al = new ArrayList<Student>();

for(int i=1; i<=n; i++)
{
Student s = new Student();
s.getInfo();
s.per();
s.reco();
al.add(s);
}
}
}
