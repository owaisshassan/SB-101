package sprint3.Day1.We.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;  //00001111010011 -> to a file
import java.io.Serializable;
//ObjectOutputStream:
//java obj --convert-->to 000100011010 or to a file
public class _1Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serialization:
		A obj= new A();
		FileOutputStream fos=new FileOutputStream("E://abc.txt");
		ObjectOutputStream os= new ObjectOutputStream(fos);
		os.writeObject(obj);
		os.writeObject("String Obj");
		os.close();
		System.out.println("object is serialized");
		
		//deserialization:
		FileInputStream fis=new FileInputStream("E://abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object deserializedObj=ois.readObject();
		A deserializedObjOfA=(A) deserializedObj;
		System.out.println("Object is deserialized");
		System.out.println(deserializedObjOfA);  //A [i=10, x=here]
		System.out.println(deserializedObjOfA.i);  //10
		System.out.println(deserializedObjOfA.x);  //here
		System.out.println(deserializedObjOfA.email); //null ->default value String
		System.out.println(deserializedObjOfA.j);   //0   ->default value of int
		System.out.println(deserializedObjOfA.xBool); //false ->default value of boolean
	}
}

class A implements Serializable{
	int i=10;
	String x="here";
	transient String email="abc@gmail.com";   //if u don't want to serialize: make it transient
	transient int j=20; 				//don't serialize: make it transient
	transient boolean xBool=true;		//don't serialize: make it transient
	@Override
	public String toString() {
		return "A [i=" + i + ", x=" + x + "]";
	}
	
	
}