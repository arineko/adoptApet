import java.util.concurrent.TimeUnit;

public class cat extends animal {

	private char size;
	private String color;
	
	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public cat(String name, char size, String color) {
		animal.name = getName();
		this.size = getSize();
		this.color = getColor();
		String catInfo = ("The cat's name is '" + name + "' and its size is " + size + " and its color is " + color);
		System.out.println(catInfo);
	}
		

	public void meows() throws InterruptedException {
		System.out.println("Awwwww! It looks like your cat is trying to say something!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Meow!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Meow!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Meooooooooooooooow!");
		TimeUnit.SECONDS.sleep(1);
	}

	
}
