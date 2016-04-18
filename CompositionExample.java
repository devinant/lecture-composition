public class CompositionExample {
    public static void main(String[] args) {
        System.out.println("Old fashioned record player:");
        // Lets play some sound through the record player
        RecordPlayer recordPlayer = new RecordPlayer();
        recordPlayer.play();

        /* Lets assume that the record player is a newer
        model. It has support for headphones */
        recordPlayer.setPlayBehavior(new Headphones());

        recordPlayer.play();
        recordPlayer.stop();

        System.out.println("A ordinary iPhone:");

        // We can do the same for the phone
        PhonePlayer phonePlayer = new PhonePlayer();
        phonePlayer.play();

        // Lets play the music through the speakers of the phone
        phonePlayer.setPlayBehavior(new Speakers());
        phonePlayer.play();

        // We can also play through blutooth
        phonePlayer.setPlayBehavior(new Blutooth());
        phonePlayer.play();
        phonePlayer.stop();
    }
}
