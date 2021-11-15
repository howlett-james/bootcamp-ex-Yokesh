package day02;

public class MyBlog extends Blogger{
    public static void main(String[] args) {
        Blogger blog = new Blogger();
        blog.createVideo();
        System.out.println(blog.shareVideo());
    }
}
