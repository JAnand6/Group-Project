public class Driver {

public static void main(String[] args) {

CuriousBunny curiousBunny = new CuriousBunny("Scorbunny", "White");
HappyPig happyPig = new HappyPig("HappyPig", "Black");
LoudGoose loudGoose = new LoudGoose("Zapdos", "Yellow");
AngryDuck angryDuck = new AngryDuck("Psyduck", "Yellow");

System.out.println();

Animal a1 = new AngryDuck("Psyduck", "Yellow"); 
angryDuck.setName("Psyduck");
System.out.println("New animal's name is: " + angryDuck.getName()); 
angryDuck.setColor("Yellow");

System.out.println("Total alive animals: " + Animal.count);
System.out.println("AngryDuck wants to fight!");
System.out.println("Its Name is " + angryDuck.getName() + " and it's color is " + angryDuck.getColor());
angryDuck.hit();
angryDuck.hit();
System.out.println("Can the angry duck swim?");
angryDuck.swim();
System.out.println("Can the duck fly?");
angryDuck.fly();
System.out.println("Setname");
angryDuck.setName("Captain Duck Dodgers");
System.out.println("Its name is now " + angryDuck.getName());
angryDuck.hit();

System.out.println("Can angryDuck still fly ? ");
angryDuck.fly();
System.out.println("The number of animal still alive: " + Animal.count);
  
angryDuck.getPosition();
angryDuck.teleport();
  
System.out.println();
System.out.println();

System.out.println("LoudGoose wants to fight");
loudGoose.setName("Zapdos");
loudGoose.setColor("Yellow");

System.out.println("Its Name is " + loudGoose.getName() + " and it's color is " + loudGoose.getColor());
loudGoose.hit();
loudGoose.hit();
System.out.println("Can the goose swim?");
loudGoose.swim();
System.out.println("Can the goose fly");
loudGoose.fly();
loudGoose.hit();

System.out.println("Can loudGoose still fly ?");
loudGoose.fly();

loudGoose.getPosition();
loudGoose.teleport();

System.out.println("Total alive animals: " + Animal.count);

System.out.println();
System.out.println();

System.out.println("HappyPig wants to fight");
happyPig.setName("Swinub");
happyPig.setColor("Black");
System.out.println("Its Name is " + happyPig.getName() + " and it's color is " + happyPig.getColor());
happyPig.hit();
happyPig.hit();
                   
System.out.println("Can it still roll? ");
happyPig.roll();
System.out.println("Can it sleep?");
happyPig.sleep();
happyPig.hit();

System.out.println("Can the piggy still roll ?");
happyPig.roll();
                   
System.out.println("Total number of animals that are still alive " + Animal.count);
System.out.println();
System.out.println();

System.out.println("Can the bunny fight ");
curiousBunny.setName("Scorbunny");
curiousBunny.setColor("White");
System.out.println("What is the bunny's name " + curiousBunny.getName() + " and it's colour is  " + curiousBunny.getColor());
curiousBunny.hit();
curiousBunny.hit();
System.out.println("Can the bunny hop ");
curiousBunny.hop();
curiousBunny.hit();

System.out.println("Can CuriousBunny still hop ?");
curiousBunny.hop();
System.out.println("Testing ToString");
System.out.println(curiousBunny.toString());
System.out.println("Total number of animals still alive is : " + Animal.count);

}

}
