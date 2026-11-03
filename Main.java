public class Main {
  public static void main(String[] args) {
        
      int apples = 4;
      double pizzas = 8.5;
      double partyPizzas;

      partyPizzas = pizzas+2;
      partyPizzas = partyPizzas - 2;
      partyPizzas +=2;
      partyPizzas ++;

      int people = 7;
      double myPizza = partyPizzas/people;

      boolean atePizza = true;

      String name = "Eric cartman";
      String isDoing = " is eating: "; 

      if(atePizza){
        System.out.println(name + isDoing + (int)myPizza + " pizza");
      }else {
        System.out.println(name + " is not eating any pizza");
      }
      


  }  
}