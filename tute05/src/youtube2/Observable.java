package youtube2;

public interface Observable {
    public void add(Observer v);
    public void remove(Observer v);
    public void notifyObservers();
}
