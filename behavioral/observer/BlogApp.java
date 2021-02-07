public class BlogApp {

    public static void main(String[] args) {
        Blog techBlog = new Blog("Java & Microservices 2021", "Saurabh Chaturvedi");

        Subscriber john = new Subscriber("john");
        Subscriber megan = new Subscriber("megan");

        john.subscribeTo(techBlog);
        megan.subscribeTo(techBlog);

        Post post1 = new Post("Kubernetes and Service mesh with Istio");
        techBlog.publish(post1);
        System.out.println();

        megan.unsubscribeFrom(techBlog);
        Post post2 = new Post("How to use Terraform in AWS ?");
        techBlog.publish(post2);
    }
}
