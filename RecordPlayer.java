public class RecordPlayer extends AbstractPlayer {
    @Override
    protected Play createPlayBehavior() {
        return new Speakers();
    }
}
