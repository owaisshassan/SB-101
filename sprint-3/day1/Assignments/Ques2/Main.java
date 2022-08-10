package sprint3.Day1.Assignments.Ques2;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Employee eObj=new Employee("ovee", "10-08-2000", "software", "Bangalore", 100000);
		
		File f=new File("OutObject.txt");
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
		os.writeObject(eObj);
		os.close();
		System.out.println("Object is serialized");
		
		//deserialization:
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object deserializedObj= ois.readObject();
		Employee deserializedObjOfStudent=(Employee) deserializedObj;
		System.out.println("Object is deserialized");
		System.out.println(deserializedObjOfStudent);
		
	}
}
