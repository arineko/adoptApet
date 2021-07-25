import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(final String[] args) throws InterruptedException  {

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Hello, welcome to the ANIMAL ADOPTION program!");
			System.out.println("PRESS ENTER to proceed.");

			scan.nextLine(); 

			try {
				System.out.println("First, type the number of the animal you want to adopt: \n"
						+ "1 - A DOG.   \n"
						+ "2 - A CAT. \n"
						+ "3 - A FISH.");

				int chosenNumber = scan.nextInt();

				switch(chosenNumber) {

				case 1:
					System.out.println("So you want to adopt a dog, huh?");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("That's awesome! PRESS ENTER TO BEGIN!");

					scan.nextLine(); //prompts user to press ENTER
					scan.nextLine(); // for some reason I needed two of these here!

					System.out.println("Let's go ahead and choose a name for your dog, shall we?");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("This name is going to be registered at the moment of adoption.");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("Write the dog's name now: ");

					String name = scan.nextLine();		

					System.out.println("Now, go ahead and choose " + name + "'s breed. "
							+ "Type the corresponding number for the breed you'd like: \n"
							+ "1 - POODLE. \n"
							+ "2 - HUSKY. \n"
							+ "3 - RETRIEVER \n"
							+ "4 - I don't care about any breed! I'll take any dog who needs love!");

					int numeroRaca = scan.nextInt();

					switch(numeroRaca) { 
					case 1:
						dog c1 = new dog(name, "Poodle");
						c1.bark();
						break;

					case 2: 
						dog c2 = new dog(name, "Husky");
						c2.bark();
						break;

					case 3: 
						dog c3 = new dog(name, "Retriever");
						c3.bark();
						break;

					case 4:
						System.out.println("Awwww!! You've just made our day!");
						TimeUnit.SECONDS.sleep(1);
						System.out.println("We need more humans like you! <3 <3");

						TimeUnit.SECONDS.sleep(1);
						System.out.println("<3");
						TimeUnit.SECONDS.sleep(1);
						System.out.println("<3");
						TimeUnit.SECONDS.sleep(1);
						dog c4 = new dog(name, "BLANK");
						c4.bark();
						break;

					default:
						System.out.println("You didn't write a proper value!");
						TimeUnit.SECONDS.sleep(1);
						System.out.println("And now this program is done.");
						TimeUnit.SECONDS.sleep(1);
						System.out.println("Bye!");
						System.exit(0);
					}
					scan.nextLine();
					break;

				case 2:
					System.out.println("So you want to adopt a cat, huh?");
					System.out.println("That's awesome! PRESS ENTER TO BEGIN!");

					scan.nextLine(); //prompts user to press ENTER
					scan.nextLine(); // for some reason I needed two of these here!

					System.out.println("Let's go ahead and choose a name for your cat, meow we?");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("I mean, shall we?");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("This name is going to be registered at the moment of adoption.");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("Write the cat's name now: ");

					String name1 = scan.nextLine();

					System.out.println("Now type the cat's size: \n"
							+ "Type the corresponding letter for the size you'd like: \n"
							+ "S - SMALL. \n"
							+ "M - MEDIUM. \n"
							+ "B - BIG \n"
							+ "V - VERY BIG! No discriminations");

					char size = scan.next().charAt(0);

					System.out.println("Finally, choose you cat's color! Write the color you wish: ");
					String color1 = scan.nextLine();
					scan.nextLine();
					cat g1 = new cat(name1, size, color1);
					TimeUnit.SECONDS.sleep(1);
					g1.meows();
					break;

				case 3:
					System.out.println("So you want to adopt a fish, huh?");
					System.out.println("That's awesome!");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("And a little rare!");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("PRESS ENTER TO BEGIN!");

					scan.nextLine(); //prompts user to press ENTER
					scan.nextLine(); // for some reason I needed two of these here!

					System.out.println("Let's go ahead and choose a name for your fish!");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("This name is going to be registered at the moment of adoption.");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Write the fish's name now: ");
					String name2 = scan.nextLine();
					System.out.println("Now write (in letters of course!) the color you wish to adopt.");
					String color2 = scan.nextLine();
					System.out.println("The color you wrote is " + color2);
					System.out.println("And finally, write what kind of fish you would like - from the sea, or from the aquarium.");
					String habitat = scan.nextLine();
					fish f1 = new fish(name2, color2, habitat);
					f1.swims();
					break;

				default:
					System.out.println("You didn't write a proper value!");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("And now this program is done.");
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Bye!");
					System.exit(0);
				}

			} catch (InputMismatchException e) {
				System.out.println("You must only type one of the selecter numbers!");
				System.out.println("But now this program is done.");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Bye!");
				System.exit(0);
			}
			System.out.println("Congratulations! You've successfully adopted a pet!");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("I mean, we're going to let you know as soon as we find the perfect one for you!");
			TimeUnit.SECONDS.sleep(2);

			//Adopter registering

			System.out.println("Finally, type your name, e-mail address and phone number so we can reach you ASAP!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("First, type your name now: ");
			String adopterName = scan.nextLine();
			adopterName.toUpperCase();
			System.out.println("Ok, " + adopterName + ". Thank you!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Now type your e-mail address: ");
			String emailAddress = scan.nextLine();
			if(!emailAddress.contains("@")) {
				System.out.println("You must write a valid e-mail address. \n"
						+ "We didn't see any '@' in your input!");
				System.out.println("But now this program is done.");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Bye!");
				System.exit(0);
			}
			System.out.println("Ok, " + adopterName + ". Your registered email address was " + emailAddress);
			TimeUnit.SECONDS.sleep(1);
			System.out.println("And finally,");
			TimeUnit.SECONDS.sleep(1);
			System.out.println(" type your phone number: ");

			long phoneNumber = scan.nextInt();

			adopter a1 = new adopter(adopterName, emailAddress, phoneNumber);

			a1.showData();
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Thank you very much for your interest in adopting.");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Best of wishes.");
			System.exit(0);

		}
	}
}




	
	
	
