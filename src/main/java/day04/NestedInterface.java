package day04;

class Blogger{
    interface MyBlog{
        void UploadVideo(int id);
    }
}
class NestedInterface implements Blogger.MyBlog{

    @Override
    public void UploadVideo(int id) {
        System.out.println("Uploaded Video ID: " +id);
    }

    public static void main(String[] args) {
        NestedInterface ni = new NestedInterface();
        ni.UploadVideo(2108);
    }
}
