package esanchez.devel.test;

import esanchez.devel.entity.EntityA;
import esanchez.devel.entity.EntityB;
import esanchez.devel.entity.EntityC;

/**
 * Test what happen if we return a EntityC or EntityD and we
 * try to cast to EntityB that is their superclass
 * 
 * @author Enrique Sanchez Jordan
 */
public class CastToSuperclass implements Test {

	public void execute() {
		
		EntityA entity = getEntity();
		
		if (entity instanceof EntityB) {
			/*
			 * We can see that the code enter in this block
			 * unless the Entity that we return in getEntity is 
			 * EntityC
			 */
			System.out.println("Is EntityB");
			
			/*
			 * The cast to EntityB works
			 */
			EntityB entityB = (EntityB) entity;
			System.out.println("Param3 of entityB: " + entityB.getParam3());
		} else {
			System.out.println("Is other Entity");
		}
		
	}
	
	private EntityA getEntity() {
		EntityC entityC = new EntityC("myParam1", "myParam2", "myParam3");
		return entityC;
	}
}
