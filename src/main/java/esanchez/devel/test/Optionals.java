package esanchez.devel.test;

import java.util.Optional;

import esanchez.devel.entity.EntityA;

/**
 * 
 * Class for test how it works the Java8 Wrapper Optional.
 * Optional is a Wrapper that we can use for indicate that 
 * a method could return an object or a null.
 * 
 * @author Enrique Sanchez Jordan
 *
 */
public class Optionals implements Test {
	
	public void execute() {		 
		
		Optional<EntityA> e1 = getEntityParam(1);
		
		/*
		 * With isPresent() we can be sure that we have received a 
		 * EntityA object in the response. Because if we didn't received it
		 * and try to get it we will get an Exception
		 */
		if (e1.isPresent()) {
			System.out.println(e1.get().getParam1());
		}
		
		Optional<EntityA> e2 = getEntityParam(4);
		
		if (e2.isPresent()) {
			System.out.println(e2.get().getParam1());
		}
	}
	
	public Optional<EntityA> getEntityParam(Integer id) {
		switch (id) {
			case 1: return Optional.of(new EntityA("value1-1", "value2-1"));
			case 2: return Optional.of(new EntityA("value1-2", "value2-2"));
			case 3: return Optional.of(new EntityA("value1-3", "value2-3"));
			default: return Optional.empty();
		}
	}
}
