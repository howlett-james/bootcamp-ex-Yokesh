package day02;

public class Blogger {
    public void createVideo(){
        System.out.println("Video Created");
    }
    private boolean upload(){
        return true;
    }
    private void deleteVideo(String videoID){
        System.out.println("Deleted Video: " +videoID);
    }
    public String shareVideo(){
        return "Facebook";
    }

    public static void main(String[] args) {
        Blogger blogger = new Blogger();
        blogger.createVideo();
        System.out.println(blogger.upload());
        System.out.println(blogger.shareVideo());
        blogger.deleteVideo("eee001");
    }
}
