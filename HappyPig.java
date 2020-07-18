public class HappyPig extends Animal
{
     
 public HappyPig()
 {
   Animal happyPig = new Animal();
   
   happyPig.setName("HappyPig");
   
   happyPig.setColor("Black");
   System.out.println(happyPig);
 }

   public void sleep()
   {
     System.out.println(getName() + " is sleeping");
   }
   
   public void roll()
   {
     System.out.println(getName() + " is rolling");
   }
   
}
