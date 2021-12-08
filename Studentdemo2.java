package project3;
import java.util.Scanner;
public class Studentdemo2 {
	
	    int studentID;
	    String studentName;
	    String phone;
	    Scanner sc=new Scanner(System.in);
	    void readDetails() {
	        System.out.println("enter student id ");
	        studentID=sc.nextInt();
	        System.out.println("enter student name ");
	        studentName=sc.next();
	        System.out.println("enter student phn ");
	        phone=sc.next();
	    }
	    void displayDetails() {
	        System.out.println(" student id is: "+studentID);
	        System.out.println(" student name is: "+studentName);
	        System.out.println(" student phone is: "+phone);
	        
	    }
	    public static void main(String a[]) {
	        Result m= new Result();
	        m.readDetails();
	        m.readMarks();
	        m.calculateResult();
	        m.displayDetails();
	        m.displayMarks();
	        m.displayResult();
	     
	}
	}
	class Marks extends Student{
	    int m1;
	    int m2;
	    int m3;
	    
	    void readMarks()
	 {
	        System.out.println("enter marks1 ");
	        m1=sc.nextInt();
	        System.out.println("enter marks2 ");
	        m2=sc.nextInt();
	        System.out.println("enter marks3 ");
	        m3=sc.nextInt();
	    }
	    void displayMarks() {
	        System.out.println(" marks1 is: "+m1);
	        System.out.println("  marks2 is: "+m2);
	        System.out.println("  marks3 is: "+m3);
	        
	    }
	}

	class Result extends Marks{
	    int totalMarks;
	    float percentage;
	    String grade;
	    void calculateResult() {
	        totalMarks=m1+m2+m3;
	        percentage=((totalMarks/300)*100);
	        if(percentage>80 && percentage<=100) {
	            grade="first class";
	        }
	        else if(percentage>60 && percentage<=80) {
	            grade="second class";
	        }
	        else if(percentage>35 && percentage<=60) {
	            grade="third class";
	        }
	        else if(percentage<=35){
	            grade="fail";
	        }
	        
	    }
	    void displayResult() {
	        System.out.println(" total marks is: "+totalMarks);
	        System.out.println(" percentage is: "+percentage);
	        System.out.println(" grade is: "+grade);
	    }
	}


