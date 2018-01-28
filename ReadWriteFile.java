/*
 * Name: Jorge Cabrera
 * Class: CSC270
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
	
	private Scanner x;
	private int numberOfStudents;
	private Student[] myclass =new Student[20];
	
	/*
	 * Method to open the txt file 
	 */
	public void openFile() {
		try {
			//Scanner looks for the file in the directory
			//may need to change "src/input.txt" to where the file is located
			x=new Scanner(new File("src/input.txt"));
		}
		catch (Exception e) {
			//if file is not found, print "Could not find file"
			System.out.println("Could not find file!");
		}
		
	}
	
	
	public void readFile() {

		numberOfStudents=x.nextInt();
		//loop for parsing the data in the file
		for (int i=0; i<numberOfStudents; i++) {
			String a=x.next();
			String b=x.next();
			int c=x.nextInt();
			int d=x.nextInt();
			int e=x.nextInt();
			int f=x.nextInt();
			
			myclass[i]=new Student();
			myclass[i].set(a, b, c, d, e, f, 0, 'x');
			myclass[i]=new Student(a, b, c, d, e, f);
				
			System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.2f\t %s\n",myclass[i].getID(), myclass[i].getName(), myclass[i].getQuiz1(), myclass[i].getQuiz2(), myclass[i].getMidterm(), myclass[i].getFinalexam(), myclass[i].getAvg(), myclass[i].getGrade());
		}
		
	}
	
	
	public void writeFile() {
		
	    FileWriter fw= null;
	    File file =null;
	    try {
	        file=new File("output.txt");
	        if(!file.exists()) {
	            file.createNewFile();
	        }
	        fw = new FileWriter(file);
	        
	        fw.write("ID\t"
        			+"Name\t"
        			+"Quiz1\t"
        			+"Quiz2\t"
        			+"Midterm\t"
        			+"Final\t"
        			+"Avg.\t"
        			+"Grade");

	        fw.write("\r\n"); //write to a new line
	        
	        for (int i=0; i<numberOfStudents; i++) {
	        
	        	fw.write(myclass[i].getID()+"\t"
	        			+myclass[i].getName()+"\t"
	        			+myclass[i].getQuiz1()+"\t"
	        			+myclass[i].getQuiz2()+"\t"
	        			+myclass[i].getMidterm()+"\t"
	        			+myclass[i].getFinalexam()+"\t"
	        			+myclass[i].getAvg()+"\t"
	        			+myclass[i].getGrade());
	        	fw.write("\r\n"); //write to a new line
	        }
	        fw.write("\r\n");
	        fw.write("Created By Jorge Cabrera");

	        fw.flush();
	        fw.close(); //closes the fw
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    //print the location of the the output file
	    System.out.printf("The output file is located at %s%n", file.getAbsolutePath());
	}
	
	public void closeFile() {
		x.close();
	}
	
}
