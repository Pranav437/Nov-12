public class Demo {
    public static void main(String[] args) {
        Father father = new Father();
        father.parent();
        System.out.println(father.b);
        father = new Son();
        ((Son) father).dave();
        System.out.println(((Son) father).a);
        System.out.println(father.b);
        father = new Daughter();
//      ((Son) father).dave();
        ((Daughter)father).Anne();
        father = new Spouse();
        ((Spouse)father).stella();

    }
}

    class Father {
    int b = 10;
    public void parent() {

            System.out.println("Hello");
        }
    }
    class Son extends Father {
    int a = 5;
        public void dave() {System.out.println("Good Morning"); }
    }

        class Daughter extends Father {
            public void Anne() {
                System.out.println("Good afternoon");
            }
        }

        class Spouse extends Father {
            public void stella() {
                System.out.println("Good evening");
            }
        }

