/*
 * Name: Jorge Cabrera
 * Class: CSC270
 */


public class Student {
	//private variables for student constructor
	private String studentID;
	private String name;
	private int quiz1;
	private int quiz2;
	private int midterm;
	private int finalexam;
	private double avg;
	private char grade;
	
	
	public Student ()
	{
		studentID = "na";
		name = "na";
		quiz1 = 0;
		quiz2 = 0;
		midterm = 0;
		finalexam = 0;
		avg = 0.0;
		grade = 'a';
		
		
	}
	
	public Student (String id, String n, int q1, int q2, int m, int f)
	{
		studentID = id;
		name = n;
		quiz1 = q1;
		quiz2 = q2;
		midterm = m;
		finalexam = f;
	}
	public Student (String id, String n, int q1, int q2, int m, int f, double a, char letterGrade)
	{
		studentID = id;
		name = n;
		quiz1 = q1;
		quiz2 = q2;
		midterm = m;
		finalexam = f;
		avg = a;
		grade = letterGrade;
	}
	
	public void set(String id, String n, int q1, int q2, int m, int f, double a, char c)
	{
		studentID = id;
		name = n;
		quiz1 = q1;
		quiz2 = q2;
		midterm = m;
		finalexam = f;
		avg = a;
		grade = c;
	}
	
	
	/*
	 * Method to calculate the student's average grade  
	 */
	public void calcAvg()
	{
		avg = (quiz1*10.0*.125) + (quiz2*10.0*.125) + (midterm*.25) + (finalexam*.50);
	}
	
	
	/*
	 * Method to assign a letter grade
	 */
	public void calcGrade()
	{
		if(avg >= 90){
			grade = 'A';
		}else if(avg < 90 && avg >= 80 ){
			grade = 'B';
		}else if(avg < 80 && avg >= 70 ){
			grade = 'C';
		}else if(avg < 70 && avg >= 60 ){
			grade = 'D';
		}else{
			grade = 'F';
		}
	}
	
	public String getID()
	{
		return studentID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getQuiz1()
	{
		return quiz1;
	}
	
	public int getQuiz2()
	{
		return quiz2;
	}
	
	public int getMidterm()
	{
		return midterm;
	}
	
	public int getFinalexam()
	{
		return finalexam;
	}
	
	
	public double getAvg()
	{
		calcAvg();
		return avg;
	}
	
	public char getGrade()
	{
		calcGrade();
		return grade;
	}
	
	public static void main(String [] args) {
		ReadWriteFile r;
		r = new ReadWriteFile();
		r.openFile();
		r.readFile();
		r.closeFile();
		r.writeFile();
		
	}
	
}