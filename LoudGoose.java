public class LoudGoose extends WaterFowl //implements Attacker
{

//variable declaration for health and for count of kills    
     int health;
     int getkillCount;
     
public LoudGoose(String a, String b)// constructor for LoudGoose
     
 {
   super();
   this.health = health;
   this.getkillCount = getkillCount;
   
   Animal loudGoose = new Animal(); //object creation for Animal
   
   loudGoose.setName(a);
   
   loudGoose.setColor(b);
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
   
 
 public void getPosition()
{

     int x = 0;
     int y = 500;
     int z = 1000;

     System.out.print(getName() + " is now at position X = ");
     int pos1 = (int)(Math.random() * (z - y + 1) + y);
     System.out.print(pos1 + " and ");
     int pos2 = (int)(Math.random() * (z - x + 1) + x);
     System.out.println("Y = " + pos2);

}
 
 public void teleport()
{

     System.out.println(getName() + " is teleporting");

}
      
}
