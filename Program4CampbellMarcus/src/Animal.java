import javax.swing.JOptionPane;

public class Animal {
	private int walkSpeed;
	private String type;
	
	//default Constructor
	public Animal() {
		String s = JOptionPane.showInputDialog(null, "What is the walkSpeed of the animal?");
		int walkSpeed = Integer.parseInt(s);
		setWalkSpeed(walkSpeed);
		
		setType("animal");
	}
	
	//setters
	public void setWalkSpeed(int walkSpeed) {
		this.walkSpeed = walkSpeed;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	//getters
	public String getMove() {
		return "walks " + walkSpeed;
	}
	public String getSkin() {
		return "an epidermis";
	}
	public String getMessage() {
		return "The " + type +" has " + getSkin() + " and " + getMove(); 
	}
	public int getWalkSpeed() {
		return walkSpeed;
	}
}
