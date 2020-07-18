public class AngryDuck extends Waterfowl implements Attacker
{
     //variable declaration for health and for count of kills
     int health;
     int getkillCount;
     
     public AngryDuck(int heath, int killCount) // constructor for AngryDuck
     {
          super();
          this.health = health;
          this.getkillCount = getkillCount;
          
          Animal angryDuck = new Animal();// object creation of animal class
          
          angryDuck.setName("AngryDuck");
          
          angryDuck.setColor("White");
          
          System.out.println(angryDuck);
     }
     
     // method to get health
     public int gethealth()
     {
          return health;
          
     }
     
     // method to set health
     public void sethealth()
     {
          this.health =health;
          
     }
     
     // method attack with boolean to check the condition for attck
     public boolean attack(Animal animal)
     {
          int goalOfHealth = animal.gethealth();
          
          if(!(animal angryDuck) && health > 0 )
          {
               if(goalOfHealth==1)// if only one health left "condition"
               {
                    this.getkillCount++;
                    
                    // setting the health after getting a kill point
                    ((Attacker)animal).sethealth(goalOfHealth);
                    System.out.println("The attack is done " + animal.getClass() + animal.setName() + "The number of count are" + this.getkillCount());
                    return true;
                    
               }
               
               else
               {
                    System.out.println("The attack is not done done " + animal.getClass() + animal.setName());
                    return false;
                    
                    
               }  
               
               
          }
          
          
     }
}   




