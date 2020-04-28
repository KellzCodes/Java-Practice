public class Droid{
  String name;
  int batteryLevel;
  
  // constructor method
  public Droid(String droidName){
    batteryLevel = 100;
    name = droidName;
  }
  
  // make the droid perform tasks
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }
  
  // print out battery level
  public void energyReport(){
    System.out.println(name + "'s Battery Level = " + batteryLevel);
  }
  
  // transfer energy from one droid to another
  public void energyTransfer(Droid droid, int transfer){
    droid.batteryLevel = droid.batteryLevel + transfer;
    batteryLevel = batteryLevel - transfer;
    System.out.println(name + " has transferred " +  transfer + " percent charge to " + droid.name);
  }
  
  // toString method
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
  
  // main method
  public static void main(String[] args){
    // new droid named Codey
    Droid codey = new Droid("Codey");
    // new droid named margot
    Droid margot = new Droid("Margot");
    // print the variable codey
    System.out.println(codey);
    // print the variable margot
    System.out.println(margot);
    
    // perform some tasks
    codey.performTask("dancing");
    codey.performTask("fetching frisbee");
    codey.performTask("singing");
    //  Energy report
    codey.energyReport();
    // perform some tasks
    margot.performTask("levitating");
    margot.performTask("ice skating");
    // energy report
    margot.energyReport();
    // energy transfer
    margot.energyTransfer(codey, 5);
    // energy report
    margot.energyReport();
  }
}