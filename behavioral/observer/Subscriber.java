
public class Subscriber implements Observer {

    String name;
    Blog blog;

    Subscriber(String name) {
        this.name = name;
    }


    public void subscribeTo(Blog blog) {
        blog.attachObserver(this);
        this.blog = blog;
    }

    public void unsubscribeFrom(Blog blog) {
        blog.detachObserver(this);
        this.blog = null;
        System.out.println(this.name+" You have successfully unsubscribed from our blog updates, you won't get any mails now !");
    }


    @Override
    public void update() {

        if (this.blog == null) {
            System.out.println("Not yet subscribed...");
            return;
        } else {
            Post latestPost = this.blog.getLatestPost();
            System.out.println("Hey ! " + this.name + "," + blog.author + " has published a new post in the blog " + blog.title + " : " + latestPost.name);
        }

    }
}
