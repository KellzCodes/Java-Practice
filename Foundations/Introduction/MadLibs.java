public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Kelli
  Date: 4/20/2020
  */
  	public static void main(String[] args){
      // main character
      String name1 = "Kelli";
      // three adjectives
      String adjective1 = "tiny";
      String adjective2 = "young";
      String adjective3 = "pale";
      // verb
      String verb1 = "jump";
      // six nouns
      String noun1 = "mouse";
      String noun2 = "glass";
      String noun3 = "monitor";
      String noun4 = "chair";
      String noun5 = "lamp";
      String noun6 = "drawer";
      // Another character
      String name2 = "Kimi";
      // one number
      int number = 5;
      // one place
      String place1 = "Trenton";

      //The template for the story
      String story = "This morning "+ name1 + " woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      // Print the story
      System.out.println(story);
    }       
}
