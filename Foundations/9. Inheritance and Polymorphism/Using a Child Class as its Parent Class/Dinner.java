class Dinner {
  
  private void makeNoodles(Noodle noodle, String sauce) {
    
    noodle.cook();
    
    System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
    System.out.println("Dinner is served!");
    
  }
  
  public static void main(String[] args) {
    
    Dinner noodlesDinner = new Dinner();
    // Add your code here:
    Noodle biangBiang = new BiangBiang();
    noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
    
  }
  
}