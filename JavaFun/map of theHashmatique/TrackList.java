import java.util.*;
public class TrackList{
	public static void main(String[] args){
	HashMap<String, String> trackList = new HashMap<String, String>();
	trackList.put("Memories","Heres to the ones that we got");
	trackList.put("girls like you","Spent 24 hours, I need more hours with you");
	trackList.put("In Ann","ahda kolo bayn bl m7na");
	trackList.put("ayayay","He's so psycho One day I woke up on the street");
	
	  for (String key : trackList.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
        }
	
	}
}