package scannerClass;

import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) {
		    int age;
		    String name;
		    char gender;
		    long mobile;
		    double cgpa;
		    
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("Enter name : ");
		    name = sc.next();
		    System.out.println("Name is :"+name);

		    System.out.println("----------------------------------------");
		    
		    System.out.println("Enter age :");
		    age= sc.nextInt();
		    System.out.println("number " + age);
		    
		    System.out.println("----------------------------------------");
		    
		    System.out.println("Enter Gender :");
		    gender = sc.next().charAt(0);
		    System.out.println("Gender :"+gender);
		    
		    System.out.println("----------------------------------------");
		    
		    System.out.println("Enter Mobile :");
		    mobile = sc.nextLong();
		    System.out.println("Mobile :"+mobile);
		    
		    System.out.println("----------------------------------------");
		    
		    System.out.println("Enter CGPA :");
		    cgpa = sc.nextDouble();
		    System.out.println("CGPA :"+cgpa);
		    
	}

}
