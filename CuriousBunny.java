public class CuriousBunny extends Animal
{
     
 public CuriousBunny(String a, String b)
 {
   Animal curiousBunny = new Animal();
   
   curiousBunny.setName(a);
   
   curiousBunny.setColor(b);
   System.out.println(curiousBunny);
 }
     
   public void hop()
   {
     System.out.println(getName() + " is hopping");
   }
   
}
