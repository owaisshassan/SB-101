package sprint1evaluation.Ques3;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {

	//wildcards are unknown values.
	//a lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type.
    //A lower bounded wildcard is expressed using the wildcard character
     
    public static void addCat(List<? super Cat> catList) {
        catList.add(new RedCat());
        System.out.println("Cat Added");
    }

    public static void main(String[] args) {
        List<Animal> animalList= new ArrayList<Animal>();
        List<Cat> catList= new ArrayList<Cat>();
        List<RedCat> redCatList= new ArrayList<RedCat>();
        List<Dog> dogList= new ArrayList<Dog>();
        addCat(animalList);
        addCat(catList);
    }
}
class Animal {}
class Cat extends Animal {}
class RedCat extends Cat {}
class Dog extends Animal {}

