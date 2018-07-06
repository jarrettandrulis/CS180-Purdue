import java.util.ArrayList;

/**
 * Class EthernetPlayer
 */

public class EthernetPlayer extends MusicPlayer {

    private int deviceID;
    private int connStatus;

    static final int CONNECTED = 1;
    static final int NOT_CONNECTED = 0;

    private ArrayList<String> downloadList = new ArrayList<String>();

    public EthernetPlayer(int id) {
        super(); // why do we need this?
        deviceID = id;
        connStatus = NOT_CONNECTED;

        downloadList.add("Dark Horse");
        downloadList.add("Royals");
        downloadList.add("Counting Stars");
        downloadList.add("Let Her Go");
        downloadList.add("The Fox");
    }

    /**
     *  @override turnOn and connect
     *
     */
    public void turnOn() {
    	connStatus = CONNECTED;
    	super.turnOn();
    	
    }

    /**
     *  @override turnOff and disconnect
     *
     */
    public void turnOff() {
    	connStatus = NOT_CONNECTED;
    	super.turnOff();
    }


    /**
     *  addTrackToPlaylist: Adds mentioned track to the end of playlist array
     *  print appropriate messages to stdout
     *
     */
    public void addToPlaylist(String trackName) {
    	playlist.add(trackName);
    	System.out.println(String.format("Added %s to playlist",trackName));
    }

    /**
     *  deleteFromPlaylist: deletes track of give name from the playlist
     *  print appropriate messages to stdout
     *
     */
    public void deleteFromPlaylist(String trackName) {
    	playlist.remove(trackName);
    	System.out.println(String.format("Removed %s to playlist",trackName));

    }

    /**
     *  download: Downloads mentioned song from the given Download list and adds to playlist
     *  print appropriate messages to stdout
     *
     */
    public void download(String trackName) {
        //implement this section of code to lookup tracName in the downloadlist and
    	if(!downloadList.contains(trackName)){
    		System.out.println(String.format("Track %s not available to download",trackName));
    		return;
    	}
    		System.out.println(String.format("Downloaded %s",trackName));
    		playlist.add(trackName);

    }

}