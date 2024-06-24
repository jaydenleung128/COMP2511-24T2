package youtube2;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Observable {
    private String name;
    private List<Observer> subscribers;
    private List<Video> videos;
    
    
    public Producer(String name) {
        this.name = name;
        subscribers = new ArrayList<>();
        videos = new ArrayList<>();
    }
    
    @Override
    public void add(Observer v) {
        subscribers.add(v);
    }

    @Override
    public void remove(Observer v) {
        subscribers.remove(v);
    }

    @Override
    public void notifyObservers() {
        for (Observer v: subscribers) {
            v.update(this);
        }
    }

    public void post(Video v) {
        videos.add(v);
        notifyObservers();
    }

    public Video getLatestVideo() {
        return videos.get(videos.size() - 1);
    }

    public String getName() {
        return name;
    }
}
