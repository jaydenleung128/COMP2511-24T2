package youtube2;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void subscribe(Observable o) {
        o.add(this);
    }

    @Override
    public void update(Observable o) {
        Producer p = (Producer)o;
        Video v = p.getLatestVideo();
        System.out.println(p.getName() + " uploaded " + v.getName());
    }


    public static void main(String[] args) {
        Producer mrBeast = new Producer("Mr Beast");
        Video v = new Video("200 M Subscriber Special", 10, mrBeast);
        User jayden = new User("Jayden");
        User bob = new User("Bob");
        
        jayden.subscribe(mrBeast);
        bob.subscribe(mrBeast);
        
        mrBeast.post(v); 
    }
}
