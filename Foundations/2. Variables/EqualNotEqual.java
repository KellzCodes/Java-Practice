public class EqualNotEqual {
	public static void main(String[] args) { 
    // number of songs in album A  
		int songsA = 9;
    // number of songs in album B
    int songsB = 9;
    // length of album A
    int albumLengthA = 41;
    // length of album B
    int albumLengthB = 53;

    // Declare variable that stores whether the two albums have the same number of songs
    boolean sameNumberOfSongs = songsA == songsB;

    // Declare variable that stores the result of checking whether the two album lengths are not the same
    boolean differentLength = albumLengthA != albumLengthB;
	}
}