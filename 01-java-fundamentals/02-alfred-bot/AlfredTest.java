public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();
        System.out.println(alfredBot.basicGreeting());
        System.out.println(alfredBot.guestGreeting("Beth Kane", "evening"));
        System.out.println(alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats."));
        System.out.println(alfredBot.respondBeforeAlexis("Alfred I can't find my yo-yo. Maybe Alfred will know where it is.)"));
        System.out.println(alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing.)"));
        System.out.println(alfredBot.dateAnnouncement());
    }
}
