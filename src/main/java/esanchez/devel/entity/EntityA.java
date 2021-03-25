package esanchez.devel.entity;

/**
 * 
 * This is the superclass
 * 
 * @author Enrique Sanchez Jordan
 *
 */
public class EntityA {

	protected String param1;
	protected String param2;
	
	public EntityA(String param1, String param2) {
		this.param1 = param1;
		this.param2 = param2;
	}

	public String getParam1() {
		return param1;
	}

	public String getParam2() {
		return param2;
	}
}
