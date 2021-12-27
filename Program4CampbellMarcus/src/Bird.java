
public class Bird extends Animal{
	private int flySpeed;
	
	public Bird() {
		setType("bird");
		flySpeed = getWalkSpeed() * 4;
	}
	public String getMove() {
		return "flies " + flySpeed;
	}
	public String getSkin() {
		return "feathers";
	}
}
