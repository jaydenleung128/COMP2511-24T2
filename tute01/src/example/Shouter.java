package example;

public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        // NOTE: You don't have to use the keyword `this`
        // But I use it because of clarity
        return this.message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public String toString() {
        return String.format("Shouter message = %s", this.message);
    }

    public void printMe() {
        System.out.println(this.message);
    }

    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public void printAndShout() {
        // NOTE: You don't have to use the keyword `this`
        // But I use it because of clarity
        this.printMe();
        this.shout();
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("This is my message");
        s.printMe();
        s.shout();
        // When printing objects, Java will try and stringify
        // In this case, it calls the .toString() method
        System.out.println(s);
    }
}