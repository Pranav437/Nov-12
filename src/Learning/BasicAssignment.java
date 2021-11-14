package Learning;

public class BasicAssignment {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.calculate("Hello", 1, 4);

    }
}
class Sum {
    public void calculate(String s, int a, int b){
char [] c = s.toCharArray();
for (int i = a; i<=b; i++){
    System.out.print(c[i]);
}
    }
}