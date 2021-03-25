package esanchez.devel;

import esanchez.devel.entity.EntityA;
import esanchez.devel.entity.EntityB;
import esanchez.devel.test.CastToSuperclass;
import esanchez.devel.test.Optionals;

/**
 * 
 * Main Class that we can use for execute test methods.
 * 
 * @author Enrique Sanchez Jordan
 *
 */
public class Main {

	public static void main(String[] args) {
		
		EntityB b = new EntityB("myParam1", "myParam2", "myParam3");
		
		/*
		 * Test1
		 */
		inheritanceInParam(b);
		
		
		/*
		 * Test2
		 */
		EntityA b2 = inheritanceInParamAndReturn(b);
		
		/*
		 * we can check that b2 is defined as EntityA but we
		 * get an EntityB
		 */
		if (b2 instanceof EntityB) {
			System.out.println("2- It's an EntityB instance");
			
		} else {
			System.out.println("2- It's a different Entity instance");
		}
		
		
		/*
		 * Test3
		 * Test what happen if we return a EntityC or EntityD and we 
		 * try to cast to EntityB that is their superclass
		 */
		CastToSuperclass castToSuperclass = new CastToSuperclass();
		castToSuperclass.execute();
		
		
		/*
		 * Test 4
		 * Test how Optional Wrapper works in Java8
		 */
		Optionals optionals = new Optionals();
		optionals.execute();
	}
	
	
	/*
	 * With this method we can see how we can pass a child class as 
	 * a parameter of a method that expects a superclass in the parameters
	 */
	private static void inheritanceInParam(EntityA entity) {
		
		if (entity instanceof EntityB) {
			System.out.println("It's an EntityB instance");			
		} else {
			System.out.println("It's a different Entity instance");
		}
	}
	
	
	/*
	 * With this method we can see how we can pass a child class as 
	 * a parameter of a method that expects a superclass in the parameters
	 */
	private static EntityA inheritanceInParamAndReturn(EntityA entity) {
		
		if (entity instanceof EntityB) {
			System.out.println("It's an EntityB instance");
			
			return entity;
		} else {
			System.out.println("It's a different Entity instance");
			return entity;
		}
	}
}
