public class LoudGoose extends WaterFowl implements Attacker
{

public void getPosition()
{

     int x = 0;
     int y = 500;
     int z = 1000;

     System.out.print(getName() + " is now at position ");
     int pos1 = (int)(Math.random() * (z - y + 1) + y);
     System.out.print(pos1 + ", ");
     int pos2 = (int)(Math.random() * (z - x + 1) + x);
     System.out.print(pos2);

}
 
 public void teleport()
{

     System.out.println(getName() + " is teleporting");

}
 
//variable declaration for health and for count of kills    
     int health;
     int getkillCount;
     
public LoudGoose()// constructor for LoudGoose
     
 {
   super();
   this.health = health;
   this.getkillCount = getkillCount;
   
   Animal loudGoose = new Animal(); //object creation for Animal
   
   loudGoose.setName("LoudGoose");
   
   loudGoose.setColor("Grey");
   System.out.println(loudGoose);
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
          
            if(!(animalloudGoose) && health > 0 )
          {
               if(goalOfHealth==1)
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
