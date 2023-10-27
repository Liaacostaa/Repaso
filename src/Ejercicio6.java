import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorP=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un numero: ");
            int numero = sc.nextInt();
            if (numero>=0) {
                contadorP++;
            }
        }
        if (contadorP>0){
            System.out.println("Hay un total de "+ contadorP + " numeros positivas");
        }else{
            System.out.println("No hay numeros positivos");
        }


    }
}

