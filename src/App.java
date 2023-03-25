public class App {
    public static void main(String[] args) {
        int init = 1;
        int end = 9;
        for(int i=init; i<=end; i++){
            String res = "";
            for(int j=1; j<=i; j++){
                res += i;
            }
            System.out.println(res);
        }
    }
}
