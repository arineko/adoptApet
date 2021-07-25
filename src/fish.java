
public class fish extends animal{

private String habitat;
private String color;
 
	public String getHabitat() {
	return habitat;
	}

	public void setHabitat(String habitat) {
	this.habitat = habitat;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public fish(String name, String color, String habitat) {
		animal.name = getName();
		this.color = getColor();
		this.habitat = getHabitat();
		String fishInfo = ("The fish's name is " + name + " and its color is " + color + " and its habitat is " + habitat);
		System.out.println(fishInfo);
	}

	public void swims() {
		System.out.println("Gloob gloob!");
	}

	
}
