package project3;
import java.util.Scanner;
public class Student {
	
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
	        System.out.println("single inheritance");
	        Marks m1=new Marks();
	        m1.readDetails();
	        m1.readMarks();
	        m1.displayDetails();
	        m1.displayMarks();
	        System.out.println("multilevel inheritance");
	        Result m= new Result();
	        m.readDetails();
	        m.readMarks();
	        m.calculateResult();
	        m.displayDetails();
	        m.displayMarks();
	        m.displayResult();
	        System.out.println("heirachical inheritance");
	        MPCMarks a1=new MPCMarks();
	        a1.readDetails();
	        a1.readMPCMarks();
	        a1.displayDetails();
	        a1.displayMPCMarks();
	        CECMarks a2=new CECMarks();
	        a2.readDetails();
	        a2.readCECMarks();
	        a2.displayDetails();
	        a2.displayCECMarks();
	        
	     
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
	    int percentage;
	    String grade;
	    void calculateResult() {
	        totalMarks=m1+m2+m3;
	        percentage=(totalMarks*100)/300;
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

	class MPCMarks extends Student{
	    int mathMarks;
	    int physicsMarks;
	    int chemistryMarks;
	    void readMPCMarks() {
	        System.out.println("enter  mathMarks ");
	        mathMarks=sc.nextInt();
	        System.out.println("enter physicsMarks ");
	        physicsMarks=sc.nextInt();
	        System.out.println("enter chemistryMarks ");
	        chemistryMarks=sc.nextInt();
	        
	    }
	    void displayMPCMarks() {
	        System.out.println(" mathMarks is: "+mathMarks);
	        System.out.println("  physicsMarks is: "+physicsMarks);
	        System.out.println("  chemistryMarks is: "+chemistryMarks);
	    }
	}

	class CECMarks extends Student{
	    int commerceMarks;
	    int economicsMarks;
	    int CmcsMarks;
	    void readCECMarks() {
	        System.out.println("enter  commerceMarks ");
	        commerceMarks=sc.nextInt();
	        System.out.println("enter economicsMarks ");
	        economicsMarks=sc.nextInt();
	        System.out.println("enter CmcsMarks ");
	        CmcsMarks=sc.nextInt();
	        
	    }
	    void displayCECMarks() {
	        System.out.println(" commerceMarks is: "+commerceMarks);
	        System.out.println("  economicsMarks is: "+economicsMarks);
	        System.out.println("  CmcsMarks is: "+CmcsMarks);
	    }
	}



