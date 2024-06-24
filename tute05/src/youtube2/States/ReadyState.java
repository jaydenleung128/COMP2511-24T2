package youtube2.States;

import youtube2.VideoPlayer;

public class ReadyState implements State {

    private VideoPlayer vp;
    public ReadyState(VideoPlayer vp) {
        this.vp = vp;
    }
  
    @Override
    public void onLocked() {
       vp.setCurrState(new LockedState(vp));
    }

    @Override
    public void onPlay() {
        vp.setCurrState(new ReadyState(vp));
    }

    @Override
    public void onNext() {
        vp.goNextVideo();
    }
    
}
