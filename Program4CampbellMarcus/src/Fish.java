public class Fish extends Animal{
	private int swimSpeed;
	
	public Fish() {
		setType("fish");
		swimSpeed = getWalkSpeed()/4;
	}
	public String getMove() {
		return "swims " + swimSpeed;
	}
	public String getSkin() {
		return "scales";
	}
}
