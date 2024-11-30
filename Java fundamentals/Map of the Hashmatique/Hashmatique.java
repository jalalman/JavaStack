import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Paradise ", "When she was just a girl\r\n" + //
                        "She expected the world\r\n" + //
                        "But it flew away from her reach\r\n" + //
                        "So she ran away in her sleep");
        trackList.put("Human","Maybe I'm foolish\r\n" + //
                        "Maybe I'm blind\r\n" + //
                        "Thinking I can see through this\r\n" + //
                        "And see what's behind\r\n" + //
                        "Got no way to prove it\r\n" + //
                        "So maybe I'm blind\r\n" + //
                        "But I'm only human after all\r\n" + //
                        "I'm only human after all\r\n" + //
                        "Don't put your blame on me\r\n" + //
                        "Don't put your blame on me");
        trackList.put("Love Me Again","Know I've done wrong, left your heart torn\r\n" + //
                        "Is that what devils do?\r\n" + //
                        "Took you so low, where only fools go\r\n" + //
                        "I shook the angel in you");
        trackList.put("Titanium" , "I'm bulletproof, nothing to lose\r\n" + //
                        "Fire away, fire away\r\n" + //
                        "Ricochet, you take your aim\r\n" + //
                        "Fire away, fire away");
        System.out.println(trackList.get("Human"));
        System.out.println("#---------------------- Tracks : Lyrics ----------------------#");
        for (String track : trackList.keySet()) {  
            System.out.printf("#---------------------- %s ----------------------# \n\n",track);
            System.out.println("Track: ");
            System.out.println(track);
            System.out.println("Lyrics: ");
            System.out.println(trackList.get(track));
            System.out.println("#----------------------------------------------------------#");
        }

        

    }
}