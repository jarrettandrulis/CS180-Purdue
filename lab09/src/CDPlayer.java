import java.util.ArrayList;

/**
 * Class CDPlayer
 */
public class CDPlayer extends MusicPlayer {

    private int deviceID;
    private int thisTrack;

    /**
     * Constructor for CD-Player
     */
    public CDPlayer(int id) {
    	deviceID = id;
    }

    /**
     * Over-ride Method: turnOn
     */
    public void turnOn() {
    	thisTrack = 0;
    	super.turnOn();
    }

    /**
     * Over-ride Method: turnOff
     */
    public void turnOff() {
    	thisTrack = 0;
    	super.turnOff();
    }

    /**
     * Method to play next track in the playlist by
     * printing it to stdout and changing current
     */
    public void nextTrack() {
    	thisTrack ++;
    	if(thisTrack == playlist.size())
    		thisTrack = 0;
    	play(thisTrack);

    }

    /**
     * Method to play previous track in the playlist by
     * printing it to stdout and changing current
     */
    public void previousTrack() {
    	thisTrack --;
    	if(thisTrack == 0)
    		thisTrack = playlist.size()-1;
    	play(thisTrack);

    }

    /**
     * Method to play current track
     */
    public void play() {
    	super.play(thisTrack);
    }

}
