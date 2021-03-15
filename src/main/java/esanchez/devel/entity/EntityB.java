package esanchez.devel.entity;

/**
 * 
 * This is the child class that extends from EntityA
 * 
 * @author Enrique Sanchez Jordan
 *
 */
public class EntityB extends EntityA {

	private String param3;
	
	public EntityB(String param1, String param2, String param3) {
		super(param1, param2);
		this.param3 = param3;
	}
	
	public String getParam3() {
		return this.param3;
	}
}
