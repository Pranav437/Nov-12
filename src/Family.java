public class Family {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.parent();
        System.out.println(boy.a);
        boy.Mike();
        }
}
class Dad {

    int a = 5;
    public void parent(){
        System.out.println("Hello");
    }
    private void bee(){
        System.out.println("Hello");
    }
}
class Boy extends Dad{
    public void Mike(){
        System.out.println("Good Morning");
    }
}
class Girl extends Dad{
    public void Jessie(){
        System.out.println("Good afternoon");
    }
}
class Wife extends Dad{
    public void Mary(){
        System.out.println("Good evening");
    }
}
