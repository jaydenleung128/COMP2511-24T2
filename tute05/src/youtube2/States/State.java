package youtube2.States;

public interface State {
    public void onLocked();
    public void onPlay();
    public void onNext();
}
