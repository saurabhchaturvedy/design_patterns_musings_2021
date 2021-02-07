import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Blog implements Observable {

    String title;
    String author;
    Stack<Post> posts = new Stack<>();
    List<Observer> observers = new ArrayList<>();

    Blog(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void publish(Post post) {
        posts.push(post);
        notifyObservers();
    }

    public Post getLatestPost() {
        return posts.peek();
    }

    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        if (this.observers.contains(observer)) {
            this.observers.remove(observer);
        }
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
