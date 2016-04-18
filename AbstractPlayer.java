public abstract class AbstractPlayer {
    protected Play playBehavior;

    /**
     * Whenever a class is constructed, the playing behavior is set
     */
    public AbstractPlayer() {
        this.setPlayBehavior(this.createPlayBehavior());
    }

    /**
     * This method forces the sub classes to set a play behavior
     * @return Play
     */
    protected abstract Play createPlayBehavior();

    /**
     * Sets a new play behavior
     * @param behavior the behavior to set
     */
    public void setPlayBehavior(Play behavior) {
        this.playBehavior = behavior;
    }

    /**
     * Play the music using the playBehavior.
     * Each behavior implements the play method and each behavior has its own way of playing the music
     */
    public void play() {
        this.playBehavior.play();
    }

    /**
     * Stops the music from playing
     */
    public void stop() {
        System.out.format("No music is playing from %s\n", this.getClass().getSimpleName());
    }
}
