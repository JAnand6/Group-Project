public class CuriousBunny extends Animal
{
     
 public CuriousBunny()
 {
   Animal curiousBunny = new Animal();
   
   curiousBunny.setName("CuriousBunny");
   
   curiousBunny.setColor("Pink");
   System.out.println(curiousBunny);
 }
     
   public void hop()
   {
     System.out.println(getName() + " is hopping");
   }
   
}
