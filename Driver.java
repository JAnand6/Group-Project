public class Driver {

public static void main(String[] args) {

CuriousBunny curiousBunny = new CuriousBunny("Scorbunny", "white");
HappyPig happyPig = new HappyPig("Swinub", "brown");
LoudGoose loudGoose = new LoudGoose("Zapdos", "Yellow");
AngryDuck angryDuck = new AngryDuck("Psyduck", "Yellow");


Animal a1 = new AngryDuck("www", "Yes"); 
System.out.println("new animal's name is: " + a1.getName()); 

System.out.println("Total alive animals: " + Animal.count);
System.out.println("AngryDuck wants to fight!");
System.out.println("Its Name is " + angryDuck.getName() + " and it's " + angryDuck.getColor());
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
  
  
angryduck.teleport(); 
System.out.println("What is the position of the Duck?" + angryduck.getposition());
  
System.out.println();
System.out.println();

System.out.println("LoudGoose wants to fight");
System.out.println("Its Name is " + loudGoose.getName() + " and it's " + loudGoose.getColor());
loudGoose.hit();
loudGoose.hit();
System.out.println("Can the goose swim?");
loudGoose.swim();
System.out.println("Can the goose fly");
loudGoose.fly();
loudGoose.hit();

System.out.println("Can loudGoose still fly ?");
loudGoose.fly();
System.out.println("Total alive animals: " + Animal.count);
System.out.println();
System.out.println();

System.out.println("HappyPig wants to fight");
System.out.println("Its Name is " + happyPig.getName() + " and it's " + happyPig.getColor());
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
