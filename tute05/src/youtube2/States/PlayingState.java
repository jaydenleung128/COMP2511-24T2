package youtube2.States;

import youtube2.VideoPlayer;

public class PlayingState implements State {

    private VideoPlayer vp;
    public PlayingState(VideoPlayer vp) {
        this.vp = vp;
    }

    @Override
    public void onLocked() {
       vp.setCurrState(new LockedState(vp));
    }

    @Override
    public void onPlay() {
        vp.setPlaying(false);
        vp.setCurrState(new ReadyState(vp));
    }

    @Override
    public void onNext() {
        vp.goNextVideo();
    }
    
}
