package sprint3.Day1.Assignments.Ques4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Address addObj=new Address("jk", "sgr", "sgr112");
		Employee empObj=new Employee(12, "ovee", addObj, "ovee@gmail.com", "ovee112");
		
		File f=new File("emp.txt");
		try {
			if(f.exists()) {
				System.out.println(f+" file exists");
			}else {
				f.createNewFile();			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(empObj);
		os.close();
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object deserializedObj=ois.readObject();
		Employee deserializedEmpObj=(Employee) deserializedObj;
		System.out.println(deserializedEmpObj);
		
		
		
		
	}
}
