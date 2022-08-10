package sprint3.Day1.Assignments.Ques1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Address aObj= new Address("sgr", "sgr123");
		Student sObj=new Student(1, "ovee", aObj, "ovee@gmail.com", "ovee123");
		
		//serialization
		File f=new File("student.txt");
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
		os.writeObject(sObj);
		os.close();
		System.out.println("Object is serialized");
		
		//deserialization:
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object deserializedObj= ois.readObject();
		Student deserializedObjOfStudent=(Student) deserializedObj;
		System.out.println("Object is deserialized");
		System.out.println(deserializedObjOfStudent);
	}
}
