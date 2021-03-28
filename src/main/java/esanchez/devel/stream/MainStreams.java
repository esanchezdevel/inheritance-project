package esanchez.devel.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import esanchez.devel.entity.Person;

/**
 * Tests with Lists and Streams
 * 
 * @author Enrique Sanchez Jordan
 *
 */
public class MainStreams {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		Person p1 = new Person("Mark", 12);
		Person p2 = new Person("Peter", 10);
		Person p3 = new Person("Susan", 13);
		
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		
		/*
		 * Sort List ASC using stream in base of age parameter of Person object
		 */
		System.out.println("Ordering list...");
        persons.stream()
        	.sorted(Comparator.comparingInt(Person::getAge))
        	.collect(Collectors.toList())
        	.forEach(p -> System.out.println(p.toString()));
        System.out.println("finish...");
        
        System.out.println();
        
		/*
		 * Sort List DESC using stream in base of age parameter of Person object
		 */
		System.out.println("Ordering list...");
        persons.stream()
        	.sorted(Comparator.comparingInt(Person::getAge).reversed())
        	.collect(Collectors.toList())
        	.forEach(p -> System.out.println(p.toString()));
        System.out.println("finish...");
	}
}
