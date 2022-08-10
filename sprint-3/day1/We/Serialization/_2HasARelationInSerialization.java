package sprint3.Day1.We.Serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _2HasARelationInSerialization {

	public static void main(String[] args) throws IOException {
		Dog dog=new Dog();
		FileOutputStream fos=new FileOutputStream("E://abc.txt");
		ObjectOutputStream os= new ObjectOutputStream(fos);
		//has a / composition:
		os.writeObject(dog);
		
		//is a/ inheritance:
		Parent p=new Parent();
		Child c=new Child();
		os.writeObject(p);
		os.writeObject(c);
		
		os.flush();
		os.close();
	}
}

class Dog implements Serializable{
	Cat cat=new Cat();
}
class Cat implements Serializable{
	Mouse mouse=new Mouse();
}
//NotSerializableExcpetion: Make the cat class not implement Serializable:
//class Cat{    
//	Mouse mouse=new Mouse();
//}

class Mouse implements Serializable{
	
}

//parent-child serialization:
class Parent implements Serializable{
	int age=40;
}
class Child extends Parent{
	int height=180;
}