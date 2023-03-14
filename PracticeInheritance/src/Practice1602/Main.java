package Practice1602;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Dog dog = new Dog("White & Black", 7.2); Cat cat = new Cat("Yellow", 20);
		 * 
		 * dog.setName("Huskey"); dog.setDate(2); dog.setSex("Dog"); dog.displayInfor();
		 * 
		 * cat.setName("Ragdoll"); cat.setDate(4.5); cat.setSex("Queen");
		 * cat.displayInfor();
		 */
		
		Animal dog = new Dog("White & Black", 7.2);
		Animal cat = new Cat("Yellow", 20);
		
		dog.setName("Huskey"); 
		dog.setDate(2); 
		dog.setSex("Dog");
		dog.animalInfo();
	
		cat.setName("Ragdoll"); 
		cat.setDate(4.5); 
		cat.setSex("Queen");
		cat.animalInfo();
	}
}
