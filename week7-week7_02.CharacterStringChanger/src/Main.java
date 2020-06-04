public class Main {
    public static void main(String[] args) {
        // Test your program here
        Changer scanAway = new Changer();
        scanAway.addChange (new Change('ä', 'a'));
        scanAway.addChange (new Change('ö', 'o'));
        System.out.println (scanAway.change("Sinä olet valo sinä olet yö"));
    }
}
