import java.util.concurrent.TimeUnit;

public class dog extends animal {
	
	
  public dog(String name, String breed) {
		animal.name = getName();
		this.breed = getBreed();
		String dogInfo = ("The dog's name is '" + name + "' and its breed is " + breed + ".");
		System.out.println(dogInfo);
	}
	
	public void bark() throws InterruptedException {
		System.out.println("Whoa! It looks like your dog wants to thank you!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Woof!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Woof!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Woof!");
		TimeUnit.SECONDS.sleep(1);
	}

}
