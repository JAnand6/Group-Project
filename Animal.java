public class Animal 
{
  public String name;
  public String color;
  public int health;
  public static int count = 0;
  
  public Animal()
  {
   int health = 3;
  }
  
  public Animal(String name, String color, int health)
  {
    this.name = name;
    this.color = color;
    this.health = health;
  }
  
  public void hit()
  {
    health = 3;
   // for(health = 3; health >=0; health--)
    if (health > 0)
    {
      System.out.println("The animal is alive");
      count ++;
    }
    else
    {
      System.out.println("The animal is dead");
      count--;
    }
   }
 
  public String getName()
  {
    return this.name;
  }
  
  public String getColor()
  {
    return this.color;
  }
  
  public void setName(String newName)
  {
    name = newName;
  }
  
  public void setColor(String newColor)
  {
    this.color = newColor;
  }
  
  public String toString()
  {
    return "The name of the animal is " +name+ ", the color of the " +name+ " is " +color;
  }
}
