package sprint3.Evaluation.Ques2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		StudentDB sDB= new StudentDB();
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			System.out.println("Enter details for Student "+(i+1));
//			System.out.println("Enter student ID:");
//			int id=sc.nextInt();
//			System.out.println("Enter Student Name:");
//			String name=sc.next();
//			System.out.println("Enter Student Address:");
//			String addr=sc.next();
//			System.out.println("Enter Email:");
//			String sEmail=sc.next();
//			System.out.println("Enter pass:");
//			String pswd=sc.next();
//			Student s=new Student(id, name, addr, sEmail, pswd);
//			
//			sDB.addStudent(s);
//		}
//		
//		File f=new File("dataBase.txt");
//		
//		FileOutputStream fos = new FileOutputStream(f);
//		ObjectOutputStream os=new ObjectOutputStream(fos);
//		os.writeObject(sDB);
//		os.close();
//		
//		
//		FileInputStream fis=new FileInputStream(f);
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		Object dObj=ois.readObject();
//		Student dObjStu=(Student) dObj;
//		System.out.println(dObjStu);
		
		  Scanner sc=new Scanner(System.in);
	       

	        StudentDB sd=new StudentDB();
	        for(int i=0;i<5;i++){
	        	System.out.println("Enter details for Student "+(i+1));
	            System.out.println("Enter Id:");
	            int id=sc.nextInt();
	            System.out.println("Enter Name:");
	            sc.nextLine();
	            String name=sc.nextLine();
	            System.out.println("Enter Address:");
	            String address=sc.nextLine();
	            System.out.println("Enter Email:");
	            String mail=sc.nextLine();
	            System.out.println("Enter Pass:");
	            String pswd=sc.nextLine();

	            Student student=new Student(id,name,address,mail,pswd);
	            sd.addStudent(student);
	        }

	        try{
	            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dataBase.txt"));
	            oos.writeObject(sd.studentsData);
	        }catch (IOException e){
	            e.printStackTrace();
	        }

	        try{
	            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("dataBase.txt"));
	            LinkedHashSet<Student> sl=(LinkedHashSet<Student>) ois.readObject();
	            for (Student sdd:sl){
	                System.out.println(sl);
	            }
	        }catch (IOException e){
	            e.printStackTrace();
	        }catch (ClassNotFoundException e){
	            e.printStackTrace();
	        }



	}
}
