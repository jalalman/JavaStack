import java.util.Calendar;
import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {

        return String.format("Hello, %s. Lovely to see you ",name);
    }

    public String dateAnnouncement() {
        Date date= new Date();
        String currentDate= date.toString();

        return String.format("Its currently %S",currentDate);
    }

    public String respondBeforeAlexis(String conversation) {
        String respond;
        if (conversation.indexOf("Alexis") != -1){
            respond= "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (conversation.indexOf("Alfred") != -1){
            respond = "At your service. As you wish, naturally.";
        }
        else {
            respond ="Right. And with that I shall retire.";
        }

        return respond;
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
        public String guestGreeting(String name,String nullString){
            String timeName;
            int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
            if ( currentHour <12){
                timeName="Morning";
            }
            else if( currentHour>=12 && currentHour < 17){
                timeName="Afternoon";
            }
            else{
                timeName="Evening";
            }
            return String.format("Hello %s,Good %s. Lovley to see you ", name,timeName);
        }
}
