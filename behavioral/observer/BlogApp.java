public class BlogApp {

    public static void main(String[] args) {
        Blog techBlog = new Blog("Java & Microservices 2021", "Saurabh Chaturvedi");

        Subscriber john = new Subscriber("john");
        Subscriber megan = new Subscriber("megan");

        john.subscribeTo(techBlog);
        megan.subscribeTo(techBlog);

        Post post = new Post("Kubernetes and Service mesh with Istio");
        techBlog.publish(post);
    }
}
