package collections;

import java.time.*;
import java.util.*;

public class CollectionStream {

	public static void main(String[] args) {
		List<Person> persons = createSampleData();
		double avg = persons
		.stream()
		.filter(p -> p.getName().contains("person"))
		.filter(p -> p.getGender() == Person.Sex.FEMALE)
		.mapToInt(Person :: getAge)
		.average()
		.getAsDouble();
		System.out.println(avg);
	}
	
	public static List<Person> createSampleData() {
		Person person1 = new Person("person1", LocalDate.of(1990, 5, 2), Person.Sex.FEMALE);
		Person person2 = new Person("person2", LocalDate.of(1995, 7, 12), Person.Sex.MALE);
		Person person3 = new Person("person3", LocalDate.of(1999, 12, 22), Person.Sex.FEMALE);
		Person person4 = new Person("person4", LocalDate.of(1985, 1, 6), Person.Sex.MALE);
		Person person5 = new Person("person5", LocalDate.of(1977, 10, 28), Person.Sex.FEMALE);
		List<Person> persons = new ArrayList<Person>();
		persons.add(person5);
		persons.add(person4);
		persons.add(person3);
		persons.add(person2);
		persons.add(person1);
		return persons;
	}
}

class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    
    Person(String name, LocalDate birthday, Sex gender) {
    	this.name = name;
    	this.birthday = birthday;
    	this.gender = gender;
    }

    public int getAge() {
    	Date cur = new Date();
    	LocalDate currentDate = cur.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    	return Period.between(birthday, currentDate).getYears();
    }

    public String getName() {
        return name;
    }
    
    public Sex getGender() {
    	return gender;
    }
}