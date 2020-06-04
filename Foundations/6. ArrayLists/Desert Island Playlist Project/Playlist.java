import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    // creating playlist
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    
    // adding songs to playlist
    desertIslandPlaylist.add("Beyonce - Sugar Mama");
    desertIslandPlaylist.add("Kenny Lattimore - For You");
    desertIslandPlaylist.add("Jennifer Hudson - No One Gonna Love You");
    desertIslandPlaylist.add("Usher - Superstar");
    desertIslandPlaylist.add("T-Pain - Buy U a Drank");
    desertIslandPlaylist.add("Brandy - Have You Ever");
    desertIslandPlaylist.add("Erykah Badu - Tyrone");
    desertIslandPlaylist.add("SWV - Rain");
    desertIslandPlaylist.add("Jay-Z - Song Cry");
    desertIslandPlaylist.add("Jill Scott - The Way");
    
    // printing playlist
    // System.out.println(desertIslandPlaylist);
    
    // checking playlist size
    // System.out.println(desertIslandPlaylist.size());
    
    // removing songs
    desertIslandPlaylist.remove("Brandy - Have You Ever");
    desertIslandPlaylist.remove("Erykah Badu - Tyrone");
    desertIslandPlaylist.remove("Jay-Z - Song Cry");
    desertIslandPlaylist.remove("SWV - Rain");
    desertIslandPlaylist.remove("Usher - Superstar");
    
    // System.out.println(desertIslandPlaylist);
    
    // swapping songs
    int indexA = desertIslandPlaylist.indexOf("Beyonce - Sugar Mama");
    int indexB = desertIslandPlaylist.indexOf("Kenny Lattimore - For You");
    
    String tempA = "Dionne Farris - Hopeless";
    
    desertIslandPlaylist.set(indexA, "Rihanna - Needed Me");
    // System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    
  }
  
}