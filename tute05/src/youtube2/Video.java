package youtube2;

public class Video {
    private String name;
    private int length;
    private Producer producer;
    
    public Video(String name, int length, Producer producer) {
        this.name = name;
        this.length = length;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }
    
    public int getLength() {
        return length;
    }

    public Producer getProducer() {
        return producer;
    }
}
