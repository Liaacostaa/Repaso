import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        for (int i = 1; i <=numero ; i++) {
            System.out.println(i);
        }
    }
}
