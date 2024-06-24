package youtube2.States;

import javax.management.RuntimeErrorException;

import youtube2.VideoPlayer;

public class LockedState implements State {

    private VideoPlayer vp;
    public LockedState(VideoPlayer vp) {
        this.vp = vp;
    }

    @Override
    public void onLocked() {
        if (vp.isPlaying()) {
            vp.setCurrState(new PlayingState(vp));
        } else {
            vp.setCurrState(new ReadyState(vp));
        }
    }

    @Override
    public void onPlay() {
        throw new RuntimeErrorException(null, "Locked");
    }

    @Override
    public void onNext() {
        throw new RuntimeErrorException(null, "Locked");
    }
    
}
