import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name, String dayPeriod) {
        return "Good" + dayPeriod+ ",  "+name+". Lovely to see you!";
    }
    public String dateAnnouncement() {
        Date today = new Date();
        Calendar calender = Calendar.getInstance();
        calender.setTime(today);
        int hour = calender.get(Calendar.HOUR_OF_DAY);
        System.out.println();
        return " The hour is " +hour;
    }
    public String respondBeforeAlexis(String conversation) {
        int alfred = conversation.indexOf("Alfred");
        int alexis = conversation.indexOf("Alexis");
        if(alfred >=0){
            System.out.println(alfred);
            return "At your service. As you wish, naturally.";
        }
        if(alexis >=0){
            return "Right, away, sir. She certainly isn't sophisticated enough for that.";
        }
        else{
            return "Right. And with that I shall retire.";
        }
    }
    // NINJA BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}