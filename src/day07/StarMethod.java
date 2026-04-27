package day07;

public class StarMethod {
    static void triangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void mirrorTraingle(int n) {
        for (int i = 1; i <= n; i++) {
            //print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangle(6);
        mirrorTraingle(5);
    }
}
