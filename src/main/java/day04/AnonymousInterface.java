package day04;

interface AnonymousInterface {
    void eat();
}
class InnerClass{
    public static void main(String[] args) {
        AnonymousInterface ai = new AnonymousInterface(){
            public void eat(){
                System.out.println("Nice Food");
            }
        };
        ai.eat();
    }
}
