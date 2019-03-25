package interfaces;

import java.util.ArrayList;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create arraylist of cats and dogs
		ArrayList<Animal> floof = new ArrayList<Animal>();

		// create cat and dog objects and add to 'meow' and 'woof'
		Cat purr = new Cat();
		Dog bark = new Dog();
		floof.add(purr);
		floof.add(bark);

		// make each animal act and display animal's info
		for (Animal a : floof) {
			a.act();
			System.out.println("Animal info: " + a.toString());
		}

		// make all dogs healthy
		for (Animal b : floof) {
			if (bark instanceof Dog) {
				Dog woof = bark;
				woof.vet();
			}
		}
		// kill the last non-friendly cat
		for (int i = floof.size() - 1; i > 0; i--) {
			if (purr instanceof Cat) {
				Cat paw = purr;
				if (paw.returnFriendly() == false) {
					floof.remove(i);
					break;
				}
			}
		}
		
		for(Animal c: floof) {
			System.out.println("Animal info: " + c.toString());
		}

	}

}
