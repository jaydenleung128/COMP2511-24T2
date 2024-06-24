package youtube2;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import youtube2.States.PlayingState;
import youtube2.States.ReadyState;
import youtube2.States.State;

// Please note that this code is incomplete and might not function properly
// The main takeaway for this code is to understand how to implement the State Pattern - how states transition to another state
public class VideoPlayer {
    private State currState = new ReadyState(this); 
    private List<Video> playlist = new ArrayList<>();
    private boolean playing = false;
    public int currVideo = 0;

    public VideoPlayer(List<Video> playlist) {
        this.playlist = playlist;
    }

    public void onLocked() {
        currState.onLocked();
    }

    public void onPlay() {
        currState.onPlay();
    }

    public void onNext() {
        currState.onNext();
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public Video goNextVideo() {
        if (currVideo >= playlist.size()) return null;
        currVideo++;
        return playlist.get(currVideo);
    }
    
    public Video getCurrVideo() {
        return playlist.get(currVideo);
    }

    public State getCurrState() {
        return currState;
    }

    public void setCurrState(State currState) {
        this.currState = currState;
    }

    public static void main(String[] args) {
        List<Video> playlist = new ArrayList<>();
        Producer mrBeast = new Producer("MrBeast");
        playlist.add(new Video("100m sub video", 10, mrBeast));
        playlist.add(new Video("200m sub video", 10, mrBeast));

        VideoPlayer videoPlayer = new VideoPlayer(playlist);
        videoPlayer.onPlay();
        videoPlayer.onPlay();
    }

}
