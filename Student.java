class Student
{
	String name;
	float progmarks;
	float logicmarks;
	char grade;
	Student()
	{
		name=null;
		progmarks=0.0;
		logicmarks=0.0;
		grade=null;
	}
	Student(String nm,float pm,float lm,char g)
        {
                name=nm;
                progmarks=pm;
                logicmarks=lm;
                grade=g;
        }
	boolean isStronger(Student a, Student b)
	{
		if(a.progmarks>b.progmarks)
		{
			if(a.logic>b.logic)
			else if
	}
}

class StudentTest
{
	public static void main(String Args[])
	{
		Student s1 = new Student("Swastik",94,95,'A');
		Student s2 = new Student("Palak",89,85,'B');
		boolean i=s1.isStronger(s1,s2);
		if(i==true)
			System.out.println("Student 1 has done better.");
		else
			System.out.println("Student 2 has done better.");
	}
}

