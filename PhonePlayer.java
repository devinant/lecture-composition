public class PhonePlayer extends AbstractPlayer {
    @Override
    protected Play createPlayBehavior() {
        return new Headphones();
    }
}
