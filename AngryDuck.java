public class AngryDuck extends WaterFowl
{
     
     //variable declaration for health and for count of kills
     int health;
     int getkillCount;
     
     public AngryDuck(String a, String b) // constructor for AngryDuck
     {
          super();
          
          Animal angryDuck = new Animal();// object creation of animal class
          
          angryDuck.setName(a);
          
          angryDuck.setColor(b);
          
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
     
     
     public void getPosition()
     {

          int x = 0;
          int y = 500;
          int z = 1000;

          System.out.print(getName() + " is now at position X = ");
          int pos1 = (int)(Math.random() * (y - x + 1) + x);
          System.out.print(pos1 + " and ");
          int pos2 = (int)(Math.random() * (z - x + 1) + x);
          System.out.println("Y = " + pos2);

     }


     public void teleport()
     {

           System.out.println(getName() + " is teleporting");

     }
     
}   




