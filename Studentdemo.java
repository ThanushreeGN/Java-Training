package project3;
import java.util.Scanner;
public class Studentdemo {
	
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
	        Marks m= new Marks();
	        m.readDetails();
	        m.readMarks();
	        m.displayDetails();
	        m.displayMarks();
	     
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


